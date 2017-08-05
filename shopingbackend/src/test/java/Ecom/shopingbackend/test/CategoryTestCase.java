package Ecom.shopingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Ecom.shopingbackend.dao.CategoryDAO;
import Ecom.shopingbackend.dto.Category;

public class CategoryTestCase {
	
	
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("Ecom.shopingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	@Test
	
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Womens");
		category.setDescription("this the some description for television");
		category.setImageURL("image2.png");
		
		assertEquals("Successfully added a category inside the table",true,categoryDAO.add(category));
		
		
		
	}

}
