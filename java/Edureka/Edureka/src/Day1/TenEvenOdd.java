package Day1;

public class TenEvenOdd {

	public static void main(String[] args) {
		//For Loop
		System.out.println("For Loop Even");
		for (int i=2;i<21;i+=2){
			System.out.println(i);
		}
		System.out.println("For Loop Odd");
		for(int i=1;i<21;i+=2)
			System.out.println(i);
		
		
		//While
		System.out.println("While loop even");
		int i=2;
		while (i<21){
			System.out.println(i);
			i+=2;
		}//end even
		System.out.println("While loop odd");
		i=1;
		while (i<21){
			System.out.println(i);
			i+=2;
		}//end odd
		
		//Do While
		System.out.println("DO While loop even");
		i=2;
		do{
			System.out.println(i);
			i+=2;
		}while(i<=21);
		
		System.out.println("DO While loop ODD");
		i=1;
		do{
			System.out.println(i);
			i+=2;
		}while(i<21);
	}

}
