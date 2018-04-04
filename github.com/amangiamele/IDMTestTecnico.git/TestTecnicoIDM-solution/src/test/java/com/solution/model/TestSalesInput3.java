package com.solution.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSalesInput3 {
	private Sales sales = new Sales();
	
	@Before
	public void init() {
		sales = new Sales();
		
		Product importedProfume = new Product(0.15, "Imported Profume", 27.99);
		Product bottleProfumes = new Product(0.1, "Bottle Profume", 18.99);
		Product headPills = new Product(0.0, "packet of headache pills", 9.75);
		Product importedBoxChocolate = new Product(0.05, " imported box of chocolates", 11.25);
		
		sales.buyProduct(importedProfume);
		sales.buyProduct(bottleProfumes);
		sales.buyProduct(headPills);
		sales.buyProduct(importedBoxChocolate);
	}
	
	@Test
    public void taxesInput3() {
		assertEquals(6.70 , sales.getTaxes(), 0);
    }
	
	@Test
    public void priceInput3() {
		assertEquals(74.68 , sales.price(), 0);
    }
}
