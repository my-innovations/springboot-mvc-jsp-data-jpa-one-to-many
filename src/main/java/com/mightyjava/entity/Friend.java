package com.mightyjava.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Entity
@Table
public class Friend {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "f_seq")
	@SequenceGenerator(initialValue = 1, name = "f_seq", sequenceName = "frnd_sequence")
	private Long id; //PK
	private String firstName;
	private String lastName;

	@OneToMany(targetEntity = Address.class, mappedBy = "friend", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Address> addresses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", addresses=" + addresses
				+ "]";
	}

	
}
