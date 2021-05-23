package com.mightyjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mightyjava.entity.Address;
import com.mightyjava.repository.AddressRepository;
import com.mightyjava.repository.FriendRepository;

@Service
public class AddressServiceImpl implements AddressService {

	
	private AddressRepository addressRepository;
	private FriendRepository friendRepository;

	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository, FriendRepository friendRepository) {
		this.addressRepository = addressRepository;
		this.friendRepository = friendRepository;
	}

	@Override
	public Address saveAddress(Address address) {
		address.setFriend(friendRepository.findById(address.getFriendId()).get());
		return addressRepository.save(address);
	}

	@Override
	public List<Address> addressList() {
		return addressRepository.findAll();
	}

	@Override
	public Address findAddressById(Long id) {
		return addressRepository.findById(id).get();
	}

	@Override
	public Address updateAddress(Address address) {
		//address.setFriend(friendRepository.findById(address.getFriendId()).get());
		//address.setFriend(friendRepository.findById(address.getFriend().getId()).get());
		return addressRepository.save(address);
	}

	@Override
	public void deleteAddress(Long id) {
		addressRepository.deleteById(id);
	}

	@Override
	public List<Address> findAddressByFriendId(Long friendId) {
		return addressRepository.findByFriend(friendRepository.findById(friendId).get());
	}
}
