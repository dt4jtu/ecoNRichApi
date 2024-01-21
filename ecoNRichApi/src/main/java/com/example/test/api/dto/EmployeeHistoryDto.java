package com.example.test.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "사원 이력 조회 Dto")
@Data
public class EmployeeHistoryDto {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private String startDate;
	private String endDate;
	private String jobTitle;
	private String departmentName;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	private String countryName;
	private String regionName;
}
