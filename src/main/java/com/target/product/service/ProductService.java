package com.target.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.target.product.beans.GenericResponse;
import com.target.product.beans.ProductResponse;
import com.target.product.processor.ProductProcessor;

@RestController
@RequestMapping("products")
public class ProductService {

	@Autowired
	private ProductProcessor productProcessor;

	@RequestMapping(value="/ping", method = RequestMethod.GET)
	public String ping() {
		return "Service is up !!";
	}
	
	@RequestMapping(value="/{productId}", method = RequestMethod.GET)
	public GenericResponse<ProductResponse> getPrice(@PathVariable Integer productId) {
		return productProcessor.productInfo(productId);
	}
	
	@RequestMapping(value="/{productId}", method = RequestMethod.POST)
	public GenericResponse<ProductResponse> addPrice(@PathVariable Integer productId,@RequestBody String priceInfo) {
		return productProcessor.productAddUpdatePrice(productId, priceInfo);
	}
	
	@RequestMapping(value="/{productId}", method = RequestMethod.PUT)
	public GenericResponse<ProductResponse>  updatePrice(@PathVariable Integer productId, @RequestBody String priceInfo) {
		return productProcessor.productAddUpdatePrice(productId, priceInfo);
	}
	
}
