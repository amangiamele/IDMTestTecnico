package com.solution.model.salses;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.solution.model.product.CategoryProductEnum;
import com.solution.model.product.Product;
import com.solution.model.sales.Sales;

public class TestSalesInput1 {
	private Sales sales = new Sales();
	private String expectedPrint;
	
	private Product book;
	private Product cdMusic;
	private Product chocolateBar;
	
	@Before
	public void init() {
		sales = new Sales();
		
		book = new Product(0.0, "Book", 12.49, CategoryProductEnum.NO_TAXED_PRODCUT);
		cdMusic = new Product(0.1, "music CD", 14.99, CategoryProductEnum.TAXED_PRODCUT);
		chocolateBar = new Product(0.0, "chocolate bar", 0.85, CategoryProductEnum.NO_TAXED_PRODCUT);
		
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
    public void taxesSalsesInput1() {
		
		
		assertEquals(1.50 , sales.getTaxes(), 0);
    }
	
	@Test
    public void priceSalesInput1() {
		assertEquals(29.83 , sales.price(), 0);
    }
	
}
