package com.jitendra.mehra.domin;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.jitendra.mehra.enums.RequestStatus;

@Entity
@Table(name="LIKEANDREQUEST")
public class RequestAndLike implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RequestAndLikeIdenntity id;	
	
	@Column(name="PLIKE", nullable = false)
	private boolean like;
	
	@Column(name="STATUS", nullable = false)
	private RequestStatus requestStatus;
	
	@Column(name="SENDDATE", nullable = false)
	private Timestamp requestDate;

	 

	/**
	 * @return the like
	 */
	public boolean isLike() {
		return like;
	}

	/**
	 * @param like the like to set
	 */
	public void setLike(boolean like) {
		this.like = like;
	}

	/**
	 * @return the requestStatus
	 */
	public RequestStatus getRequestStatus() {
		return requestStatus;
	}

	/**
	 * @param requestStatus the requestStatus to set
	 */
	public void setRequestStatus(RequestStatus requestStatus) {
		this.requestStatus = requestStatus;
	}

	/**
	 * @return the requestDate
	 */
	public Timestamp getRequestDate() {
		return requestDate;
	}

	/**
	 * @param requestDate the requestDate to set
	 */
	public void setRequestDate(Timestamp requestDate) {
		this.requestDate = requestDate;
	}

	 
}
