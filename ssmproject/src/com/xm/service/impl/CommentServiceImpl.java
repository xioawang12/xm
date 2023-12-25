package com.xm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xm.entity.Comment;
import com.xm.mapper.CommentMapper;
import com.xm.service.CommentService;
@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	CommentMapper commentMapper;
	@Override
	public List<Comment> getComments(int pid) {
		// TODO Auto-generated method stub
		return commentMapper.getComments(pid);
	}
	@Override
	public List<Comment> AllComments(int uid) {
		// TODO Auto-generated method stub
		return commentMapper.AllComments(uid);
	}
	@Override
	public int AddComments(Comment comment) {
		// TODO Auto-generated method stub
		return commentMapper.AddComments(comment);
	}
	@Override
	public List<Comment> Comments(int pid) {
		// TODO Auto-generated method stub
		return commentMapper.Comments(pid);
	}

}
