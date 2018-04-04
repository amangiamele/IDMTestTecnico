package com.solution.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSalesInput1 {
	private Sales sales = new Sales();
	private String expectedPrint;
	
	@Before
	public void init() {
		sales = new Sales();
		
		Product book = new Product(0.0, "Book", 12.49);
		Product cdMusic = new Product(0.1, "music CD", 14.99);
		Product chocolateBar = new Product(0.0, "chocolate bar", 0.85);
		
		sales.buyProduct(book);
		sales.buyProduct(cdMusic);
		sales.buyProduct(chocolateBar);
		
//		expectedPrint = "1 book : 12.49\n";
//		expectedPrint = expectedPrint + "1 music CD: 16.49\n";
//		expectedPrint = expectedPrint + "1 chocolate bar: 0.85\n";
//		expectedPrint = expectedPrint + "Sales Taxes: 1.50\n";
//		expectedPrint = expectedPrint + "Total: 29.83";
	}
	
	@Test
    public void taxesInput1() {
		assertEquals(1.50 , sales.getTaxes(), 0);
    }
	
	@Test
    public void priceInput1() {
		assertEquals(29.83 , sales.price(), 0);
    }
	
//	@Test
//    public void toStringInput1() {
//		assertEquals(expectedPrint , sales.toString());
//    }
}
