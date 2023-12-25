package com.xm.mapper;

import java.util.List;

import com.xm.entity.Comment;

public interface CommentMapper {
	/**
	 * 评论全查
	 * @param comment
	 * @return
	 */
	List<Comment> getComments(int pid);

	/**
	 * 待评论全查
	 * @param comment
	 * @return
	 */
	List<Comment> AllComments(int uid);
	/**
	 * 添加
	 * @param comment
	 * @return
	 */
	int AddComments(Comment comment);
	/**
	 * 评论单表全查
	 * @param comment
	 * @return
	 */
	List<Comment> Comments(int pid);
}
