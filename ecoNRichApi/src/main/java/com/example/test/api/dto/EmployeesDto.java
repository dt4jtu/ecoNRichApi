package com.example.test.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "사원 조회 Dto")
@Data
public class EmployeesDto {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private String jobTitle;
	private Double salary;
	private Double commissionPct;
	private String ManagerFirstName;
	private String ManagerLastName;
	private String departmentName;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	private String countryName;
	private String regionName;
}
