package com.pawana.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pawana.model.Employee;
@Repository
public class EmployyDaoImpl implements EmploeeDAO {
	
	//private DataSource ds;
	@Autowired
	private JdbcTemplate jt;
	

	/*public DataSource getDs() {
		return ds;
	}


	public void setDs(DataSource ds) {
		this.ds = ds;
	}
*/

	public JdbcTemplate getJt() {
		return jt;
	}


	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}


	@Override
	public int saveemployee(Employee emp) {
		// TODO Auto-generated method stub
		return jt.update("insert into employee1 values(?,?,?)",emp.getEid(),emp.getEname(),emp.getSal());

			}

}
