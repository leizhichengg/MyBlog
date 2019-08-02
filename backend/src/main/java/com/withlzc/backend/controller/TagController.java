package com.withlzc.backend.controller;

import com.withlzc.backend.domain.Category;
import com.withlzc.backend.domain.Tag;
import com.withlzc.backend.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
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

    /**
     *
     * @return the top 5 hot tags
     */
    @GetMapping("/hot")
    public List<Tag> hotTags() {
        List<Tag> list = tagService.listTag();
        list.sort(Comparator.comparing(Tag::getBlogCount).reversed());
        if (list.size() <= 5) {
            return list;
        } else {
            return list.subList(0, 5);
        }
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
