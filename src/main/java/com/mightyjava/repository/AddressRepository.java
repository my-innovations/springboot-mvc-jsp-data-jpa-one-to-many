package com.mightyjava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mightyjava.entity.v2.Address;
import com.mightyjava.entity.v2.Friend;

public interface AddressRepository extends JpaRepository<Address, Long> {
	
	//@Query("FROM Address a WHERE a.friend.id = :friendId")
	//public List<Address> findAddressesByFriendId(@Param("friendId") Long friendId);
	
	List<Address> findByFriend(Friend friend);

}
