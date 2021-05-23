package com.mightyjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mightyjava.entity.v2.Friend;

public interface FriendRepository extends JpaRepository<Friend, Long> {
	
	@Query("FROM Friend WHERE firstName = :firstName")
	Friend findByUsername(@Param("firstName") String firstName);
}
