package com.mightyjava.entity.v1;
/*
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Entity
public class Address { // child entity/table

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addr_seq")
	@SequenceGenerator(initialValue = 1, name = "addr_seq", sequenceName = "addr_sequence")
	private Long id; // PK column
	private String city;
	private String state;
	private String country;
	private String category;
	// for updating the address for the below friendId.
	private transient Long friendId;

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

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", country=" + country + ", category="
				+ category + "]";
	}
}
*/