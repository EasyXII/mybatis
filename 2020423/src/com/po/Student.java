package com.po;

import java.util.List;

public class Student {
       private int id;
       private int idCard;
       private String name;
       private List<Course> courseList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCard() {
		return idCard;
	}
	public void setIdCard(int idCard) {
		this.idCard = idCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
    public String toString() {
    	return "Student [id=" + id + ", idcard=" + idCard + ", name=" + name + ", courseList=[" + courseList + "]]";
    }
}
