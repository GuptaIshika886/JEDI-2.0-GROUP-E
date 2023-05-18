/**
 * 
 */
package com.flipkart.client;

import com.flipkart.bean.*;

import com.flipkart.services.*;

import java.util.*;

/**
 * @author sri.vyshnavi
 *
 */
public class CRSStudentMenu {

	public static void menuOptions() {
		System.out.println("1. register for courses");
		System.out.println("2. add courses");
		System.out.println("3. drop courses");
		System.out.println("4. view grades");
		System.out.println("5. pay fees");
	}

	public static void showMenu(int studentId) {

		StudentOperationService student = new StudentOperationService();

		while (true) {
			menuOptions();
			Scanner takeInput = new Scanner(System.in);
			int option = takeInput.nextInt();
			switch (option) {
			case 1:
				student.semesterRegistration(studentId, 2);
				break;
			case 2:
				student.addCourse(studentId, 1);
				break;
			case 3:
				student.dropCourse(studentId, 1);
				break;
			case 4:
				student.viewGradeCard(studentId);
				break;
			case 5:
				student.makePayment(studentId);
				break;
			default:
				System.out.println("choose a valid optiopn");
			}
		}
	}
}