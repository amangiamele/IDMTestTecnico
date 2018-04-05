package com.solution.model.product;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.solution.model.CategoryProductEnum;
import com.solution.model.Product;

public class TestStaticFactoryMethodProduct {
	private Product book;
	private Product cdMusic;

	private Product importedBook;
	private Product importedCdMusic;
	
	@Before
	public void init() {	
		book = new Product(0.0, "Book", 12.49, CategoryProductEnum.NO_TAXED_PRODCUT);
		cdMusic = new Product(0.1, "music CD", 14.99, CategoryProductEnum.TAXED_PRODCUT);
		
		importedBook = new Product(0.05, "Imported Book", 12.49, CategoryProductEnum.NO_TAXED_PRODCUT);
		importedCdMusic = new Product(0.15, "Imported music CD", 14.99, CategoryProductEnum.TAXED_PRODCUT);
	}
	
	@Test
    public void taxesNoTaxProductInput1() {
		Product prj = Product.getNoTaxProduct(false, "Book", 12.49);
		assertEquals(book.getAmountTax(), prj.getAmountTax(), 0);
    }
	
	@Test
    public void taxesTaxProductInput1() {
		Product prj = Product.getTaxProduct(false, "music CD", 14.99);
		assertEquals(cdMusic.getAmountTax(), prj.getAmountTax(), 0);
    }
	
	@Test
    public void taxesNoTaxImportedProductInput1() {
		Product prj = Product.getNoTaxProduct(true, "Imported Book", 12.49);
		assertEquals(importedBook.getAmountTax(), prj.getAmountTax(), 0);
    }
	
	@Test
    public void taxesTaxImportedProductInput1() {
		Product prj = Product.getTaxProduct(true, "Imported music CD", 14.99);
		assertEquals(importedCdMusic.getAmountTax(), prj.getAmountTax(), 0);
    }
	
	@Test
    public void taxesGetProductNoTaxInput1() {
		Product prj = Product.getProduct(false, "Book", 12.49, CategoryProductEnum.NO_TAXED_PRODCUT);
		assertEquals(book.getAmountTax(), prj.getAmountTax(), 0);
    }
	
	@Test
    public void taxesGetProductTaxInput1() {
		Product prj = Product.getProduct(false, "music CD", 14.99, CategoryProductEnum.TAXED_PRODCUT);
		assertEquals(cdMusic.getAmountTax(), prj.getAmountTax(), 0);
    }
	
	@Test
    public void taxesGetProductNoTaxImportedInput1() {
		Product prj = Product.getProduct(true, "Imported Book", 12.49, CategoryProductEnum.NO_TAXED_PRODCUT);
		assertEquals(importedBook.getAmountTax(), prj.getAmountTax(), 0);
    }
	
	@Test
    public void taxesGetProductTaxImportedInput1() {
		Product prj = Product.getProduct(true, "Imported music CD", 14.99, CategoryProductEnum.TAXED_PRODCUT);
		assertEquals(importedCdMusic.getAmountTax(), prj.getAmountTax(), 0);
    }
}
