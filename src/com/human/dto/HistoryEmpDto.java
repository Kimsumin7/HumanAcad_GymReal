package com.human.dto;

import java.time.LocalDateTime;

public class HistoryEmpDto {
	private Integer job_history_id;
	private LocalDateTime end_date;
	private Integer employee_id;
	private LocalDateTime hire_date;
	
	private EmployeesDto EmpDto;

	public HistoryEmpDto() {}
	public HistoryEmpDto(Integer job_history_id, LocalDateTime end_date, Integer employee_id, LocalDateTime hire_date,
			EmployeesDto empDto) {
		super();
		this.job_history_id = job_history_id;
		this.end_date = end_date;
		this.employee_id = employee_id;
		this.hire_date = hire_date;
		EmpDto = empDto;
	}
	@Override
	public String toString() {
		return "HistoryEmpDto [job_history_id=" + job_history_id + ", end_date=" + end_date + ", employee_id="
				+ employee_id + ", hire_date=" + hire_date + ", EmpDto=" + EmpDto + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EmpDto == null) ? 0 : EmpDto.hashCode());
		result = prime * result + ((employee_id == null) ? 0 : employee_id.hashCode());
		result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
		result = prime * result + ((hire_date == null) ? 0 : hire_date.hashCode());
		result = prime * result + ((job_history_id == null) ? 0 : job_history_id.hashCode());
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
		HistoryEmpDto other = (HistoryEmpDto) obj;
		if (EmpDto == null) {
			if (other.EmpDto != null)
				return false;
		} else if (!EmpDto.equals(other.EmpDto))
			return false;
		if (employee_id == null) {
			if (other.employee_id != null)
				return false;
		} else if (!employee_id.equals(other.employee_id))
			return false;
		if (end_date == null) {
			if (other.end_date != null)
				return false;
		} else if (!end_date.equals(other.end_date))
			return false;
		if (hire_date == null) {
			if (other.hire_date != null)
				return false;
		} else if (!hire_date.equals(other.hire_date))
			return false;
		if (job_history_id == null) {
			if (other.job_history_id != null)
				return false;
		} else if (!job_history_id.equals(other.job_history_id))
			return false;
		return true;
	}
	public Integer getJob_history_id() {
		return job_history_id;
	}
	public void setJob_history_id(Integer job_history_id) {
		this.job_history_id = job_history_id;
	}
	public LocalDateTime getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDateTime end_date) {
		this.end_date = end_date;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public LocalDateTime getHire_date() {
		return hire_date;
	}
	public void setHire_date(LocalDateTime hire_date) {
		this.hire_date = hire_date;
	}
	public EmployeesDto getEmpDto() {
		return EmpDto;
	}
	public void setEmpDto(EmployeesDto empDto) {
		EmpDto = empDto;
	}

	
}
