package com.Employee.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Employee.Entity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	
	List<Employee> list= List.of(
			new Employee(1311L,"Gouraba Jati","12345678"),
			new Employee(132L,"Patho Dutta","12345678"),
			new Employee(133L,"Goutam Jati","12345678"),
			new Employee(134L,"Gouranga jati","12345678"),
			new Employee(135L,"Gouraba Jati","12345678"),
			new Employee(136L,"Gouraba Jati","12345678")
			
			
			
			);
	
	@Override
	public Employee getEmployee(Long id) {
		
		return list.stream().filter(employee -> employee.getEmpId().equals(id)).findAny().orElse(null) ;
	}

}
  