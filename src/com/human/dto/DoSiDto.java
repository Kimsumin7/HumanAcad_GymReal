package com.human.dto;

public class DoSiDto {
	private Integer si_id;
	private String si_name;
	private Integer do_id;
	private DoDto doDto;
	
	public DoSiDto() {}
	public DoSiDto(Integer si_id, String si_name, Integer do_id, DoDto doDto) {
		super();
		this.si_id = si_id;
		this.si_name = si_name;
		this.do_id = do_id;
		this.doDto = doDto;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doDto == null) ? 0 : doDto.hashCode());
		result = prime * result + ((do_id == null) ? 0 : do_id.hashCode());
		result = prime * result + ((si_id == null) ? 0 : si_id.hashCode());
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
		DoSiDto other = (DoSiDto) obj;
		if (doDto == null) {
			if (other.doDto != null)
				return false;
		} else if (!doDto.equals(other.doDto))
			return false;
		if (do_id == null) {
			if (other.do_id != null)
				return false;
		} else if (!do_id.equals(other.do_id))
			return false;
		if (si_id == null) {
			if (other.si_id != null)
				return false;
		} else if (!si_id.equals(other.si_id))
			return false;
		if (si_name == null) {
			if (other.si_name != null)
				return false;
		} else if (!si_name.equals(other.si_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "DoSiDto [si_id=" + si_id + ", si_name=" + si_name + ", do_id=" + do_id + ", doDto=" + doDto + "]";
	}
	public Integer getSi_id() {
		return si_id;
	}
	public void setSi_id(Integer si_id) {
		this.si_id = si_id;
	}
	public String getSi_name() {
		return si_name;
	}
	public void setSi_name(String si_name) {
		this.si_name = si_name;
	}
	public Integer getDo_id() {
		return do_id;
	}
	public void setDo_id(Integer do_id) {
		this.do_id = do_id;
	}
	public DoDto getDoDto() {
		return doDto;
	}
	public void setDoDto(DoDto doDto) {
		this.doDto = doDto;
	}
	
//	public DoSiDto(Integer si_id, String si_name, Integer do_id, DoDto do_name) {
//		super();
//		this.si_id = si_id;
//		this.si_name = si_name;
//		this.do_id = do_id;
//		this.do_name = do_name;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((do_id == null) ? 0 : do_id.hashCode());
//		result = prime * result + ((do_name == null) ? 0 : do_name.hashCode());
//		result = prime * result + ((si_id == null) ? 0 : si_id.hashCode());
//		result = prime * result + ((si_name == null) ? 0 : si_name.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		DoSiDto other = (DoSiDto) obj;
//		if (do_id == null) {
//			if (other.do_id != null)
//				return false;
//		} else if (!do_id.equals(other.do_id))
//			return false;
//		if (do_name == null) {
//			if (other.do_name != null)
//				return false;
//		} else if (!do_name.equals(other.do_name))
//			return false;
//		if (si_id == null) {
//			if (other.si_id != null)
//				return false;
//		} else if (!si_id.equals(other.si_id))
//			return false;
//		if (si_name == null) {
//			if (other.si_name != null)
//				return false;
//		} else if (!si_name.equals(other.si_name))
//			return false;
//		return true;
//	}
//	@Override
//	public String toString() {
//		return "DoSiDto [si_id=" + si_id + ", si_name=" + si_name + ", do_id=" + do_id + ", do_name=" + do_name + "]";
//	}
//	public Integer getSi_id() {
//		return si_id;
//	}
//	public void setSi_id(Integer si_id) {
//		this.si_id = si_id;
//	}
//	public String getSi_name() {
//		return si_name;
//	}
//	public void setSi_name(String si_name) {
//		this.si_name = si_name;
//	}
//	public Integer getDo_id() {
//		return do_id;
//	}
//	public void setDo_id(Integer do_id) {
//		this.do_id = do_id;
//	}
//	public DoDto getDo_name() {
//		return do_name;
//	}
//	public void setDo_name(DoDto do_name) {
//		this.do_name = do_name;
//	}
//	
	
}
