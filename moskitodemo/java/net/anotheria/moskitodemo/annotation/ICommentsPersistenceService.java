/**
 ***************************************************************************************
 *** ICommentsPersistenceService.java                                                ***
 *** Generator: net.anotheria.asg.generator.model.db.JDBCPersistenceServiceGenerator ***
 *** generated by AnoSiteGenerator (ASG), Version: 1.3.3                             ***
 *** Copyright (C) 2005 - 2010 Anotheria.net, www.anotheria.net                      ***
 *** All Rights Reserved.                                                            ***
 ***************************************************************************************
 *** Don't edit this code, if you aren't sure                                        ***
 *** that you do exactly know what you are doing!                                    ***
 *** It's better to invest time in the generator, as into the generated code.        ***
 ***************************************************************************************
 */

package net.anotheria.moskitodemo.annotation;

import net.anotheria.moskito.aop.annotation.MonitorClass;
import net.anotheria.moskitodemo.annotation.data.Comment;
import net.anotheria.util.slicer.Segment;

import java.util.List;

@MonitorClass
public interface ICommentsPersistenceService{

	// Generated by: class net.anotheria.asg.generator.model.db.JDBCPersistenceServiceGenerator.generateInterface

	/**
	 * Returns all Comments objects stored.
	 */
	public List<Comment> getComments() throws CommentsPersistenceServiceException;

	/**
	 * Deletes a Comment object by id.
	 */
	public void deleteComment(String id) throws CommentsPersistenceServiceException;

	/**
	 * Deletes multiple Comment object.
	 */
	public void deleteComments(List<Comment> list) throws CommentsPersistenceServiceException;

	/**
	 * Returns the Comment object with the specified id.
	 */
	public Comment getComment(String id) throws CommentsPersistenceServiceException;

	/**
	 * Imports a new Comment object.
	 * Returns the imported version.
	 */
	public Comment importComment(Comment comment) throws CommentsPersistenceServiceException;

	/**
	 * Imports multiple new Comment objects.
	 * Returns the imported versions.
	 */
	public List<Comment> importComments(List<Comment> list) throws CommentsPersistenceServiceException;

	/**
	 * Creates a new Comment object.
	 * Returns the created version.
	 */
	public Comment createComment(Comment comment) throws CommentsPersistenceServiceException;

	/**
	 * Creates multiple new Comment objects.
	 * Returns the created versions.
	 */
	public List<Comment> createComments(List<Comment> list) throws CommentsPersistenceServiceException;

	/**
	 * Updates a Comment object.
	 * Returns the updated version.
	 */
	public Comment updateComment(Comment comment) throws CommentsPersistenceServiceException;

	/**
	 * Updates multiple Comment object.
	 * Returns the updated versions.
	 */
	public List<Comment> updateComments(List<Comment> list) throws CommentsPersistenceServiceException;

	/**
	 * Returns all Comment objects which match the given property or properties.
	 */
	public List<Comment> getCommentsByProperty(QueryProperty... properties) throws CommentsPersistenceServiceException;

	/**
	 * Returns all Comments count.
	 */
	public int getCommentsCount() throws CommentsPersistenceServiceException;

	/**
	 * Returns Comments objects segment.
	 */
	public List<Comment> getComments(Segment aSegment) throws CommentsPersistenceServiceException;

	/**
	 * Returns Comment objects segment which match the given property or properties.
	 */
	public List<Comment> getCommentsByProperty(Segment aSegment, QueryProperty... properties) throws CommentsPersistenceServiceException;

}
