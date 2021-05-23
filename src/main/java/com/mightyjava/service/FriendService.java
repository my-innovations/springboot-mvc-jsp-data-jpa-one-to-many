package com.mightyjava.service;

import java.util.List;

import com.mightyjava.entity.v2.Friend;

public interface FriendService {
	
	Friend saveOrUpdateFriend(Friend friend);
	Friend findFrind(Long id);
	List<Friend> findAllFriends();
	//Friend updateFriend(Friend friend);
	String deleteFriend(Long id);
}
