package org.Fishh.blogapp.service;

import org.Fishh.blogapp.model.Comment;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Comment comment);

}
