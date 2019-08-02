package com.withlzc.backend.service;

import com.withlzc.backend.domain.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lei
 * @date 2019-08-02
 */

@Service
public interface CommentService {

    void addComment(Comment comment);

    List<Comment> listCommentByBlogId(Long id);

}
