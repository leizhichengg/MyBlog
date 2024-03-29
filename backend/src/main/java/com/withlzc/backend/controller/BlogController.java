package com.withlzc.backend.controller;

import com.withlzc.backend.domain.Blog;
import com.withlzc.backend.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Lei
 * @date 2019-08-02
 */

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/list")
    public List<Blog> list() {
        return blogService.listBlog();
    }

    @GetMapping("/list/allposts")
    public List<Blog> allPosts() {
        return blogService.getBlogByState(1);
    }

    @GetMapping("/list/drafts")
    public List<Blog> drafts() {
        return blogService.getBlogByState(0);
    }

    @GetMapping("/list/trash")
    public List<Blog> trash() {
        return blogService.getBlogByState(2);
    }

    /**
     * @return the top 5 hot blog
     */
    @GetMapping("/hot")
    public List<Blog> hotBlog() {
        List<Blog> list = blogService.listBlog();
        list.sort(Comparator.comparing(Blog::getViews).reversed());
        return list.subList(0, 5);
    }

    @GetMapping("/{id}")
    public Optional<Blog> getBlogById(@PathVariable Long id) {
        return blogService.getBlog(id);
    }

    /**
     *
     * @param id
     * @return the blog and views count plus 1
     */
    @GetMapping("/view/{id}")
    public Optional<Blog> getBlogAndAddViews(@PathVariable Long id) {
        return blogService.viewBlog(id);
    }

    @GetMapping("/category/{id}")
    public List<Blog> getBlogByCategory(@PathVariable Long id) {
        return blogService.getBlogByCategory(id);
    }

    @GetMapping("/tag/{id}")
    public List<Blog> getBlogByTag(@PathVariable Long id) {
        return blogService.getBlogByTag(id);
    }

    @PostMapping("/add")
    public void addBlog(Blog blog) {
        if (blog.getId() != null) {
        } else {
            blogService.addBlog(blog);
        }
    }

    @PutMapping("/update/{id}")
    public void updateBlog(@PathVariable Long id, Blog blog) {
        blogService.updateBlog(id, blog);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBlog(@PathVariable Long id) {
        blogService.deleteBlog(id);
    }
}
