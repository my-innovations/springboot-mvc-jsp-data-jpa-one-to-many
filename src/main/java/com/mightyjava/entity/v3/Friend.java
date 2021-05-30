package com.mightyjava.entity.v3;
/*
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//parent entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude="addresses") 
@Entity
@Table(name="FRIEND",uniqueConstraints = {@UniqueConstraint(columnNames = "id")})
public class Friend {

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "f_seq")
	@SequenceGenerator(initialValue = 1, name = "f_seq", sequenceName = "frnd_sequence")
	private Long id;
	
	@NotBlank(message="Please enter firstname")
	@Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
	private String firstName;
	
	@NotBlank(message="Please enter lastname")
	@Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
	private String lastName;
	
	//
	 // Bidirectional one-to-many mapping using join table
	 //
	
	@OneToMany(
			mappedBy = "friend", 
			fetch = FetchType.LAZY, 
			//cascade = {CascadeType.ALL} //This will delete all the assotiated child records while deleting parent record.
			//cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH}
			cascade = {CascadeType.PERSIST,CascadeType.REMOVE}
			//,orphanRemoval = true
			)
	@JoinTable(name="friend_address",joinColumns = @JoinColumn(name="friend_id"),inverseJoinColumns = @JoinColumn(name="address_id"))
	private Set<Address> addresses;
}
*/