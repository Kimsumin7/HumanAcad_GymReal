package com.human.dto;

import java.time.LocalDateTime;

public class JobHistoryJoinDto {
	private Integer job_history_id;
	private Integer job_id;
	private LocalDateTime end_date;
	private Integer employee_id;
	private Integer category_id;
	private LocalDateTime hire_date;
	
	private JobsDto jobsDto;
	private CategoryDto categoryDto;
	private EmployeesDto employeesDto;
	
	public JobHistoryJoinDto() {}

	public JobHistoryJoinDto(Integer job_history_id, Integer job_id, LocalDateTime end_date, Integer employee_id,
			Integer category_id, LocalDateTime hire_date, JobsDto jobsDto, CategoryDto categoryDto,
			EmployeesDto employeesDto) {
		super();
		this.job_history_id = job_history_id;
		this.job_id = job_id;
		this.end_date = end_date;
		this.employee_id = employee_id;
		this.category_id = category_id;
		this.hire_date = hire_date;
		this.jobsDto = jobsDto;
		this.categoryDto = categoryDto;
		this.employeesDto = employeesDto;
	}

	@Override
	public String toString() {
		return "JobHistoryJoinDto [job_history_id=" + job_history_id + ", job_id=" + job_id + ", end_date=" + end_date
				+ ", employee_id=" + employee_id + ", category_id=" + category_id + ", hire_date=" + hire_date
				+ ", jobsDto=" + jobsDto + ", categoryDto=" + categoryDto + ", employeesDto=" + employeesDto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryDto == null) ? 0 : categoryDto.hashCode());
		result = prime * result + ((category_id == null) ? 0 : category_id.hashCode());
		result = prime * result + ((employee_id == null) ? 0 : employee_id.hashCode());
		result = prime * result + ((employeesDto == null) ? 0 : employeesDto.hashCode());
		result = prime * result + ((end_date == null) ? 0 : end_date.hashCode());
		result = prime * result + ((hire_date == null) ? 0 : hire_date.hashCode());
		result = prime * result + ((job_history_id == null) ? 0 : job_history_id.hashCode());
		result = prime * result + ((job_id == null) ? 0 : job_id.hashCode());
		result = prime * result + ((jobsDto == null) ? 0 : jobsDto.hashCode());
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
		JobHistoryJoinDto other = (JobHistoryJoinDto) obj;
		if (categoryDto == null) {
			if (other.categoryDto != null)
				return false;
		} else if (!categoryDto.equals(other.categoryDto))
			return false;
		if (category_id == null) {
			if (other.category_id != null)
				return false;
		} else if (!category_id.equals(other.category_id))
			return false;
		if (employee_id == null) {
			if (other.employee_id != null)
				return false;
		} else if (!employee_id.equals(other.employee_id))
			return false;
		if (employeesDto == null) {
			if (other.employeesDto != null)
				return false;
		} else if (!employeesDto.equals(other.employeesDto))
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
		if (job_id == null) {
			if (other.job_id != null)
				return false;
		} else if (!job_id.equals(other.job_id))
			return false;
		if (jobsDto == null) {
			if (other.jobsDto != null)
				return false;
		} else if (!jobsDto.equals(other.jobsDto))
			return false;
		return true;
	}

	public Integer getJob_history_id() {
		return job_history_id;
	}

	public void setJob_history_id(Integer job_history_id) {
		this.job_history_id = job_history_id;
	}

	public Integer getJob_id() {
		return job_id;
	}

	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
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

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public LocalDateTime getHire_date() {
		return hire_date;
	}

	public void setHire_date(LocalDateTime hire_date) {
		this.hire_date = hire_date;
	}

	public JobsDto getJobsDto() {
		return jobsDto;
	}

	public void setJobsDto(JobsDto jobsDto) {
		this.jobsDto = jobsDto;
	}

	public CategoryDto getCategoryDto() {
		return categoryDto;
	}

	public void setCategoryDto(CategoryDto categoryDto) {
		this.categoryDto = categoryDto;
	}

	public EmployeesDto getEmployeesDto() {
		return employeesDto;
	}

	public void setEmployeesDto(EmployeesDto employeesDto) {
		this.employeesDto = employeesDto;
	}
	
	
	
}
