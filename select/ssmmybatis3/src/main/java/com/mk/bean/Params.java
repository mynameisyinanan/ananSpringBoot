package com.mk.bean;

/**
 * Params 参数实体 <br/>
 * 创建人:tan<br/>
 * 时间：2017年11月3日-下午2:21:31 <br/>
 * 
 * @version 1.0.0<br/>
 *
 */
public class Params {

	private Integer id; // id 编号
	private Integer pageNo = 0; // 页码
	private Integer pageSize = 5; // 每一页的数据大小
	private Integer categoryId;// 分类
	private String keyword;// 搜索的关键词
	private Integer status;// 状态0未发布1发布
	private Integer contentId;// 状态0未发布1发布

	public Params(Integer id, Integer pageNo, Integer pageSize, Integer categoryId, String keyword, Integer status) {
		super();
		this.id = id;
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.categoryId = categoryId;
		this.keyword = keyword;
		this.status = status;
	}

	public Params() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getContentId() {
		return contentId;
	}

	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}

}
