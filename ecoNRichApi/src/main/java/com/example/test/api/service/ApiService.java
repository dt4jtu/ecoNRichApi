package com.example.test.api.service;

import java.util.List;
import java.util.Map;

import com.example.test.api.dto.DepartmentDto;
import com.example.test.api.dto.EmployeeHistoryDto;
import com.example.test.api.dto.EmployeesDto;
import com.example.test.api.dto.SalaryDto;

public interface ApiService {
	EmployeesDto employee(int employeeId);
	
	List<EmployeeHistoryDto> employeeHistory(int employeeId);
	
	List<DepartmentDto> department();
	
	int departmentSalary(SalaryDto salaryDto);
}
