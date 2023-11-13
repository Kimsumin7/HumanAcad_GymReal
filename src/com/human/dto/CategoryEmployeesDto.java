package com.human.dto;

public class CategoryEmployeesDto {
   private Integer category_id;
   private String category_name;
   private EmployeesDto EmployeesDto;
   
   public CategoryEmployeesDto() {}

   public CategoryEmployeesDto(Integer category_id, String category_name, com.human.dto.EmployeesDto employeesDto) {
      super();
      this.category_id = category_id;
      this.category_name = category_name;
      EmployeesDto = employeesDto;
   }

   public Integer getCategory_id() {
      return category_id;
   }

   public void setCategory_id(Integer category_id) {
      this.category_id = category_id;
   }

   public String getCategory_name() {
      return category_name;
   }

   public void setCategory_name(String category_name) {
      this.category_name = category_name;
   }

   public EmployeesDto getEmployeesDto() {
      return EmployeesDto;
   }

   public void setEmployeesDto(EmployeesDto employeesDto) {
      EmployeesDto = employeesDto;
   }

   @Override
   public String toString() {
      return "CategoryEmployeesDto [category_id=" + category_id + ", category_name=" + category_name
            + ", EmployeesDto=" + EmployeesDto + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((EmployeesDto == null) ? 0 : EmployeesDto.hashCode());
      result = prime * result + ((category_id == null) ? 0 : category_id.hashCode());
      result = prime * result + ((category_name == null) ? 0 : category_name.hashCode());
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
      CategoryEmployeesDto other = (CategoryEmployeesDto) obj;
      if (EmployeesDto == null) {
         if (other.EmployeesDto != null)
            return false;
      } else if (!EmployeesDto.equals(other.EmployeesDto))
         return false;
      if (category_id == null) {
         if (other.category_id != null)
            return false;
      } else if (!category_id.equals(other.category_id))
         return false;
      if (category_name == null) {
         if (other.category_name != null)
            return false;
      } else if (!category_name.equals(other.category_name))
         return false;
      return true;
   };
   
   
   
   
   
   
}