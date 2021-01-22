package com.mightyjava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addr_seq")
	@SequenceGenerator(initialValue = 1, name = "addr_seq", sequenceName = "addr_sequence")
	private Long id; //PK
	private String city;
	private String state;
	private String country;
	private String category;

	// for updating the address for the below friendId.
	private transient Long friendId;

	//@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@ManyToOne
	@JoinColumn(name = "friend_id", nullable = false, updatable = false) 
	private Friend friend; // FK column  friend_id in Address table.

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public Long getFriendId() {
		return friendId;
	}

	public void setFriendId(Long friendId) {
		this.friendId = friendId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", country=" + country + ", category="
				+ category + ", friend=" + friend + "]";
	}
}
