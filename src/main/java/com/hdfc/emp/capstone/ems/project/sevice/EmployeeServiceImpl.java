package com.hdfc.emp.capstone.ems.project.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.emp.capstone.ems.project.entity.Employee;
import com.hdfc.emp.capstone.ems.project.exception.InValidEmployeeIDException;
import com.hdfc.emp.capstone.ems.project.repository.EmployeeRepository;
import com.hdfc.emp.capstone.ems.project.vo.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired(required=true)
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException {
		Employee employee = employeeRepository.findById(employeeID).orElseThrow(
				() -> new InValidEmployeeIDException("Invalid EmployeeId : " + employeeID));
		EmployeeVO employeeVO = new EmployeeVO(employee.getEmployeeID(), employee.getEmployeeName(), employee.getDateOfBirth());
		return employeeVO;
	}
	
	
	
}


