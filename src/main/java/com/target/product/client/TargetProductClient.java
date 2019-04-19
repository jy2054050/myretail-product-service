package com.target.product.client;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.target.product.client.pojo.Product;
import com.target.product.client.pojo.ProductPojo;

@Component
public class TargetProductClient {
	private Gson gson;

	private RestTemplate restTemplate;

	@PostConstruct
	public void initIt() throws Exception {
		restTemplate = new RestTemplate();
		gson = new Gson();
	}

	@Value("${taget.product.base.url}")
	private String tagetProductBaseUrl;
	
	@Value("${target.product.option.url}")
	private String tagetProductOptionUrl;

	public void getProductPrice(Integer pId) {
		String url = this.buildGetPriceUrl(pId);

		try {
			String responseText = restTemplate.getForObject(url, String.class);
			/*PricingResponse<PriceTable> response = gson.fromJson(responseText, PricingResponse.class);
			if (response.getResponseCode().equals(HttpStatus.OK.toString())
					&& response.getResponseMessage().equalsIgnoreCase(ResponseMsg.SUCCESS.toString())) {
				return response.getResponseBody();
			}
*/
			
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private String buildGetPriceUrl(Integer pId) {
		// TODO Auto-generated method stub
		return tagetProductBaseUrl + "?"+tagetProductOptionUrl ;
	}
	public ProductPojo getProductInfo(Integer pId) {
		String url = this.buildGetPriceUrl(pId);
		ProductPojo productPojo = null ;

		try {
			String responseText = restTemplate.getForObject(url, String.class);
			productPojo = gson.fromJson(responseText, ProductPojo.class);
			/*PricingResponse<PriceTable> response = gson.fromJson(responseText, PricingResponse.class);
			if (response.getResponseCode().equals(HttpStatus.OK.toString())
					&& response.getResponseMessage().equalsIgnoreCase(ResponseMsg.SUCCESS.toString())) {
				return response.getResponseBody();
			}
*/
			
			System.out.println(productPojo.getProduct().getItem().getProductDescription().getTitle());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return productPojo;
	}
	

}
