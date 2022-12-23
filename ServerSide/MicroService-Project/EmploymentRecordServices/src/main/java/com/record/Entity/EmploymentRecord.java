package com.record.Entity;

public class EmploymentRecord {
	
	private Long cId;
	private String cName;
	private String cemail;
	private Integer years;
	
	private Long empId;

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public EmploymentRecord(Long cId, String cName, String cemail, Integer years, Long empId) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cemail = cemail;
		this.years = years;
		this.empId = empId;
	}
	

}
