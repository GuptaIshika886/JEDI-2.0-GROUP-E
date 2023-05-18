/**
 * 
 */
package com.flipkart.services;

/**
 * @author rahul.kumarsingh
 *
 */
public class StudentOperationService {

	public void addCourse(int studentId, int courseId) {
		System.out.println("added course " + courseId + " to the student Id " + studentId);

	}

	public void dropCourse(int studentId, int courseId) {
		System.out.println("dropped course " + courseId + " to the student Id " + studentId);

	}

	public void viewGradeCard(int studentId) {
		System.out.println("generated report card for " + studentId);

	}

	public void makePayment(int studentId) {
		System.out.println("done payment successfully");

	}

	public void semesterRegistration(int studentId, int semester) {
		System.out.println("semeseter registration for student " + studentId + " is done for semester " + semester);

	}

}
