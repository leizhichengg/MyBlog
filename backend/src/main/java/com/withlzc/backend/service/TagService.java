package com.withlzc.backend.service;

import com.withlzc.backend.domain.Tag;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Lei
 * @date 2019-08-01
 */

@Service
public interface TagService {

    void addTag(Tag tag);

    Optional<Tag> getTag(Long id);

    void updateTag(Long id, Tag tag);

    void deleteTag(Long id);

    List<Tag> listTag();
}
