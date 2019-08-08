package com.withlzc.backend.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lei
 * @date 2019-08-01
 */

@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue
    private Long id;

    private String tagName;

    @ManyToMany(mappedBy = "tags")
    @JsonBackReference
    private List<Blog> blogs = new ArrayList<>();

    public Tag() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public Integer getBlogCount() {
        return blogs.size();
    }


    @Override
    public String toString() {
        return "Tag{" +
                "id=" + id +
                ", name='" + tagName + '\'' +
                '}';
    }
}
