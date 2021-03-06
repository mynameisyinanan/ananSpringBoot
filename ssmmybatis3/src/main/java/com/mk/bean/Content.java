package com.mk.bean;

import java.util.Date;

/**
 * Content 文章实体类<br/>
 * 创建人:tan<br/>
 * 时间：2017年11月3日-下午2:24:22 <br/>
 * 
 * @version 1.0.0<br/>
 */
public class Content {

	private Integer id;// id
	private String title;// 标题
	private String content;// 内容
	private String img;// 图片
	private Date createTime;// 创建时间
	private Date updateTime;// 修改时间
	private Integer status;// 状态
	private Integer categoryId;// categid
	private Integer hits;// 点击数
	private Integer loves;// 点赞数
	private Integer userId;// 用户id
	private String shename;// 社报名称
	private String text;// 内容简介

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getLoves() {
		return loves;
	}

	public void setLoves(Integer loves) {
		this.loves = loves;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getShename() {
		return shename;
	}

	public void setShename(String shename) {
		this.shename = shename;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
