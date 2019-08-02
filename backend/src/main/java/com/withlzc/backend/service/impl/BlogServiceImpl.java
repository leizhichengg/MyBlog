package com.withlzc.backend.service.impl;

import com.withlzc.backend.dao.BlogRepository;
import com.withlzc.backend.dao.CategoryRepository;
import com.withlzc.backend.dao.TagRepository;
import com.withlzc.backend.domain.Blog;
import com.withlzc.backend.domain.Category;
import com.withlzc.backend.domain.Tag;
import com.withlzc.backend.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Lei
 * @date 2019-08-02
 */

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TagRepository tagRepository;

    @Override
    public Optional<Blog> getBlog(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public List<Blog> listBlog() {
        return blogRepository.findAll();
    }

    @Override
    public Blog addBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    /**
     * unfinished
     * @param id
     * @param blog
     * @return
     */
    @Override
    public Blog updateBlog(Long id, Blog blog) {
        return null;
    }

    @Override
    public void deleteBlog(Long id) {
        blogRepository.deleteById(id);
    }

    /**
     *
     * @param id
     * @return the blog and views count plus 1
     */
    @Override
    public Optional<Blog> viewBlog(Long id) {
        Optional<Blog> blog = getBlog(id);
        if (blog.isPresent()) {
            blog.get().setViews(blog.get().getViews() + 1);
            blogRepository.save(blog.get());
            return blog;
        } else {
            return Optional.empty();
        }
    }

    @Override
    public List<Blog> getBlogByCategory(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.map(value -> blogRepository.findBlogByCategory(value)).orElse(null);
    }

    @Override
    public List<Blog> getBlogByTag(Long id) {
        Optional<Tag> tag = tagRepository.findById(id);
        return tag.map(value -> blogRepository.findBlogByTags(value)).orElse(null);
    }
}
