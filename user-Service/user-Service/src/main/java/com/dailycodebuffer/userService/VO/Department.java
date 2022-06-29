package com.dailycodebuffer.userService.VO;

public class Department {

	private Long departmentid;
	private String departmentName;
	private String departmentaddress;
	private String departmentcode;
	
	
	public Department(Long departmentid, String departmentName, String departmentaddress, String departmentcode) {
		super();
		this.departmentid = departmentid;
		this.departmentName = departmentName;
		this.departmentaddress = departmentaddress;
		this.departmentcode = departmentcode;
	}
	
	public Department() {
		
	}
	
	
	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentName=" + departmentName
				+ ", departmentaddress=" + departmentaddress + ", departmentcode=" + departmentcode + "]";
	}

	public Long getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentaddress() {
		return departmentaddress;
	}
	public void setDepartmentaddress(String departmentaddress) {
		this.departmentaddress = departmentaddress;
	}
	public String getDepartmentcode() {
		return departmentcode;
	}
	public void setDepartmentcode(String departmentcode) {
		this.departmentcode = departmentcode;
	}
	
	
}
