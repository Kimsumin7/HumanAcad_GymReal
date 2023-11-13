package com.human.dto;

public class DoDto {
	private Integer do_id;
	private String do_name;
	
	public DoDto() {}
	public DoDto(Integer do_id, String do_name) {
		super();
		this.do_id = do_id;
		this.do_name = do_name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((do_id == null) ? 0 : do_id.hashCode());
		result = prime * result + ((do_name == null) ? 0 : do_name.hashCode());
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
		DoDto other = (DoDto) obj;
		if (do_id == null) {
			if (other.do_id != null)
				return false;
		} else if (!do_id.equals(other.do_id))
			return false;
		if (do_name == null) {
			if (other.do_name != null)
				return false;
		} else if (!do_name.equals(other.do_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DoDto [do_id=" + do_id + ", do_name=" + do_name + "]";
	}
	public Integer getDo_id() {
		return do_id;
	}
	public void setDo_id(Integer do_id) {
		this.do_id = do_id;
	}
	public String getDo_name() {
		return do_name;
	}
	public void setDo_name(String do_name) {
		this.do_name = do_name;
	}
	
	
}
