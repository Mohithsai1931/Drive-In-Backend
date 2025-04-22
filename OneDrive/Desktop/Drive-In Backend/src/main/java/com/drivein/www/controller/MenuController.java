package com.drivein.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drivein.www.Service.MenuService;
import com.drivein.www.model.MenuCategory;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/categories")
    public List<MenuCategory> getAllCategories() {
        return menuService.getAllCategories();
    }

    @PostMapping("/category")
    public MenuCategory addCategory(@RequestBody MenuCategory category) {
        return menuService.saveCategory(category);
    }

    @DeleteMapping("/category/{id}")
    public void deleteCategory(@PathVariable Long id) {
        menuService.deleteCategory(id);
    }
}
