package com.xm.mapper;

import java.util.List;

import com.xm.entity.Comment;

public interface CommentMapper {
	/**
	 * ����ȫ��
	 * @param comment
	 * @return
	 */
	List<Comment> getComments(int pid);

	/**
	 * ������ȫ��
	 * @param comment
	 * @return
	 */
	List<Comment> AllComments(int uid);
	/**
	 * ���
	 * @param comment
	 * @return
	 */
	int AddComments(Comment comment);
	/**
	 * ���۵���ȫ��
	 * @param comment
	 * @return
	 */
	List<Comment> Comments(int pid);
}
