package com.cos.security1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.security1.model.User;

//CRUD 함수를 JpaRepository 가 들고 있음
//@Repository 라는 어노테이션이 엇어도 ioC가 ㅏ돼요, 이유는 jparepository를 상속했기때문에
public interface UserRepository extends JpaRepository<User, Integer> {
	
	//findBy 규칙 -> Username 문법
	//select * from user where username=?
	public User findByUsername(String username); //Jpa Query methods
}
