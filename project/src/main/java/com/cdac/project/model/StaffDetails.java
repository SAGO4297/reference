package com.cdac.project.model;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="staff_details")
public class StaffDetails {
	
	@Id
	@Column(name="staffid")
	private String staffId;
	
	@Column(name="sname")
	private String sName;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="age")
	private int age;
	
	@Column(name="mob_no")
	private String mobNo;
	
	@Column(name="dept_id")
	private String deptId;
	
	@Column(name="hiredate")
	private Date hireDate;
	
	@Column(name="photo_id")
	private String photoId;
	
	@Column(name="address")
	private String address;

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StaffDetails [staffId=" + staffId + ", sName=" + sName + ", designation=" + designation + ", age=" + age
				+ ", mobNo=" + mobNo + ", deptId=" + deptId + ", hireDate=" + hireDate + ", photoId=" + photoId
				+ ", address=" + address + "]";
	}

	
	
	
}
