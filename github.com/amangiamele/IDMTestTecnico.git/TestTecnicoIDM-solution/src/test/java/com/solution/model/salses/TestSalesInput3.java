package com.solution.model.salses;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.solution.model.CategoryProductEnum;
import com.solution.model.Product;
import com.solution.model.Sales;

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
}
