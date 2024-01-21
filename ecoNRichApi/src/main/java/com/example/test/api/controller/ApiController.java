package com.example.test.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.api.dto.DepartmentDto;
import com.example.test.api.dto.EmployeeHistoryDto;
import com.example.test.api.dto.EmployeesDto;
import com.example.test.api.dto.SalaryDto;
import com.example.test.api.service.ApiService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/api")
@Tag(name = "API", description = "API")
public class ApiController {
	
	@Autowired
	private ApiService apiService;
    
    @GetMapping("/employee")
    @ResponseBody
    @Operation(summary="사원 조회", description = "특정 사원의 현재 정보를 조회")
    public EmployeesDto employee(@RequestParam(value="employeeId") int employeeId ) {
    	EmployeesDto employee = apiService.employee(employeeId);
    	
        return employee;
    }
    
    @GetMapping("/employeeHistory")
    @ResponseBody
    @Operation(summary="사원 이력 조회", description = "특정 사원의 이력 정보를 조회")
    public List<EmployeeHistoryDto> employeeHistory(@RequestParam(value="employeeId")int employeeId) {
    	List<EmployeeHistoryDto> employeeHistory = apiService.employeeHistory(employeeId);
    	
        return employeeHistory;
    }
    
    @GetMapping("/department")
    @ResponseBody
    @Operation(summary="부서 조회", description = "부서 및 위치 정보 조회")
    public List<DepartmentDto> department() {
    	List<DepartmentDto> departmentList = apiService.department();
    	
        return departmentList;
    }
    
    @PostMapping("/departmentSalary")
    @Operation(summary="부서 급여 수정", description = "특정 부서의 급여를 수정")
    public int departmentSalary(@RequestBody SalaryDto salaryDto) {
    	int count = apiService.departmentSalary(salaryDto);
    	return count;
    }
}