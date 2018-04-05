package com.solution.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestSalesInput3 {
	private Sales sales = new Sales();
	
	private Product importedProfume;
	private Product bottleProfumes;
	private Product headPills;
	private Product importedBoxChocolate;
	
	@Before
	public void init() {
		sales = new Sales();
		
		importedProfume = new Product(0.15, "Imported Profume", 27.99, CategoryProductEnum.TAXED_PRODCUT);
		bottleProfumes = new Product(0.1, "Bottle Profume", 18.99, CategoryProductEnum.TAXED_PRODCUT);
		headPills = new Product(0.0, "packet of headache pills", 9.75, CategoryProductEnum.NO_TAXED_PRODCUT);
		importedBoxChocolate = new Product(0.05, " imported box of chocolates", 11.25, CategoryProductEnum.NO_TAXED_PRODCUT);
		
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
	
	@Test
    public void taxesImportedProfumeInput3() {
		assertEquals(4.2 , importedProfume.getAmountTax(), 0);
    }
	
	@Test
    public void taxesProfumeInput3() {
		assertEquals(1.9 , bottleProfumes.getAmountTax(), 0);
    }
	
	@Test
    public void taxesHeadPillsInput3() {
		assertEquals(0.0 , headPills.getAmountTax(), 0);
    }
	
	@Test
    public void taxesImportedBoxChocolatenput3() {
		assertEquals(0.6 , importedBoxChocolate.getAmountTax(), 0);
    }
	
	@Test
    public void priceImportedProfumeInput3() {
		assertEquals(32.19 , importedProfume.getPrice(), 0);
    }
	
	@Test
    public void priceProfumeInput3() {
		assertEquals(20.89 , bottleProfumes.getPrice(), 0);
    }
	
	@Test
    public void priceHeadPillsInput3() {
		assertEquals(9.75 , headPills.getPrice(), 0);
    }
	
	@Test
    public void priceImportedBoxChocolatenput3() {
		assertEquals(11.85 , importedBoxChocolate.getPrice(), 0);
    }
}
