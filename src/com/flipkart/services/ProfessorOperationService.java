/**
 * 
 */
package com.flipkart.services;

/**
 * @author rahul.kumarsingh
 *
 */
public class ProfessorOperationService {

	public void addGrades(int studentId, String courseId, String grade) {
		System.out.println("added grades");

	}

	public void viewEnrolledStudents(String courseId) {
		System.out.println("showing students from the course " + courseId);
	}

}
