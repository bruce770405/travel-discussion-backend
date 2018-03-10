package javaserver.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ArticleDetail {
	
	@Id
	private Long id;
//	@Id
	private String username;
//	@Id
	private Date createTime;
	private String detailContext, stopTag;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private Date modifyTime;

	public ArticleDetail() {
		super();
	}
	
	public ArticleDetail(Long id, String username, String detailContext, String stopTag, Date createTime,
			Date modifyTime) {
		super();
		this.id = id;
		this.username = username;
		this.detailContext = detailContext;
		this.stopTag = stopTag;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



	public String getDetailContext() {
		return detailContext;
	}

	public void setDetailContext(String detailContext) {
		this.detailContext = detailContext;
	}

	public String getStopTag() {
		return stopTag;
	}

	public void setStopTag(String stopTag) {
		this.stopTag = stopTag;
	}



	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((username == null) ? 0 : username.hashCode());
//		// result = prime * result + ((startCity == null) ? 0 : startCity.hashCode());
//		return result;
//	}

}
