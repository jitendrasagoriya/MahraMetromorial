package com.jitendra.mehra.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jitendra.mehra.domin.Request;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;

public interface RequestRepository extends JpaRepository<Request, RequestAndLikeIdenntity> {	 
	
	@Query("SELECT r FROM Request r WHERE r.id = :id")
	public Page<Request> get(String id,Pageable pageable);

}
