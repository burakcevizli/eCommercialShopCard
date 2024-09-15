package com.dailycodework.dreamshops.service.category;

import com.dailycodework.dreamshops.model.Category;
import java.util.*;

public interface ICategoryService {
    Category getCategoryById(Long id);
    Category getCategoryByName(String name);
    List<Category> getAllCategories();
    Category addCategory(Category category);
    Category updateCategory(Category category, Long id);
    void deleteCategoryById(Long id);
}
