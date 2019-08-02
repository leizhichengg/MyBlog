package com.withlzc.backend.service.impl;

import com.withlzc.backend.dao.CommentRepository;
import com.withlzc.backend.domain.Comment;
import com.withlzc.backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author Lei
 * @date 2019-08-02
 */
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    /**
     *
     * @param comment
     * @return
     */
    @Transactional
    @Override
    public Comment addComment(Comment comment) {
//        if (comment.getParentComment().isPresent()) {
//            Long parentCommentId = comment.getParentComment().get().getId();
//            comment.setParentComment(commentRepository.findById(parentCommentId));
//        } else {
//            comment.setParentComment(java.util.Optional.empty());
//        }
//        comment.setCreateTime(new Date());
//        return commentRepository.save(comment);
        return null;
    }

    /**
     * unfinished
     * @param id
     * @return
     */
    @Override
    public List<Comment> listCommentByBlogId(Long id) {
        Sort sort = new Sort(Sort.Direction.DESC, "createTime");
//        return commentRepository.findBy;
        return null;
    }
}
