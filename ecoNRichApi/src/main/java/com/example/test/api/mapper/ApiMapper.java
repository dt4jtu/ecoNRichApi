package com.example.test.api.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.test.api.dto.DepartmentDto;
import com.example.test.api.dto.EmployeeHistoryDto;
import com.example.test.api.dto.EmployeesDto;
import com.example.test.api.dto.SalaryDto;

@Mapper
public interface ApiMapper {
	EmployeesDto selectEmployee(int employeeId);
	
	List<EmployeeHistoryDto> selectEmployeeHistory(int employeeId);
	
	List<DepartmentDto> selectDepartment();
	
	int updateDepartmentSalary(SalaryDto salaryDto);
}
