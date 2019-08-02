package com.withlzc.backend.service.impl;

import com.withlzc.backend.dao.TagRepository;
import com.withlzc.backend.domain.Tag;
import com.withlzc.backend.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Lei
 * @date 2019-08-01
 */

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public Tag addTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public Optional<Tag> getTag(Long id) {
        return tagRepository.findById(id);
    }

    @Override
    public Optional<Tag> updateTag(Long id, Tag tag) {
        Optional<Tag> temp = tagRepository.findById(id);
        if (temp.isPresent()) {
            temp.get().setBlogs(tag.getBlogs());
            temp.get().setName(tag.getName());
            return temp;
        } else {
            return Optional.empty();
        }
    }

    @Override
    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }

    @Override
    public List<Tag> listTag() {
        return tagRepository.findAll();
    }
}
