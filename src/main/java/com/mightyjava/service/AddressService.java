package com.mightyjava.service;

import java.util.List;

import com.mightyjava.entity.v2.Address;

public interface AddressService {
	
	public Address saveOrUpdateAddress(Address address);
	public Address findAddressByAddressId(Long addrId);
	public List<Address> findAllAddressesByFriendId(Long friendId);
	public List<Address> findAllAddresses();
	public void deleteAddressByAddrId(Long addrId);
}
