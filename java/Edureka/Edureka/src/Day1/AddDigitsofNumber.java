package Day1;

import java.util.Scanner;

public class AddDigitsofNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=s.nextInt();
		int sum=0;
		while (num > 0){
			sum+=num%10;
			num=num/10;
		}//end while
		System.out.println(sum);
		s.close();
	}//end main

}
