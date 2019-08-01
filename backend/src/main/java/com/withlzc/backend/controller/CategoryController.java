package com.withlzc.backend.controller;

import com.withlzc.backend.domain.Category;
import com.withlzc.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lei
 * @date 2019-08-01
 */

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public List<Category> categories() {
        return categoryService.listCategory();
    }

    @PostMapping("/add")
    public void addCategory(Category category) {
        categoryService.addCategory(category);
    }

    @PutMapping("/update/{id}")
    public void updateCategory(@PathVariable Long id, Category category) {
        categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }


}
