package com.withlzc.backend.service.impl;

import com.withlzc.backend.dao.CategoryRepository;
import com.withlzc.backend.domain.Category;
import com.withlzc.backend.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author Lei
 * @date 2019-08-01
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional
    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Transactional
    @Override
    public Optional<Category> getCategory(Long id) {
        return categoryRepository.findById(id);
    }

    /**
     *
     * @param id
     * @param category
     * @return
     */
    @Transactional
    @Override
    public Optional<Category> updateCategory(Long id, Category category) {
        Optional<Category> temp = categoryRepository.findById(id);
        if (temp.isPresent()) {
            temp.get().setCategoryName(category.getCategoryName());
            categoryRepository.save(temp.get());
            return temp;
        } else {
            return Optional.empty();
        }
    }

    @Transactional
    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<Category> listCategory() {
        return categoryRepository.findAll();
    }
}
