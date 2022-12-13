package com.tpi.crud.dao.api;

import com.tpi.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserDaoAPI extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
