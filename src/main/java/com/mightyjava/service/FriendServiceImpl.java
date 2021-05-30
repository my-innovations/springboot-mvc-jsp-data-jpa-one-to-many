package com.mightyjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mightyjava.entity.v2.Friend;
import com.mightyjava.repository.FriendRepository;

@Service
public class FriendServiceImpl implements FriendService {

	private FriendRepository friendRepository;

	@Autowired
	public FriendServiceImpl(FriendRepository userRepository) {
		this.friendRepository = userRepository;
	}

	@Override
	public Friend findFrindById(Long id) {
		return friendRepository.findById(id).get();
	}

	@Override
	public List<Friend> findAllFriends() {
		return friendRepository.findAll();
	}

	@Override
	public Friend saveOrUpdateFriend(Friend friend) {
		return friendRepository.save(friend);
	}

	@Override
	public String deleteFriendById(Long id) {
		friendRepository.deleteById(id);
		return "{'message':'Friend deleted successfully.'}";
	}
}
