package com.solution.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSalesInput2 {

	private Sales sales = new Sales();
	
	@Before
	public void init() {
		sales = new Sales();
		
		Product importedBoxChocolate = new Product(0.05, "Imported Box Chocolate", 10.00);
		Product importedProfume = new Product(0.15, "Imported Profume", 47.50);
		
		sales.addProduct(importedBoxChocolate);
		sales.addProduct(importedProfume);
	}
	
	@Test
    public void taxesInput2() {
		assertEquals(7.65 , sales.getTaxes(), 0);
    }
	
	@Test
    public void priceInput2() {
		assertEquals(65.15 , sales.price(), 0);
    }
}
