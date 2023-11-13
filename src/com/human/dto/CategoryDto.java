package com.human.dto;

public class CategoryDto {
	private int category_id;
	private String category_name;
	private int center_id;
	
	public CategoryDto() {}
	public CategoryDto(int category_id, String category_name, int center_id) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.center_id = center_id;
	}
	@Override
	public String toString() {
		return "CategoryDto [category_id=" + category_id + ", category_name=" + category_name + ", center_id="
				+ center_id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + category_id;
		result = prime * result + ((category_name == null) ? 0 : category_name.hashCode());
		result = prime * result + center_id;
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
		CategoryDto other = (CategoryDto) obj;
		if (category_id != other.category_id)
			return false;
		if (category_name == null) {
			if (other.category_name != null)
				return false;
		} else if (!category_name.equals(other.category_name))
			return false;
		if (center_id != other.center_id)
			return false;
		return true;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public int getCenter_id() {
		return center_id;
	}
	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}
	
	
}
