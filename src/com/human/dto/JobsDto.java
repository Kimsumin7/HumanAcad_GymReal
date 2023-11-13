package com.human.dto;

public class JobsDto {
	private Integer job_id;
	private String job_title;
	private Integer min_salary;
	private Integer max_salary;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((job_id == null) ? 0 : job_id.hashCode());
		result = prime * result + ((job_title == null) ? 0 : job_title.hashCode());
		result = prime * result + ((max_salary == null) ? 0 : max_salary.hashCode());
		result = prime * result + ((min_salary == null) ? 0 : min_salary.hashCode());
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
		JobsDto other = (JobsDto) obj;
		if (job_id == null) {
			if (other.job_id != null)
				return false;
		} else if (!job_id.equals(other.job_id))
			return false;
		if (job_title == null) {
			if (other.job_title != null)
				return false;
		} else if (!job_title.equals(other.job_title))
			return false;
		if (max_salary == null) {
			if (other.max_salary != null)
				return false;
		} else if (!max_salary.equals(other.max_salary))
			return false;
		if (min_salary == null) {
			if (other.min_salary != null)
				return false;
		} else if (!min_salary.equals(other.min_salary))
			return false;
		return true;
	}
	public Integer getJob_id() {
		return job_id;
	}
	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public Integer getMin_salary() {
		return min_salary;
	}
	public void setMin_salary(Integer min_salary) {
		this.min_salary = min_salary;
	}
	public Integer getMax_salary() {
		return max_salary;
	}
	public void setMax_salary(Integer max_salary) {
		this.max_salary = max_salary;
	}
	@Override
	public String toString() {
		return "JobDto [job_id=" + job_id + ", job_title=" + job_title + ", min_salary=" + min_salary + ", max_salary="
				+ max_salary + "]";
	}
	
	public JobsDto() {};
	public JobsDto(Integer job_id, String job_title, Integer min_salary, Integer max_salary) {
		super();
		this.job_id = job_id;
		this.job_title = job_title;
		this.min_salary = min_salary;
		this.max_salary = max_salary;
	}
	
	
	
}


