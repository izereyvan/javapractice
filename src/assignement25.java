import java.util.Scanner;

public class assignement25 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of students: ");
		int numOfStudents = input.nextInt();
		System.out.println("Enter a student name:");
		String student1 = input.next();
		System.out.println("Enter a student score:");
		double score1 = input.nextDouble();
		for (int i = 0; i < numOfStudents-1; i++);
		System.out.println("Enter a student name");
		String student = input.next();
		System.out.println("Enter a student score:");
		double score = input.nextDouble();
		if(score > score1) {
			student1 = student;
			score1 =score;
			
		
		}
		

	}
       System.out.println((new StringBuilder("Top student")).append("'s scores is").append(score1) . toString());
}

}

