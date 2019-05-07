package Day1;

import java.util.Scanner;

public class Voter_age {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=s.nextInt();
		if (age>=18)
			System.out.println("Congratulations,you're eligible to vote");
		else
			System.out.println("Sorry,You can't vote");
		s.close();
		
	}

}
