package com.cg.bookStore.entity;



import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "bookStore_customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	@Id
	@SequenceGenerator(name="customerIdGenerator", initialValue=100 ,allocationSize=100)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="customerIdGenerator")
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name = "full_name", length = 30)
	private String fullName;

	@Column(name = "email", length = 64, unique=true)
	private String emailAddress;

	@Column(name = "password", length = 16)
	private String password;

	@Column(name = "phone_no", length = 15)
	private String phoneNumber;

	@Column(name = "address", length = 128)
	private String address;
	
	@Column(name = "city", length = 32)
	private String city;

	@Column(name = "zip_code", length= 24)
	private Integer zipCode;

	@Column(name = "country", length = 64)
	private String country;
	
	@CreationTimestamp
	@Column(name="register_date")
	private LocalDate registerDate;

	public Customer() {
		super();
	}
	
	public Customer(String fullName, String emailAddress, String password, String phoneNumber, String address, String city,
			Integer zipCode, String country, int customerId , LocalDate registerDate)
	{
		super();
		this.fullName=fullName;
		this.emailAddress=emailAddress;
		this.password=password;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.city=city;
		this.zipCode=zipCode;
		this.country=country;
		this.customerId=customerId;
		this.registerDate=registerDate;
		
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public LocalDate getRegisterDate() {
		return registerDate;
	}


}

