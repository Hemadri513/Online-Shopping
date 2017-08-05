package Ecom.shopingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import Ecom.shopingbackend.dao.CategoryDAO;
import Ecom.shopingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {


	@Autowired
	
	private SessionFactory sessionFactory;
	
private static List<Category> categories = new ArrayList<>();
	
	
	static {
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("Men");
		category.setDescription("this the some description for mens");
		category.setImageURL("image1.png");
		
		categories.add(category);
		
		
		
		category = new Category();
		
		category.setId(2);
		category.setName("Womens");
		category.setDescription("this the some description for womens");
		category.setImageURL("image2.png");
		
		categories.add(category);
		
		
		category = new Category();
		
		category.setId(3);
		category.setName("kids");
		category.setDescription("this the some description for kids");
		category.setImageURL("image3.png");
		
		categories.add(category);
		
	}
	
	
	@Override
	public List<Category> list() {
		
		
		return categories;
	}


	@Override
	public Category get(int id) {
		
		//enhance for loop
		for(Category category :categories)
		{
			if(category.getId()== id) return category;
		}
		
		return null;
	}


	@Override
	@Transactional
	public boolean add(Category category) {
		
		try {
		
			sessionFactory.getCurrentSession().persist(category);
			
			
			
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}

		
		
		
	}

}
