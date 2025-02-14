package com.driver.model;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverResponse {

	
	private String status;
	private String transporterId;
	private String phoneNum;
	
	private String driverName;
	private String truckId;
}
