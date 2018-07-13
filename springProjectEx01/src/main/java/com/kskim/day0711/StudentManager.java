package com.kskim.day0711;

import java.util.ArrayList;

public class StudentManager {
	
	private ArrayList<Student> members = new ArrayList<Student>();
	
	
	
	public void showMemberInfo() {
		for(Student s: members) {
			System.out.println(s.toString());
		}
		
	}
	public void addMember(Student s) {
		members.add(s);
	}
	public void setMembers(ArrayList<Student> members) {
		this.members = members;
	}
	

}
