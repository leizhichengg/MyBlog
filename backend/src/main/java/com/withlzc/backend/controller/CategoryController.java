package com.withlzc.backend.controller;

import com.withlzc.backend.domain.Category;
import com.withlzc.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

/**
 * @author Lei
 * @date 2019-08-01
 */

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public List<Category> categories() {
        return categoryService.listCategory();
    }

    /**
     *
     * @return the top 5 hot categories
     */
    @GetMapping("/hot")
    public List<Category> hotCategories() {
        List<Category> list = categoryService.listCategory();
        list.sort(Comparator.comparing(Category::getBlogCount).reversed());
        if (list.size() <= 5) {
            return list;
        } else {
            return list.subList(0, 5);
        }
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
