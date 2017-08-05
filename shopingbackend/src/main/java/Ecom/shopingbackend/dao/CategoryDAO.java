package Ecom.shopingbackend.dao;

import java.util.List;

import Ecom.shopingbackend.dto.Category;


	


public interface CategoryDAO {
	
	
	
	boolean add(Category category);
	
	List<Category> list();
	Category get(int id);

}
