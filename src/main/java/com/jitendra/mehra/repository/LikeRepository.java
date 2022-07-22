package com.jitendra.mehra.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jitendra.mehra.domin.Like;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;

public interface LikeRepository extends JpaRepository<Like, RequestAndLikeIdenntity> {
	
	@Query("SELECT l FROM Like l WHERE l.id.id = :id")
	public Page<Like> send(@Param("id") String id,Pageable pageable);
	
	@Query("SELECT l FROM Like l WHERE l.id.secoundryId = :id")
	public Page<Like> recivied(@Param("id") String id,Pageable pageable);

}
