package com.human.dto;


public class EmployeesDto {
	private int employee_id;
	private String name;
	private String email;
	private String phone;
	private int salary;
	private int commission_pct;
	private int center_id;
	private int job_id;

	
	
	
	public EmployeesDto() {}


	public EmployeesDto(int employee_id, String name, String email, String phone, int salary, int commission_pct,
			int center_id, int job_id) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.center_id = center_id;
		this.job_id = job_id;
	}




	@Override
	public String toString() {
		return "EmployeesDto [employee_id=" + employee_id + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", salary=" + salary + ", commission_pct=" + commission_pct + ", center_id=" + center_id + ", job_id="
				+ job_id + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + center_id;
		result = prime * result + commission_pct;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + employee_id;
		result = prime * result + job_id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + salary;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeesDto other = (EmployeesDto) obj;
		if (center_id != other.center_id)
			return false;
		if (commission_pct != other.commission_pct)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employee_id != other.employee_id)
			return false;
		if (job_id != other.job_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
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

	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getCommission_pct() {
		return commission_pct;
	}


	public void setCommission_pct(int commission_pct) {
		this.commission_pct = commission_pct;
	}


	public int getCenter_id() {
		return center_id;
	}


	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}


	public int getJob_id() {
		return job_id;
	}


	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	
	
}
