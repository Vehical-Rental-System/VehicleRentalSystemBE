package com.vehicle.rental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String fName;
	private String lName;
	private String email; 
	
	@Column(nullable = false, length = 20, unique = true)
	private String licenseNumber;
	@Column(nullable = false, length = 20)
    private String mobileNumber;
	@Column(nullable = false, length = 12)
    private String aadhaarNumber;
	
	 private String vehicleType;
	 
	 @Column(nullable = false, length = 15, unique = true)
	 private String vehicleNumber;

	 
	 
	 
	 
	public Customer(int customerId, String fName, String lName, String email, String licenseNumber, String mobileNumber,
			String aadhaarNumber, String vehicleType, String vehicleNumber) {
		super();
		this.customerId = customerId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.licenseNumber = licenseNumber;
		this.mobileNumber = mobileNumber;
		this.aadhaarNumber = aadhaarNumber;
		this.vehicleType = vehicleType;
		this.vehicleNumber = vehicleNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", licenseNumber=" + licenseNumber + ", mobileNumber=" + mobileNumber + ", aadhaarNumber="
				+ aadhaarNumber + ", vehicleType=" + vehicleType + ", vehicleNumber=" + vehicleNumber + "]";
	}
	
	
	
	
	
	
}
