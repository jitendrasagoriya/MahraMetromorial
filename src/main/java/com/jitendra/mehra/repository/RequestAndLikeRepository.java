package com.jitendra.mehra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jitendra.mehra.domin.RequestAndLike;
import com.jitendra.mehra.domin.RequestAndLikeIdenntity;

public interface RequestAndLikeRepository extends JpaRepository<RequestAndLike, RequestAndLikeIdenntity> {

}
