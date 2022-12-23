package com.record.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.record.EmploymentRecordServicesApplication;
import com.record.Entity.EmploymentRecord;

@Service
public class RecordServiceImpl implements IRecordService {

	List<EmploymentRecord> list= List.of(
			new EmploymentRecord(101L,"Wipro","Wipro@gmail.com",5,1311L),
			new EmploymentRecord(102L,"TCS","tcs@gmail.com",3,1311L),
			new EmploymentRecord(103L,"TechMahindra","techm@gmail.com",6,1313L),
			new EmploymentRecord(104L,"Cognizant","cts@gmail.com",8,1314L),
			new EmploymentRecord(105L,"Google","ggl@gmail.com",7,1315L),
			new EmploymentRecord(106L,"Lenovo","Wipro@gmail.com",3,1316L),
			new EmploymentRecord(107L,"dell","Wipro@gmail.com",4,1317L),
			new EmploymentRecord(108L,"Samsung","Samsung@gmail.com",18,1318L)
			);
	
	
	
	
	
	
	@Override
	public List<EmploymentRecord> getRecordOfEmployee(Long empId) {
		
		return list.stream().filter(employmentRecord -> employmentRecord.getEmpId().equals(empId)).collect(Collectors.toList());

  }
}					 			 