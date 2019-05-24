package com.pawana.controller;

import com.pawana.model.Employee;
import com.pawana.service.EmployeeService;

public class EmployeeController {
	private EmployeeService service;

	public EmployeeService getService() {
		return service;
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}
	public String saveEmployee(Employee emp) {
		return service.saveEmployee(emp);
		
	}

}
