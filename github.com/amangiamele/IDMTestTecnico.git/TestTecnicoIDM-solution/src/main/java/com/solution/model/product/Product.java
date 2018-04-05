package com.solution.model.product;

import java.util.Objects;

public class Product {

	private double taxRate;
	private String name;
	private double netPrice;
	private String category;

	public Product(double taxRate, String name, double netPrice, String category) {
		this.taxRate = taxRate;
		this.name = name;
		this.netPrice = netPrice;
	}
	
	public double getTaxRate() {
		return taxRate;
	}
	protected void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double price) {
		this.netPrice = price;
	}
	
	public double getPrice() {
		double price = netPrice + getAmountTax();
		price = Math.round(price * 100.0) / 100.0;
		return price;
	}
	public void setPrice(double price) {
		this.netPrice = price;
	}
	
	public double getAmountTax() {
		double amountTax = netPrice * taxRate;
		return roundTax(amountTax);
	}
	
	private double roundTax(double value) {
//		double tempValue = value * 20;
//		tempValue = Math.round(tempValue);
//		tempValue = tempValue / 20;
		double tempValue = value;
		int restoTmpValue = 0;
		
		tempValue = tempValue * 100.0;
		tempValue = Math.round(tempValue);
		
		restoTmpValue = (int) (tempValue%5);
		
		if(restoTmpValue != 0) {
			tempValue = tempValue  + (5 - restoTmpValue);
		}
		
		tempValue = tempValue/100.0;
		
		return tempValue;
	}
	
	public String toString() {
		return getName() + ": " + getPrice();
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) {
        	return true;
        }
        if (o == null || getClass() != o.getClass()) {
        	return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.getName());
    }
	
	public static Product getNoTaxProduct(boolean imported, String productName, double netPrice) {
		double taxRate = 0.0;
		if(imported) {
			taxRate = taxRate + 0.05;
		}
		
		return new Product(taxRate, productName, netPrice, CategoryProductEnum.NO_TAXED_PRODCUT);
	}
	
	public static Product getTaxProduct(boolean imported, String productName, double netPrice) {
		double taxRate = 0.1;
		if(imported) {
			taxRate = taxRate + 0.05;
		}
		
		return new Product(taxRate, productName, netPrice, CategoryProductEnum.TAXED_PRODCUT);
	}
	
	public static Product getProduct(boolean imported, String productName, double netPrice, String category) {
		
		Product prd = null;
		if(CategoryProductEnum.NO_TAXED_PRODCUT.equals(category)) {
			prd = getNoTaxProduct(imported, productName, netPrice);
		}else if(CategoryProductEnum.TAXED_PRODCUT.equals(category)){
			prd = getTaxProduct(imported, productName, netPrice);
		}
		
		return prd;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
