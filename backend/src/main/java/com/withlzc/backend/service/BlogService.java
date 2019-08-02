package com.withlzc.backend.service;

import com.withlzc.backend.domain.Blog;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Lei
 * @date 2019-08-02
 */

@Service
public interface BlogService {

    Optional<Blog> getBlog(Long id);

    List<Blog> listBlog();

    void addBlog(Blog blog);

    void updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);

    Optional<Blog> viewBlog(Long id);

    List<Blog> getBlogByCategory(Long id);

    List<Blog> getBlogByTag(Long id);
}
