package com.pawana.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pawana.controller.EmployeeController;
import com.pawana.model.Employee;

public class JdbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/pawana/cfgs/ApplicationContext.xml");
		EmployeeController empl = ctx.getBean("controller",EmployeeController.class);
		Employee emp = new Employee();
		emp.setEid(123);
		emp.setEname("goutham");
		emp.setSal(25000);
		System.out.println(empl.saveEmployee(emp));
		

	}

}
