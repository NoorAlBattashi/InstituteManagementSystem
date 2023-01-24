/**
 * 
 */
package com.ims;

import java.util.Scanner;

/**
 * @author LAP-9
 *
 */
public class ComputerScience extends Department {
//	Enrollment addEnrollment = new Enrollment();
	@Override
	public void registerMembers() {
		System.out.println("What do you want to register in the Computer Sceince Department? ");
		System.out.println("select what you want: 1- register a teacher, 2- register a student");
		Scanner userInputScanner = new Scanner(System.in);
		int store = userInputScanner.nextInt();
		if(store == 1) {
			Staff registerTeacherStaff = new Teacher();
			registerTeacherStaff.addStaff();
		}else if (store == 2) {
			Student registerStudent = new Student();
		}
		
	}
	@Override
	public void removeMembers() {
		System.out.print("Remove a student");
	}
	@Override
	public void updateMembersInfo() {
		System.out.print("update student information");
	}
	@Override
	public void addCourse() {
		System.out.print("Add course");
	}
	
	public ComputerScience(){
		
	}
	

}
