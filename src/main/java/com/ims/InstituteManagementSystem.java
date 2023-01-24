/**
 * 
 */
package com.ims;

import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.AuthenticationException;

/**
 * @author LAP-9
 *
 */
public class InstituteManagementSystem {

	public static void main(String[] args) {

		InstituteManagementSystem ins = new InstituteManagementSystem();
		System.out.println("select what you want: 1- register a member, 2- remove a member");
		Scanner userInputScanner = new Scanner(System.in);
		int store = userInputScanner.nextInt();

		if (store == 1) {
			// register a member
			computerScience.registerMembers();
		} else if (store == 2) {
			// remove a member
			computerScience.removeMembers();
		}
		userInputScanner.close();
	}

	public static Department computerScience = new ComputerScience();
	public static ArrayList<Department> listOfDepartments = new ArrayList<>();
}
