package com.target.product.client;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.target.product.beans.PriceTable;
import com.target.product.client.pojo.PricingResponse;
import com.target.product.util.ResponseMsg;

@Component
public class PricingClient {

	private Gson gson;

	private RestTemplate restTemplate;

	@PostConstruct
	public void initIt() throws Exception {
		restTemplate = new RestTemplate();
		gson = new Gson();
	}

	@Value("${target.pricing}")
	private String pricingBaseURL;

	@Value("${target.pricing.priceapi.path}")
	private String pricingPathUrl;

	public PricingResponse getProductPrice(Integer pId) {
		String url = this.buildGetPriceUrl(pId);
		PricingResponse response = null;

		try {
			String responseText = restTemplate.getForObject(url, String.class);
			response = gson.fromJson(responseText, PricingResponse.class);
			if (response.getResponseCode().equals(HttpStatus.OK.toString())
					&& response.getResponseMessage().equalsIgnoreCase(ResponseMsg.SUCCESS.toString())) {
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return response;
	}

	public String postProductPrice(Integer pId, PriceTable pInfo) {
		String url = this.buildGetPriceUrl(pId);
		pInfo.setProductId(pId);
		try {
			restTemplate.postForEntity(url, pInfo, String.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String putProductPrice(Integer pId, PriceTable pInfo) {
		String url = this.buildGetPriceUrl(pId);
		pInfo.setProductId(pId);
		try {
			restTemplate.put(url, pInfo);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private String buildGetPriceUrl(Integer pId) {
		return pricingBaseURL + "/" + String.valueOf(pId) + "/" + pricingPathUrl;
	}
}
