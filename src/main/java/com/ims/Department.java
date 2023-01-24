/**
 * 
 */
package com.ims;

import java.util.ArrayList;

/**
 * @author LAP-9
 *
 */
public class Department {
	public String departmentId;
	public String departmentName;
	public ArrayList<Staff> listOfStaffMember = new ArrayList<>();
	public ArrayList<Student> listOfStudents = new ArrayList<>();
	public Staff headOfDepartment = new Staff();

	public Department() {

	}

	public void registerMembers() {
		System.out.print("Generic way of registering Members");
	}

	public void removeMembers() {
		System.out.print("Generic way of removing Members");
	}

	public void updateMembersInfo() {
		System.out.print("Generic way of updating members information");
	}

	public void addCourse() {
		System.out.print("Generic way of adding course");
	}

}
