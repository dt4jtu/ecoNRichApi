package com.example.test.api.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.api.dto.DepartmentDto;
import com.example.test.api.dto.EmployeeHistoryDto;
import com.example.test.api.dto.EmployeesDto;
import com.example.test.api.dto.SalaryDto;
import com.example.test.api.mapper.ApiMapper;
import com.example.test.api.service.ApiService;

import jakarta.transaction.Transactional;

@Service
public class ApiServiceImpl implements ApiService{
	
	@Autowired
	private ApiMapper apiMapper; 
	
	public EmployeesDto employee(int employeeId) {
		EmployeesDto employee = apiMapper.selectEmployee(employeeId);
		
		return employee;
	}
	
	public List<EmployeeHistoryDto> employeeHistory(int employeeId) {
		List<EmployeeHistoryDto> historyList = apiMapper.selectEmployeeHistory(employeeId);
		
		return historyList;
	}
	
	public List<DepartmentDto> department() {
		List<DepartmentDto> departmentList = apiMapper.selectDepartment();
		
		return departmentList;
	}
	
	@Transactional
	public int departmentSalary(SalaryDto salaryDto) {
		int count = apiMapper.updateDepartmentSalary(salaryDto);
		return count;
	}
}
