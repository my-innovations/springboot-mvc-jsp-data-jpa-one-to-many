package com.mightyjava.service;

import java.util.List;

import com.mightyjava.entity.v2.Friend;

public interface FriendService {
	Friend saveOrUpdateFriend(Friend friend);
	Friend findFrindById(Long id);
	List<Friend> findAllFriends();
	String deleteFriendById(Long id);
}
