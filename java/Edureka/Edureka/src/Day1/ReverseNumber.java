package Day1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=s.nextInt();
		int rev=0;
		int len = String.valueOf(num).length();
		for(int i=len;i>0;i--){
			rev+=(num%10)*Math.pow(10, i-1);
			num/=10;
		}//end for
		System.out.println("Reverse of number: "+rev);
		s.close();
	}

}
