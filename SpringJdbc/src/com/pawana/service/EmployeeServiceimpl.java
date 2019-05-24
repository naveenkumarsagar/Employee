package com.pawana.service;

import com.pawana.dao.EmploeeDAO;
import com.pawana.model.Employee;

public class EmployeeServiceimpl implements EmployeeService {
	private EmploeeDAO dao;
	

	public EmploeeDAO getDao() {
		return dao;
	}


	public void setDao(EmploeeDAO dao) {
		this.dao = dao;
	}


	@Override
	public String saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		int res=dao.saveemployee(emp);
		if(res==1) {
			return "Employee insertion successful";
		}else
			return "Employee Insertion failed";
		
	}

}
