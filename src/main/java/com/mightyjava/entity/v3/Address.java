package com.mightyjava.entity.v3;
/*
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

//child entity/table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude="friend") 
@Entity
@Table(name="ADDRESS",uniqueConstraints = {@UniqueConstraint(columnNames = "ID")})
public class Address { 

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
	
	 //
	 // Bidirectional one-to-many mapping using join table
	 //
	
	@ManyToOne(
			//targetEntity = Friend.class,
			//cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},
			cascade = CascadeType.PERSIST,
			//cascade = CascadeType.REMOVE, //This will remove all the assotiated parent records. do not use this.
			fetch = FetchType.LAZY)
	private Friend friend; 
	
	// for updating the address record for the below friendId.
	private transient Long friendId;

}*/
