package com.human.dto;


public class EmployeeCenterDto {
	private Integer employee_id;
	private String name;
	private String email;
	private String phone;
	private Integer salary;
	private Integer commission_pct;
	private Integer job_id;
	private Integer center_id;

	private CenterDto centerDto;

	
	public EmployeeCenterDto() {};
	public EmployeeCenterDto(Integer employee_id, String name, String email, String phone, Integer salary,
			Integer commission_pct, Integer job_id, Integer center_id, CenterDto centerDto) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.job_id = job_id;
		this.center_id = center_id;
		this.centerDto = centerDto;
	}
	@Override
	public String toString() {
		return "EmployeeCenterDto [employee_id=" + employee_id + ", name=" + name + ", email=" + email + ", phone="
				+ phone + ", salary=" + salary + ", commission_pct=" + commission_pct + ", job_id=" + job_id
				+ ", center_id=" + center_id + ", centerDto=" + centerDto + "]";
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(Integer commission_pct) {
		this.commission_pct = commission_pct;
	}
	public Integer getJob_id() {
		return job_id;
	}
	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}
	public Integer getCenter_id() {
		return center_id;
	}
	public void setCenter_id(Integer center_id) {
		this.center_id = center_id;
	}
	public CenterDto getCenterDto() {
		return centerDto;
	}
	public void setCenterDto(CenterDto centerDto) {
		this.centerDto = centerDto;
	}
	
	
	
	
}
