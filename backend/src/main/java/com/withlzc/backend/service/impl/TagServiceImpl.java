package com.withlzc.backend.service.impl;

import com.withlzc.backend.dao.TagRepository;
import com.withlzc.backend.domain.Tag;
import com.withlzc.backend.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    @Override
    public void addTag(Tag tag) {
        tagRepository.save(tag);
    }

    @Transactional
    @Override
    public Optional<Tag> getTag(Long id) {
        return tagRepository.findById(id);
    }

    @Transactional
    @Override
    public void updateTag(Long id, Tag tag) {
        Optional<Tag> temp = tagRepository.findById(id);
        if (temp.isPresent()) {
            temp.get().setBlogs(tag.getBlogs());
            temp.get().setTagName(tag.getTagName());
        } else {
        }
    }

    @Transactional
    @Override
    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }

    @Transactional
    @Override
    public List<Tag> listTag() {
        return tagRepository.findAll();
    }
}
