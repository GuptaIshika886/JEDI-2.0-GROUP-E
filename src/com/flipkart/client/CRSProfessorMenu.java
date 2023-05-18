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
public class CRSProfessorMenu {

	public static void menuOptions() {
		System.out.println("1. add grades");
		System.out.println("2. view enrolled students");
	}

	public static void showMenu(int studentId) {

		ProfessorOperationService professor = new ProfessorOperationService();

		Scanner takeInput = new Scanner(System.in);
		while (true) {
			menuOptions();
			int option = takeInput.nextInt();
			switch (option) {
			case 1:
				professor.addGrades(101, "A", "b");
				break;
			case 2:
				professor.viewEnrolledStudents("101");
				break;

			default:
				System.out.println("choose a valid optiopn");
			}
		}
//        ÷takeInput.close();

	}
}