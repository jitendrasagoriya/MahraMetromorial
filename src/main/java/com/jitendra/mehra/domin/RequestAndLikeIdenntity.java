package com.jitendra.mehra.domin;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

@Embeddable
public class RequestAndLikeIdenntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Column(name="ID", nullable = false)
	private String id;
	
	@NotNull
	@Column(name="SECOUNDID", nullable = false)
	private String secoundryId;

	/**
	 * @param id
	 * @param secoundryId
	 */
	public RequestAndLikeIdenntity(String id, String secoundryId) {
		super();
		this.id = id;
		this.secoundryId = secoundryId;
	}

	/**
	 * 
	 */
	public RequestAndLikeIdenntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the secoundryId
	 */
	public String getSecoundryId() {
		return secoundryId;
	}

	/**
	 * @param secoundryId the secoundryId to set
	 */
	public void setSecoundryId(String secoundryId) {
		this.secoundryId = secoundryId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RequestAndLikeIdenntity [id=" + id + ", secoundryId=" + secoundryId + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((secoundryId == null) ? 0 : secoundryId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestAndLikeIdenntity other = (RequestAndLikeIdenntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (secoundryId == null) {
			if (other.secoundryId != null)
				return false;
		} else if (!secoundryId.equals(other.secoundryId))
			return false;
		return true;
	}
	
	
	

}
