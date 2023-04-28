package com.hdfc.emp.capstone.ems.project.sevice;

import com.hdfc.emp.capstone.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.emp.capstone.ems.project.vo.EmployeeVO;

public interface EmployeeService {

	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException;

}
