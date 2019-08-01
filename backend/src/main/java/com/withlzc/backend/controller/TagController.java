package com.withlzc.backend.controller;

import com.withlzc.backend.domain.Category;
import com.withlzc.backend.domain.Tag;
import com.withlzc.backend.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lei
 * @date 2019-08-01
 */

@RestController
@RequestMapping("/api/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping("/list")
    public List<Tag> tags() {
        return tagService.listTag();
    }

    @PostMapping("/add")
    public void addTag(Tag tag) {
        tagService.addTag(tag);
    }

    @PutMapping("/update/{id}")
    public void updateTag(@PathVariable Long id, Tag tag) {
        tagService.updateTag(id, tag);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTag(@PathVariable Long id) {
        tagService.deleteTag(id);
    }
}
