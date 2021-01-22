package com.mightyjava.service;

import java.util.List;

import com.mightyjava.entity.Address;

public interface AddressService {
	
	Address saveAddress(Address address);
	Address findAddressById(Long id);
	List<Address> findAddressByFriendId(Long friendId);
	List<Address> addressList();
	public Address updateAddress(Address address);
	void deleteAddress(Long id);
}
