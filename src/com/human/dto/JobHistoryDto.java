package com.human.dto;

import java.time.LocalDateTime;

public class JobHistoryDto {
	private Integer job_history_id;
	private Integer job_id;
	private LocalDateTime end_date;
	private Integer employee_id;
	private Integer category_id;
	private LocalDateTime hire_date;

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

	public JobHistoryDto(Integer job_history_id, Integer job_id, LocalDateTime end_date, Integer employee_id,
			Integer category_id, LocalDateTime hire_date) {
		super();
		this.job_history_id = job_history_id;
		this.job_id = job_id;
		this.end_date = end_date;
		this.employee_id = employee_id;
		this.category_id = category_id;
		this.hire_date = hire_date;
	}

	public JobHistoryDto() {
	}
}
