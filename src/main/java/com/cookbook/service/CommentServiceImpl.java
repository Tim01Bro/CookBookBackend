package com.cookbook.service;

import com.cookbook.dao.interfaces.CommentDao;
import com.cookbook.model.Comment;
import com.cookbook.service.interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public int save(Comment comment) {
        return commentDao.save(comment);
    }

    @Override
    public Comment getById(Integer id) {
        return commentDao.getById(id);
    }

    @Override
    public int update(Comment comment) {
        return commentDao.update(comment);
    }

    @Override
    public int deleteById(Integer id) {
        return commentDao.deleteById(id);
    }

    @Override
    public List<Comment> findAll() {
        return commentDao.findAll();
    }

    @Override
    public List<Comment> findByName(String name) {
        return commentDao.findByName(name);
    }

    @Override
    public List<Integer> CountCommentByRecept(Long id) {
        return commentDao.CountCommentByRecept(id);
    }
  
}
