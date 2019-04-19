package com.target.product.processor;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.target.product.beans.CurrentPrice;
import com.target.product.beans.GenericResponse;
import com.target.product.beans.PriceTable;
import com.target.product.beans.ProductResponse;
import com.target.product.client.PricingClient;
import com.target.product.client.TargetProductClient;
import com.target.product.client.pojo.PricingResponse;
import com.target.product.client.pojo.ProductPojo;
import com.target.product.util.ProductConstants;

@Component
public class ProductProcessor {

	@Autowired
	private TargetProductClient productClient;

	@Autowired
	private PricingClient pricingClient;
	
	private static Gson gson;

	@PostConstruct
	public void initIt() throws Exception {
		gson = new Gson();
	}

	public GenericResponse<ProductResponse> productInfo(Integer productId) {
		GenericResponse<ProductResponse> response = new GenericResponse<ProductResponse>();

		try {
			PricingResponse priceResp = pricingClient.getProductPrice(productId);
			ProductPojo prdResp = productClient.getProductInfo(15117729);
			if (null != priceResp && null != prdResp) {
				ProductResponse productResponse = new ProductResponse();
				productResponse.setId(productId);

				CurrentPrice priceCurr = new CurrentPrice();
				priceCurr.setCurrencyCode(priceResp.getResponseBody().getCurrency());
				priceCurr.setValue(priceResp.getResponseBody().getPrice().floatValue());
				productResponse.setName(prdResp.getProduct().getItem().getProductDescription().getTitle());
				productResponse.setCurrentPrice(priceCurr);
				response.setResponseBody(productResponse);
				response.setResponseCode(HttpStatus.OK);
				response.setResponseMessage(com.target.product.util.ResponseMsg.SUCCESS.toString());

			} else if (null == prdResp) {
				response.setResponseCode(HttpStatus.BAD_REQUEST);
				response.setResponseMessage(com.target.product.util.ResponseMsg.FAILURE.toString());
				List<String> errors = new ArrayList<String>();
				errors.add(ProductConstants.INVALID_PRODUCT_INFO);
				response.setErrors(errors);
			} else if (null == priceResp) {
				response.setResponseCode(HttpStatus.BAD_REQUEST);
				response.setResponseMessage(com.target.product.util.ResponseMsg.FAILURE.toString());
				List<String> errors = new ArrayList<String>();
				errors.add(ProductConstants.INVALID_PRICING_INFO);
				response.setErrors(errors);
			}

		} catch (Exception e) {
			response.setResponseCode(HttpStatus.SERVICE_UNAVAILABLE);
			response.setResponseMessage(com.target.product.util.ResponseMsg.FAILURE.toString());
			List<String> errors = new ArrayList<String>();
			errors.add(e.getMessage());
			response.setErrors(errors);
		}
		return response;
	}

	public GenericResponse<ProductResponse> productAddUpdatePrice(Integer productId, String priceInfo) {
		GenericResponse<ProductResponse> response = new GenericResponse<ProductResponse>();
		PriceTable priceReq = null;
		try{
			priceReq = gson.fromJson(priceInfo,	PriceTable.class);
			priceReq.setProductId(productId);
			
			
		}catch(Exception e){
			response.setResponseCode(HttpStatus.BAD_REQUEST);
			response.setResponseMessage(com.target.product.util.ResponseMsg.FAILURE.toString());
			List<String> errors = new ArrayList<String>();
			errors.add(e.getMessage());
			response.setErrors(errors);
			return response;
		}
		
		try{
			pricingClient.postProductPrice(productId, priceReq);
			response.setResponseCode(HttpStatus.OK);
			response.setResponseMessage(com.target.product.util.ResponseMsg.SUCCESS.toString());
			return response;
		}catch(Exception e){
			response.setResponseCode(HttpStatus.SERVICE_UNAVAILABLE);
			response.setResponseMessage(com.target.product.util.ResponseMsg.FAILURE.toString());
			List<String> errors = new ArrayList<String>();
			errors.add(e.getMessage());
			response.setErrors(errors);
		}
		return response;
	}

}
