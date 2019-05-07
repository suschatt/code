package Day1;

import java.util.Scanner;

public class Check_Number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = s.nextInt();
		if (num == 0)
				System.out.println("Number is zero");
		else if (num>0)
				System.out.println("Positive");
		else
				System.out.println("Negative");
		s.close();

	}

}
