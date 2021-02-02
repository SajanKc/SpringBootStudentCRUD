package com.kcsajan.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Author Sajan Kc
 * @Date February 2, 2021
 *
 */

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 2, message = "First name should have at least 2 characters.")
	@Column(name = "first_name")
	private String firstName;

	@NotNull
	@Size(min = 2, message = "Last name should have at least 2 characters.")
	@Column(name = "last_name")
	private String lastName;

	@NotNull
	private String address;

	@NotNull
	@Email
	private String email;

	@NotNull
	@Column(name = "phone_num")
	@Size(min = 10)
	private String phoneNum;

	public Student() {
	}

	public Student(Long id,
			@NotNull @Size(min = 2, message = "First name should have at least 2 characters.") String firstName,
			@NotNull @Size(min = 2, message = "Last name should have at least 2 characters.") String lastName,
			@NotNull String address, @NotNull @Email String email, @NotNull @Size(min = 10) String phoneNum) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.phoneNum = phoneNum;
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}
