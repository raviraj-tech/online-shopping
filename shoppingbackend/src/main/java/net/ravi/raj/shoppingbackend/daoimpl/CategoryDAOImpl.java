package net.ravi.raj.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.ravi.raj.shoppingbackend.dao.CategoryDAO;
import net.ravi.raj.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static{
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Televison");
		category.setDescription("This is some category of television!");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		//second category
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some category of mobile!");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//third category
		category = new Category();
		category.setId(3);
		category.setName("Laptope");
		category.setDescription("This is some category of laptope!");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// enchanced for loop
		
		for(Category category : categories){
			if(category.getId() == id)
				return category;
			
		}
		
		return null;
	}

}
