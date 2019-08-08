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
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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

    @Transactional
    @Override
    public Optional<Blog> getBlog(Long id) {
        return blogRepository.findById(id);
    }

    @Transactional
    @Override
    public List<Blog> listBlog() {
        return blogRepository.findAll();
    }

    @Transactional
    @Override
    public void addBlog(Blog blog) {
        if (blog.getId() != null) {
            this.updateBlog(blog.getId(), blog);
        } else {
            blogRepository.save(blog);
        }
    }

    /**
     * update blog title, content, updateTime, category, tags
     * @param id
     * @param blog
     * @return
     */
    @Transactional
    @Override
    public void updateBlog(Long id, Blog blog) {
        Optional<Blog> temp = blogRepository.findById(id);
        if (temp.isPresent()) {
            temp.get().setTitle(blog.getTitle());
            temp.get().setContent(blog.getContent());
            temp.get().setUpdateTime(new Date());
            temp.get().setCategory(blog.getCategory());
            temp.get().setTags(blog.getTags());
            blogRepository.save(temp.get());
        } else {

        }
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
    @Transactional
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

    @Transactional
    @Override
    public List<Blog> getBlogByCategory(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.map(value -> blogRepository.findBlogByCategory(value)).orElse(null);
    }

    @Transactional
    @Override
    public List<Blog> getBlogByTag(Long id) {
        Optional<Tag> tag = tagRepository.findById(id);
        return tag.map(value -> blogRepository.findBlogByTags(value)).orElse(null);
    }

    @Transactional
    @Override
    public List<Blog> getBlogByState(int state) {
        return blogRepository.findBlogByState(state);
    }
}
