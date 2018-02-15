package com.jitendra.mehra.domin;

import java.io.Serializable;

import com.jitendra.mehra.enums.RequestStatus;

public class LikeRequestAccept implements Serializable {
	
	private Long id;
	
	private Long secoundryId;
	
	private boolean like;
	
	private RequestStatus requestStatus;

}
