package com.withlzc.backend.dao;

import com.withlzc.backend.domain.Blog;
import com.withlzc.backend.domain.Category;
import com.withlzc.backend.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Lei
 * @date 2019-08-02
 */
public interface BlogRepository extends JpaRepository<Blog, Long> {

    List<Blog> findBlogByCategory(Category category);

    List<Blog> findBlogByTags(Tag tag);

    List<Blog> findBlogByState(int state);
}
