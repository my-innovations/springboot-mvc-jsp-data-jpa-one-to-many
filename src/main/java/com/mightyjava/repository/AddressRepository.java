package com.mightyjava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mightyjava.entity.v2.Address;
import com.mightyjava.entity.v2.Friend;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
	
	//@Query("FROM Address a WHERE a.friend.id = :friendId")
	//public List<Address> findAddressesByFriendId(@Param("friendId") Long friendId);
	
	public List<Address> findByFriend(Friend friend);

}
