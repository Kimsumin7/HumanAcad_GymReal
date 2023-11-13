package com.human.dto;

public class EmployeeJobDto {
   private Integer employee_id;
   private String name;
   private String email;
   private String phone;
   private Integer salary;
   private Integer commission_pct;
   private Integer center_id;
   private Integer job_id;

   private JobsDto jobsDto;

   public EmployeeJobDto() {
   }

   public EmployeeJobDto(Integer employee_id, String name, String email, String phone, Integer salary,
         Integer commission_pct, Integer center_id, Integer job_id, JobsDto jobsDto) {
      super();
      this.employee_id = employee_id;
      this.name = name;
      this.email = email;
      this.phone = phone;
      this.salary = salary;
      this.commission_pct = commission_pct;
      this.center_id = center_id;
      this.job_id = job_id;
      this.jobsDto = jobsDto;
   }

   @Override
   public String toString() {
      return "EmployeeJobDto [employee_id=" + employee_id + ", name=" + name + ", email=" + email + ", phone=" + phone
            + ", salary=" + salary + ", commission_pct=" + commission_pct + ", center_id=" + center_id + ", job_id="
            + job_id + ", jobsDto=" + jobsDto + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((center_id == null) ? 0 : center_id.hashCode());
      result = prime * result + ((commission_pct == null) ? 0 : commission_pct.hashCode());
      result = prime * result + ((email == null) ? 0 : email.hashCode());
      result = prime * result + ((employee_id == null) ? 0 : employee_id.hashCode());
      result = prime * result + ((job_id == null) ? 0 : job_id.hashCode());
      result = prime * result + ((jobsDto == null) ? 0 : jobsDto.hashCode());
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((phone == null) ? 0 : phone.hashCode());
      result = prime * result + ((salary == null) ? 0 : salary.hashCode());
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
      EmployeeJobDto other = (EmployeeJobDto) obj;
      if (center_id == null) {
         if (other.center_id != null)
            return false;
      } else if (!center_id.equals(other.center_id))
         return false;
      if (commission_pct == null) {
         if (other.commission_pct != null)
            return false;
      } else if (!commission_pct.equals(other.commission_pct))
         return false;
      if (email == null) {
         if (other.email != null)
            return false;
      } else if (!email.equals(other.email))
         return false;
      if (employee_id == null) {
         if (other.employee_id != null)
            return false;
      } else if (!employee_id.equals(other.employee_id))
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
      if (salary == null) {
         if (other.salary != null)
            return false;
      } else if (!salary.equals(other.salary))
         return false;
      return true;
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

   public Integer getCenter_id() {
      return center_id;
   }

   public void setCenter_id(Integer center_id) {
      this.center_id = center_id;
   }

   public Integer getJob_id() {
      return job_id;
   }

   public void setJob_id(Integer job_id) {
      this.job_id = job_id;
   }

   public JobsDto getJobsDto() {
      return jobsDto;
   }

   public void setJobsDto(JobsDto jobsDto) {
      this.jobsDto = jobsDto;
   }
}