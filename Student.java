package com.lti;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private int roolNo;
	private String studentName;
	private String courseName;

	public int getRoolNo() {
		return roolNo;
	}

	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
