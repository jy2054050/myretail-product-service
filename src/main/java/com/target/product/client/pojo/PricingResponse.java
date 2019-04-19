package com.target.product.client.pojo;

import java.util.List;

import org.springframework.http.HttpStatus;

import com.target.product.beans.PriceTable;

public class PricingResponse {

	private HttpStatus responseCode;
	private String responseMessage;
	private List<String> errors;
	private PriceTable responseBody;

	public HttpStatus getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(HttpStatus responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	public PriceTable getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(PriceTable responseBody) {
		this.responseBody = responseBody;
	}
}
