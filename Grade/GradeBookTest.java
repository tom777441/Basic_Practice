package Grade;

import java.util.Scanner;
public class GradeBookTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		GradeBook myGradeBook = new GradeBook();  //�z�L�����ܼ� ���͹������O
		
		System.out.printf("Inital course name is: %s\n\n",
				myGradeBook.getCourseName());
		System.out.println("Please enter the course name:");
		String theName = input.nextLine();
		myGradeBook.setCourseName(theName);
		
		System.out.printf("After entered, the course name is: %s\n\n",
				myGradeBook.getCourseName());
		
		input.close();
	}

}
