package com.mightyjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mightyjava.entity.v2.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {
	
	@Query("FROM Friend WHERE firstName = :firstName")
	public Friend findByUsername(@Param("firstName") String firstName);
}
