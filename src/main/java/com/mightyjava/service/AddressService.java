package com.mightyjava.service;

import java.util.List;

import com.mightyjava.entity.v2.Address;

public interface AddressService {
	
	public Address saveOrUpdateAddress(Address address);
	public Address findAddressByAddressId(Long id);
	public List<Address> findAllAddressesByFriendId(Long friendId);
	public List<Address> findAllAddresses();
	public void deleteAddressById(Long id);
}
