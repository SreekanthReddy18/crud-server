package com.crudserver.model;

import java.util.List;

public class CustomerDto {

	private int customerId;
	
	private String customerName;
	
	private String customerType;
	
	private String address1;
	
	private String address2;
	
	private String city;
	
	private String state;
	
	private String postalCode;

	private String country;
	
	private String email;
	
	private String phone;
	
	private String fax;
	
	private List<PaymentDto> paymentList;
	
	

	public CustomerDto(int customerId, String customerName, String customerType, String address1, String address2,
			String city, String state, String postalCode, String country, String email, String phone, String fax,
			List<PaymentDto> paymentList) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = customerType;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.country = country;
		this.email = email;
		this.phone = phone;
		this.fax = fax;
		this.paymentList = paymentList;
	}

	public CustomerDto() {
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	
	public List<PaymentDto> getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(List<PaymentDto> paymentList) {
		this.paymentList = paymentList;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", customerName=" + customerName + ", customerType="
				+ customerType + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state="
				+ state + ", postalCode=" + postalCode + ", country=" + country + ", email=" + email + ", phone="
				+ phone + ", fax=" + fax + ", paymentList=" + paymentList + "]";
	}
	
}
