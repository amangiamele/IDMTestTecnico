package com.solution.model.sales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.solution.model.product.Product;

public class Sales {

	List<Product> products;
	Map<String, Integer> productsNumber;
	
	public Sales() {
		this.products = new ArrayList<Product>();
		this.productsNumber = new HashMap<String, Integer>();
	}
	
	public List<Product> getList() {
		return products;
	}

	public void setList(List<Product> list) {
		this.products = list;
	}

	public void buyProduct(Product product) {
		if(product == null) {
			return;
		}
		Integer numberProduct;
		String productName = product.getName();
		
		if(this.productsNumber.containsKey(product.getName())) {
			numberProduct = this.productsNumber.get(productName);
			numberProduct = numberProduct + 1;
			this.productsNumber.put(productName, numberProduct);
			return;
		}
		
		this.products.add(product);
		this.productsNumber.put(productName, new Integer(1));
		
	}
	
	public int getNumberProduct(int index) {
		if(index < -1 && index > this.products.size()) {
			return -1;
		}
		
		Product tmp = this.products.get(index);
		String productName = tmp.getName();
		Integer productsNumber = this.productsNumber.get(productName);
		
		return productsNumber.intValue();
	}
	
	public double getTaxes() {
		double totalTax = 0.0;
		double totalPruductTaxes = 0.0;
		int productNumber = 0;
		Product tmp;
		
		for(int i = 0; i < products.size(); i++) {
			tmp = products.get(i);
			productNumber = this.getNumberProduct(i);
			totalPruductTaxes = tmp.getAmountTax() * productNumber;
			totalTax = totalTax + totalPruductTaxes;
		}
		return Math.round(totalTax * 100.00) / 100.00;
	}
	
	public double price() {
		double totalPrice = 0.0;
		double totalPruductPrice = 0.0;
		int productNumber = 0;
		Product tmp;
		
		for(int i = 0; i < products.size(); i++) {
			tmp = products.get(i);
			productNumber = this.getNumberProduct(i);
			totalPruductPrice = tmp.getPrice() * productNumber;
			totalPrice = totalPrice + totalPruductPrice;
			
		}
		return Math.round(totalPrice * 100.00) / 100.00;
	}
	
	public String toString() {
		String ris = "";
		Product tmp;
		for(int i = 0; i < products.size(); i++) {
			tmp = products.get(i);
			ris = ris + getNumberProduct(i) + " " + tmp.toString() + "\n";
		}
		ris = ris + "Sales Taxes: " + getTaxes() + "\n";
		
		return ris + "Total: " + price();
	}
}
