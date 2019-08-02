package com.withlzc.backend.dao;

import com.withlzc.backend.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lei
 * @date 2019-08-02
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
