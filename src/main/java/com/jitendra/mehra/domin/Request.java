package com.jitendra.mehra.domin;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.jitendra.mehra.enums.RequestStatus;

@Entity
@Table(name="REQUEST")
public class Request implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RequestAndLikeIdenntity id;		
	 
	@Column(name="STATUS", nullable = false)
	private RequestStatus requestStatus;
	
	@Column(name="SENDDATE", nullable = false)
	private Timestamp requestDate;

	 

	/**
	 * @return the id
	 */
	public RequestAndLikeIdenntity getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(RequestAndLikeIdenntity id) {
		this.id = id;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((requestDate == null) ? 0 : requestDate.hashCode());
		result = prime * result + ((requestStatus == null) ? 0 : requestStatus.hashCode());
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
		Request other = (Request) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (requestDate == null) {
			if (other.requestDate != null)
				return false;
		} else if (!requestDate.equals(other.requestDate))
			return false;
		if (requestStatus != other.requestStatus)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Request [id=" + id + ", requestStatus=" + requestStatus + ", requestDate=" + requestDate + "]";
	}
	
	

	 
}
