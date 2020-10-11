package studentdatabseapp;

import java.util.Scanner;

public class Student {
	private String studentID;
	private String fName;
	private String lName;
	private int gradYear;
	private static int id = 1000;
	private String courses=null;
	private int tutionBalance=0;
	private static int courseCost = 600;// default

	// constructor to display name and year

	public Student() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Your First Name: ");
		this.fName = s.nextLine();
		System.out.println("Please Enter Your Last Name: ");
		this.lName = s.nextLine();
		System.out.println("1. Freshman\n2. Junior\n3. Senior\n4. Sophmore\nEnter student class level: ");
		this.gradYear = s.nextInt();
		System.out.println("Student with the full name " + this.fName + " " + this.lName
				+ " is currently enrolled at level " + this.gradYear + " with the student ID " + studentID);
	}

	// generate unique 5 digit ID
	public void setStudentId() {
		id++;
		this.studentID = gradYear + "" + id;
	}



	// view student balance
	public void viewBalance()
	{
		System.out.println("Your balance is: $"+tutionBalance);
	}

	// pay the student tuition fee
	public void payTuition()
	{
		viewBalance();
		System.out.println("Enter your payment of $");
		Scanner sc = new Scanner(System.in);
		int payment=sc.nextInt();
		tutionBalance = tutionBalance-payment;
		System.out.println("Thank you for your payment of: $"+payment);
		viewBalance();
	}

	// enroll in courses
	public void enroll() {
		do {
		System.out.println("Enter the course to enroll(Q is for quit): ");
		Scanner s= new Scanner(System.in);
		String course = s.nextLine();
		if(!course.equals("Q"))
		{
			courses=courses+"\n "+course;
			tutionBalance=tutionBalance+courseCost;
			
		}
		else
		{
			break;
		}
		}while(1!=0);
		//System.out.println("Enrolled in: "+courses);
		//System.out.println("The Tuition Balance is: $"+tutionBalance);
	}
	// Show the status of student with their details
	public String showInfo() {
		return "Name: "+fName+ " "+lName+
				"\nCourses Enrolled: "+ courses+
				"\nBalance: $"+tutionBalance;
	}
}
