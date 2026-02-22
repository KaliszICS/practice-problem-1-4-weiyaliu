	/**
	* Lesson: Input
	* Author: Weiya Liu
	* Date Created: February 20, 2026
	* Date Last Modified: February 20, 2026
	*/

	import java.util.Scanner; 

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		
		Scanner input1 = new Scanner(System.in);

		String name;
		System.out.print("What is your name: ");
		name = input1.nextLine();
		System.out.println(name);
		
		input1.close();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input2 = new Scanner (System.in);
		
		int num;
		System.out.print("Input a whole number: ");
		num = input2.nextInt();
		input2.nextLine();
		System.out.println((num*2)+2);

		input2.close();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input3 = new Scanner(System.in);

		double radius1;
		System.out.print("Input a radius: ");
		
		radius1 = input3.nextDouble();
		double pi = 3.14;
		double circumference = 2*pi*radius1;

		System.out.println("Circumference: "+ circumference);

		double area = pi*radius1*radius1;

		System.out.println("Area: "+ area);

		input3.close();

	}
		
	public static void q4() {
		//Write question 4 code here
		Scanner input4 = new Scanner(System.in);

		System.out.print("Input a first name: ");
		String firstname = input4.nextLine();

		System.out.print("Input a last name: ");
		String lastname = input4.nextLine();

		System.out.print("Input an age: ");
		int age = input4.nextLine;

		System.out.println( lastname + "," + firstname + " - " + age);

		input4.close();
	}

	public static void q5() {
		//Write question 5 code here
	}

}
