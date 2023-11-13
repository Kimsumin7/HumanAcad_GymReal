package com.human.dto;

public class SiDto {
	private Integer si_id;
	private String si_name;
	private Integer do_id;
	
	@Override
	public String toString() {
		return "SiDto [si_id=" + si_id + ", si_name=" + si_name + ", do_id=" + do_id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + do_id;
		result = prime * result + si_id;
		result = prime * result + ((si_name == null) ? 0 : si_name.hashCode());
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
		SiDto other = (SiDto) obj;
		if (do_id != other.do_id)
			return false;
		if (si_id != other.si_id)
			return false;
		if (si_name == null) {
			if (other.si_name != null)
				return false;
		} else if (!si_name.equals(other.si_name))
			return false;
		return true;
	}
	public SiDto() {}
	public SiDto(int si_id, String si_name, int do_id) {
		super();
		this.si_id = si_id;
		this.si_name = si_name;
		this.do_id = do_id;
	}
	public int getSi_id() {
		return si_id;
	}
	public void setSi_id(int si_id) {
		this.si_id = si_id;
	}
	public String getSi_name() {
		return si_name;
	}
	public void setSi_name(String si_name) {
		this.si_name = si_name;
	}
	public int getDo_id() {
		return do_id;
	}
	public void setDo_id(int do_id) {
		this.do_id = do_id;
	}
	
	
}
