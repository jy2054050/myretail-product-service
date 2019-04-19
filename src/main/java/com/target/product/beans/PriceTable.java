package com.target.product.beans;

public class PriceTable {
	private Integer productId;
	private Double price;
	private String currency;

	public PriceTable( Integer productId,  Double price,  String currency) {
		this.productId = productId;
		this.price = price;
		this.currency = currency;

	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Price [productId=" + productId + ", price=" + price + ", currency=" + currency + "]";
	}

}
