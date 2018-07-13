package com.kskim.day0711;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	
	private String stdId;
	private String name;
	private double grade;
	private String course;
	
	public Student() {}

	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", grade=" + grade + ", course=" + course + "]";
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println(this.name+"이 삭제되는 시점입니다");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(this.name+"이 생성되는 시점입니다");		
	}
	

}
