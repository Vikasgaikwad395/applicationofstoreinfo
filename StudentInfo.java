import java.util.Scanner;


public class StudentInfo {
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter the StudentId: ");
			int StudentId = in.nextInt();
			
			System.out.println("Eneter Student name:  ");
			String StudentName = in.next();
			
			System.out.println("Enter a Subject marks English: ");
			int s1 = in.nextInt();
			
			System.out.println("Enter a Subject marks Hindi: ");
			int s2 = in.nextInt();
			
			System.out.println("Entera Subject marks Geograpy: ");
			int s3 = in.nextInt();
			
			System.out.println("Enter a Subject marks Math: ");
			int s4 = in.nextInt();
			
			System.out.println("Enter a Subject marks Science: ");
			int s5 = in.nextInt();
			
			System.out.println("Enter a Subject marks History: ");
			int s6 = in.nextInt();
			
			System.out.println("****Student Information****");
			System.out.println("Student Id :- " +StudentId);
			System.out.println("Student Name:- " +StudentName);
			System.out.println("Student Subject English:- " +s1);
			System.out.println("Student Subject Hindi:- " +s2);
			System.out.println("Student Subject Geograpy:- " +s3);
			System.out.println("Student Subject Math:- " +s4);
			System.out.println("Student Subject Science:- " +s5);
			System.out.println("Student Subject History:- " +s6);
			System.out.println("Total Marks of Subject:- "+(s1+s2+s3+s4+s5+s6));
			System.out.println("Average :- "+(s1+s2+s3+s4+s5+s6)/6);
			
			
			
			
		}
}
