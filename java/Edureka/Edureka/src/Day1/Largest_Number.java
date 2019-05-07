package Day1;

import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = s.nextInt();
		System.out.println("Enter Second Number: ");
		int num2 = s.nextInt();
		if (num1>num2)
			System.out.println("First Number is greater");
		else if (num1<num2)
			System.out.println("Second Number is greater");
		else
			System.out.println("Equal");
		s.close();

	}

}
