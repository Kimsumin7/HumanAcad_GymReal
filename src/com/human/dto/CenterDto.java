package com.human.dto;

public class CenterDto {
	private Integer center_id;
	private String street_address;
	private String center_name;
	private Integer si_id;
	
	
	
	public CenterDto() {}
	public CenterDto(Integer center_id, String street_address, String center_name, Integer si_id) {
		super();
		this.center_id = center_id;
		this.street_address = street_address;
		this.center_name = center_name;
		this.si_id = si_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center_id == null) ? 0 : center_id.hashCode());
		result = prime * result + ((center_name == null) ? 0 : center_name.hashCode());
		result = prime * result + ((si_id == null) ? 0 : si_id.hashCode());
		result = prime * result + ((street_address == null) ? 0 : street_address.hashCode());
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
		CenterDto other = (CenterDto) obj;
		if (center_id == null) {
			if (other.center_id != null)
				return false;
		} else if (!center_id.equals(other.center_id))
			return false;
		if (center_name == null) {
			if (other.center_name != null)
				return false;
		} else if (!center_name.equals(other.center_name))
			return false;
		if (si_id == null) {
			if (other.si_id != null)
				return false;
		} else if (!si_id.equals(other.si_id))
			return false;
		if (street_address == null) {
			if (other.street_address != null)
				return false;
		} else if (!street_address.equals(other.street_address))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CenterDto [center_id=" + center_id + ", street_address=" + street_address + ", center_name="
				+ center_name + ", si_id=" + si_id  + "]";
	}
	public Integer getCenter_id() {
		return center_id;
	}
	public void setCenter_id(Integer center_id) {
		this.center_id = center_id;
	}
	public String getStreet_address() {
		return street_address;
	}
	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}
	public String getCenter_name() {
		return center_name;
	}
	public void setCenter_name(String center_name) {
		this.center_name = center_name;
	}
	public Integer getSi_id() {
		return si_id;
	}
	public void setSi_id(Integer si_id) {
		this.si_id = si_id;
	}
	
}
