package com.jitendra.mehra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jitendra.mehra.domin.UserRoles;

public interface UserRolesRepository extends JpaRepository<UserRoles, Long> {
	
	@Query("SELECT ur FROM UserRoles ur WHERE ur.role = :role")
	public List<UserRoles> getByUserRole(@Param("role") String role );
	
	@Query("SELECT ur FROM UserRoles ur WHERE ur.userName = :userName")
	public List<UserRoles> getByUserName(@Param("userName") String userName );

}
