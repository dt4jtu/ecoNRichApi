package com.example.test.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "부서 및 위치 조회 Dto")
@Data
public class DepartmentDto {
	private String departmentName;
	private String streetAddress;
	private String postalCode;
	private String city;
	private String stateProvince;
	private String countryName;
	private String regionName;
}
