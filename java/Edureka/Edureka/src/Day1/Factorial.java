package Day1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		//For Loop
		int num=s.nextInt();
		int fact=1;
		for(int i=num;i>1;i--){
			fact*=i;
		}
		System.out.println(fact);
		
		//While Loop
		int i=num;
		fact=1;
		while(i>1){
			fact*=i;
			i--;
		}//end while
		System.out.println(fact);
		
		
		//Do While
		i=num;
		fact=1;
		do{
			fact*=i;
			i--;
		}while(i>1);
		System.out.println(fact);
	
		s.close();
	}//end main
	
}