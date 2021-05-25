package com.mightyjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mightyjava.entity.v2.Address;
import com.mightyjava.repository.AddressRepository;
import com.mightyjava.repository.FriendRepository;

@Service
public class AddressServiceImpl implements AddressService {

	private FriendRepository friendRepository;
	private AddressRepository addressRepository;

	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository, FriendRepository friendRepository) {
		this.addressRepository = addressRepository;
		this.friendRepository = friendRepository;
	}

	@Override
	public Address saveOrUpdateAddress(Address address) {
		address.setFriend(friendRepository.findById(address.getFriendId()).get());
		return addressRepository.save(address);
	}
	
	@Override
	public Address findAddressByAddressId(Long id) {
		return addressRepository.findById(id).get();
	}

	@Override
	public List<Address> findAllAddresses() {
		return addressRepository.findAll();
	}
	
	@Override
	public List<Address> findAllAddressesByFriendId(Long friendId) {
		return addressRepository.findByFriend(friendRepository.findById(friendId).get());
	}

	/*@Override
	public Address updateAddress(Address address) {
		address.setFriend(friendRepository.findById(address.getFriendId()).get());
		return addressRepository.save(address);
	}*/

	@Override
	public void deleteAddressByAddrId(Long addrId) {
		addressRepository.deleteById(addrId);
	}
}
