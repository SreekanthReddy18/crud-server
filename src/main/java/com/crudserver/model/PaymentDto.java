package com.crudserver.model;

public class PaymentDto {

	private int paymentId;
	
	private int amount;
	
	private String creditType;
	
	private String description;
	
	private CustomerDto customerDto;

	public PaymentDto(int paymentId, int amount, String creditType, String description, CustomerDto customerDto) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.creditType = creditType;
		this.description = description;
		this.customerDto = customerDto;
	}

	public PaymentDto() {
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCreditType() {
		return creditType;
	}

	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CustomerDto getCustomerDto() {
		return customerDto;
	}

	public void setCustomerDto(CustomerDto customerDto) {
		this.customerDto = customerDto;
	}

	@Override
	public String toString() {
		return "PaymentDto [paymentId=" + paymentId + ", amount=" + amount + ", creditType=" + creditType
				+ ", description=" + description + ", customerDto=" + customerDto + "]";
	}
	
}
