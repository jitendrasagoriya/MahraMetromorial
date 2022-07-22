package com.jitendra.mehra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jitendra.mehra.domin.User;

public interface UserRepository  extends JpaRepository<User,String > {

}
