package Ecom.shopingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Ecom.shopingbackend.dao.CategoryDAO;
import Ecom.shopingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
private static List<Category> categories = new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("Men");
		category.setDescription("this the some description for television");
		category.setImageURL("image1.png");
		
		categories.add(category);
		
		
		
		category = new Category();
		
		category.setId(2);
		category.setName("Womens");
		category.setDescription("this the some description for television");
		category.setImageURL("image2.png");
		
		categories.add(category);
		
		
		category = new Category();
		
		category.setId(3);
		category.setName("kids");
		category.setDescription("this the some description for television");
		category.setImageURL("image3.png");
		
		categories.add(category);
		
	}
	
	
	@Override
	public List<Category> list() {
		
		
		return categories;
	}

}
