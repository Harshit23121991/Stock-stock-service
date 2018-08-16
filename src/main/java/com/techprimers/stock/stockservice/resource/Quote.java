package com.techprimers.stock.stockservice.resource;

import java.math.BigDecimal;

public class Quote {
	
	private String quote;
	private BigDecimal price;
	
	public Quote(String quote, BigDecimal price) {
		this.quote = quote ;
		this.price = price;
	}

	public String getQuote() {
		return quote;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
