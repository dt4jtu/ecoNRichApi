package com.example.test.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "부서 연봉 수정 Dto")
@Data
public class SalaryDto {
	private int departmentId;
	private int per;
}
