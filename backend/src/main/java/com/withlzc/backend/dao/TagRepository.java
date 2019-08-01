package com.withlzc.backend.dao;

import com.withlzc.backend.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lei
 * @date 2019-08-01
 */
public interface TagRepository extends JpaRepository<Tag, Long> {
}
