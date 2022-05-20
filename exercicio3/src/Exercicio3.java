

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name:");
		student.name = sc.nextLine();
		System.out.print("First Grade:");
		student.firstGrade = sc.nextDouble();
		System.out.print("Second Grade:");
		student.secondGrade = sc.nextDouble();
		System.out.print("Third Grade:");
		student.thirdGrade = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f \n", student.finalGrade());
		
		System.out.printf("%s \n", student.result());
		System.out.printf("Missing %.2f points", student.missing());
		sc.close();
	
		
	}

}
