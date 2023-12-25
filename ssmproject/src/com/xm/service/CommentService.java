package com.xm.service;

import java.util.List;

import com.xm.entity.Comment;

public interface CommentService {
	List<Comment> Comments(int pid);
	List<Comment> getComments(int pid);
	List<Comment> AllComments(int uid);
	int AddComments(Comment comment);
}
