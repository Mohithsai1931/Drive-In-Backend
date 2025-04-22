package com.drivein.www.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drivein.www.model.MenuCategory;
import com.drivein.www.repo.MenuCategoryRepository;

@Service
public class MenuService {

    @Autowired
    private MenuCategoryRepository menuCategoryRepository;

    public List<MenuCategory> getAllCategories() {
        return menuCategoryRepository.findAll();
    }

    public MenuCategory saveCategory(MenuCategory category) {
        return menuCategoryRepository.save(category);
    }

    public void deleteCategory(Long id) {
        menuCategoryRepository.deleteById(id);
    }
}
