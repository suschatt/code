package Day1;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=s.nextInt();
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		s.close();

	}

}