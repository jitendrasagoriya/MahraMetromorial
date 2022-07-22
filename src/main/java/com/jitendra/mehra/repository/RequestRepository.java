package com.jitendra.mehra.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jitendra.mehra.domin.Request;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;
import com.jitendra.mehra.enums.RequestStatus;

public interface RequestRepository extends JpaRepository<Request, RequestAndLikeIdenntity> {	 
	
	@Query("SELECT r FROM Request r WHERE r.id.id = :id")
	public Page<Request> send(@Param("id") String id,Pageable pageable);
	
	@Transactional
	@Modifying
	@Query("UPDATE  Request r SET r.requestStatus = :status WHERE r.id.id = :id AND r.id.secoundryId = :sId")
	public int updateStatus(@Param("id") String id,@Param("sId") String sId , @Param("status") RequestStatus status );
	
	@Transactional
	@Modifying
	@Query("UPDATE  Request r SET r.requestStatus = 1 WHERE r.id.id = :id AND r.id.secoundryId = :sId")
	public int accept(@Param("id") String id,@Param("sId") String sId  );
	
	@Transactional
	@Modifying
	@Query("UPDATE  Request r SET r.requestStatus = 2 WHERE r.id.id = :id AND r.id.secoundryId = :sId")
	public int decline(@Param("id") String id,@Param("sId") String sId  );
	
	@Transactional
	@Modifying
	@Query("UPDATE  Request r SET r.requestStatus = 3 WHERE r.id.id = :id AND r.id.secoundryId = :sId")
	public int waiting(@Param("id") String id,@Param("sId") String sId  );
	
	@Query("SELECT r FROM Request r WHERE r.id.secoundryId = :id")
	public Page<Request> recivied(@Param("id") String id,Pageable pageable);

}
