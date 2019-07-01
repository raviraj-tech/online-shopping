package net.ravi.raj.shoppingbackend.dao;

import java.util.List;

import net.ravi.raj.shoppingbackend.dto.Category;

public interface CategoryDAO {

		List<Category> list();
		Category get(int id);
}
