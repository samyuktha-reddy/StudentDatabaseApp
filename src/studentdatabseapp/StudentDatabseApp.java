package studentdatabseapp;

import java.util.Scanner;

public class StudentDatabseApp {

	public static void main(String[] args) {
		
		//Ask how many students to add
		System.out.println("Enter the number of students to be enrolled: ");
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		
		//Create n number of students
		Student[] students = new Student[numberOfStudents];
		for(int i=0;i<numberOfStudents;i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		for(int j=0;j<numberOfStudents;j++)
		{
		System.out.println(students[j].showInfo());
	
		}
	}

}
