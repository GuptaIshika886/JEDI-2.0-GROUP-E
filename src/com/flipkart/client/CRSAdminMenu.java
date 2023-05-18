/**
 * 
 */
package com.flipkart.client;

//import com.flipkart.bean.*;
import com.flipkart.services.*;

import java.util.*;

/**
 * @author sri.vyshnavi
 *
 */
public class CRSAdminMenu {
	public static void menuOptions() {
		System.out.println("1. generate report card");
		System.out.println("2. add prof");
		System.out.println("3. approve student registration");
		System.out.println("4. add course");
		System.out.println("5. remove course");
	}

	public static void showMenu() {

		AdminOperationService admin = new AdminOperationService();
		Scanner takeInput = new Scanner(System.in);
		while (true) {
			menuOptions();
			int option = takeInput.nextInt();
			switch (option) {
			case 1:
				admin.generateReportCard();
				break;
			case 2:
				admin.addProfessor();
				break;
			case 3:
				admin.approveStudentRegistration();
				break;
			case 4:
				admin.addCourse();
				break;
			case 5:
				admin.removeCourse();
				break;
			default:
				System.out.println("choose a valid optiopn");
			}
		}

	}
}