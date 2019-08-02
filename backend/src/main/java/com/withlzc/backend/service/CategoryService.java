package com.withlzc.backend.service;

import com.withlzc.backend.domain.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Lei
 * @date 2019-08-01
 */

@Service
public interface CategoryService {

    Optional<Category> getCategory(Long id);

    void addCategory(Category category);

    void updateCategory(Long id, Category category);

    void deleteCategory(Long id);

    List<Category> listCategory();
}
