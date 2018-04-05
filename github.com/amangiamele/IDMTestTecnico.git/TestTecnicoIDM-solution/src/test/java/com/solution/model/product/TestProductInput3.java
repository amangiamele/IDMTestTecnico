package com.solution.model.product;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestProductInput3 {

	private Product importedProfume;
	private Product bottleProfumes;
	private Product headPills;
	private Product importedBoxChocolate;
	
	@Before
	public void init() {		
		importedProfume = new Product(0.15, "imported bottle of perfume", 27.99, CategoryProductEnum.TAXED_PRODCUT);
		bottleProfumes = new Product(0.1, "bottle of perfume", 18.99, CategoryProductEnum.TAXED_PRODCUT);
		headPills = new Product(0.0, "packet of headache pills", 9.75, CategoryProductEnum.NO_TAXED_PRODCUT);
		importedBoxChocolate = new Product(0.05, "imported box of chocolates", 11.25, CategoryProductEnum.NO_TAXED_PRODCUT);
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
    public void taxesImportedBoxChocolateInput3() {
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
    public void priceImportedBoxChocolateInput3() {
		assertEquals(11.85 , importedBoxChocolate.getPrice(), 0);
    }
	
	@Test
    public void printImportedProfumeInput3() {
		assertEquals("imported bottle of perfume: 32.19", importedProfume.toString());
    }
	
	@Test
    public void printBottleProfumesInput3() {
		assertEquals("bottle of perfume: 20.89", bottleProfumes.toString());
    }
	
	@Test
    public void printHeadPillsInput3() {
		assertEquals("packet of headache pills: 9.75", headPills.toString());
    }
	
	@Test
    public void printImportedBoxChocolateInput3() {
		assertEquals("imported box of chocolates: 11.85", importedBoxChocolate.toString());
    }
}
