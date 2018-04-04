package com.solution.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSalesInput1 {
	private Sales sales = new Sales();
	
	private Product book; 
	private Product cdMusic;
	private Product chocolateBar;
	
	@Before
	public void init() {
		sales = new Sales();
		
		book = new Product(0.0, "Book", 12.49);
		cdMusic = new Product(0.1, "music CD", 14.99);
		chocolateBar = new Product(0.0, "chocolate bar", 12.49);
		
		sales.addProduct(book);
		sales.addProduct(cdMusic);
		sales.addProduct(chocolateBar);
	}
	
	@Test
    public void taxesInput1() {
		assertEquals(1.50 , sales.getTaxes(), 0);
    }
	
	@Test
    public void priceInput1() {
		assertEquals(65.15 , sales.price(), 0);
    }
}
