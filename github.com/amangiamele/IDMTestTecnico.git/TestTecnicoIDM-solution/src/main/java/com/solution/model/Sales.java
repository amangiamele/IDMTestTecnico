package com.solution.model;

import java.util.ArrayList;
import java.util.List;

public class Sales {

	List<Product> list;
	
	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}

	public Sales() {
		this.list = new ArrayList<Product>();
	}
	
	public void addProduct(Product product) {
		this.list.add(product);
	}
	
	public double getTaxes() {
		double totalTax = 0;
		Product tmp;
		for(int i = 0; i < list.size(); i++) {
			tmp = list.get(i);
			totalTax = totalTax + tmp.getAmountTax();
		}
		return totalTax;
	}
	
	public double price() {
		double totalPrice = 0;
		Product tmp;
		for(int i = 0; i < list.size(); i++) {
			tmp = list.get(i);
			totalPrice = totalPrice + tmp.getPrice();
		}
		return totalPrice;
	}
	
	public String toString() {
		return "Taxes = " + getTaxes() + " - Total = " + price();
	}
}
