package com.mightyjava.entity.v2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude="friend") 
@Entity
@Table(name="ADDRESS",uniqueConstraints = {@UniqueConstraint(columnNames = "ID")})
public class Address { //child entity/table

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addr_seq")
	@SequenceGenerator(initialValue = 1, name = "addr_seq", sequenceName = "addr_sequence")
	private Long id; //PK column
	
	@NotBlank
	private String city;
	
	@NotBlank
	private String state;
	
	@NotBlank
	private String country;
	
	@NotBlank
	private String category;
	
	@ManyToOne(
			//targetEntity = Friend.class,
			//cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},
			cascade = CascadeType.PERSIST,
			//cascade = CascadeType.REMOVE, //This will remove all the assotiated parent records. do not use this.
			fetch = FetchType.LAZY)
	@JoinColumn(name = "friend_id", nullable = false, updatable = true) // FK column
	private Friend friend; 
	
	// for updating the address record for the below friendId.
	private transient Long friendId;


	/*
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getFriendId() {
		return friendId;
	}

	public void setFriendId(Long friendId) {
		this.friendId = friendId;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", country=" + country + ", category="
				+ category + ", friend=" + friend + "]";
	}*/
}
