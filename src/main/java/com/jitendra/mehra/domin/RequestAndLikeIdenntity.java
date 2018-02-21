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
	private Long id;
	
	@NotNull
	@Column(name="SECOUNDID", nullable = false)
	private Long secoundryId;

	/**
	 * @param id
	 * @param secoundryId
	 */
	public RequestAndLikeIdenntity(Long id, Long secoundryId) {
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
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the secoundryId
	 */
	public Long getSecoundryId() {
		return secoundryId;
	}

	/**
	 * @param secoundryId the secoundryId to set
	 */
	public void setSecoundryId(Long secoundryId) {
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
