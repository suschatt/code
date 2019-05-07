package Day1;

public class Datatypeandoperations {

	public static void main(String[] args) {
		byte by1=127,by2=-127;
		short s1=123,s2=321;
		int i1=1,i2=2;
		long l1=123456,l2=987654;
		float f1=1.0f,f2=2.0f;
		double d1=10,d2=20;
	//	boolean b1=true,b2=false;
		char c1='a',c2='b';
		
		//Addition
		System.out.println(by1+by2);
		System.out.println(s1+s2);
		System.out.println(i1+i2);
		System.out.println(l1+l2);
		System.out.println(f1+f2);
		System.out.println(d1+d2);
		// System.out.println(b1+b2); -- FAILS
		System.out.println(c1+c2);
		
		System.out.println("End Add");
		
		
		
		//Substration
				System.out.println(by1-by2);
				System.out.println(s1-s2);
				System.out.println(i1-i2);
				System.out.println(l1-l2);
				System.out.println(f1-f2);
				System.out.println(d1-d2);
				//System.out.println(b1-b2);FAILS
				System.out.println(c1-c2);
				
				System.out.println("End Substract");
		
			//Multiplication
				
				System.out.println(by1*by2);
				System.out.println(s1*s2);
				System.out.println(i1*i2);
				System.out.println(l1*l2);
				System.out.println(f1*f2);
				System.out.println(d1*d2);
				//System.out.println(b1-b2);FAILS
				System.out.println(c1*c2);
				System.out.println("End Multi");
				
				//Division
				System.out.println(by1/by2);
				System.out.println(s1/s2);
				System.out.println(i1/i2);
				System.out.println(l1/l2);
				System.out.println(f1/f2);
				System.out.println(d1/d2);
				//System.out.println(b1-b2);FAILS
				System.out.println(c1/c2);
				System.out.println("End Divide");
				
				//Increment
				System.out.println(by1++);
				System.out.println(s1++);
				System.out.println(i1++);
				System.out.println(l1++);
				System.out.println(f1++);
				System.out.println(d1++);
				//System.out.println(b1-b2);FAILS
				System.out.println(c1++);
				System.out.println("Switch to ++");
				System.out.println(++by1);
				System.out.println(++s1);
				System.out.println(++i1);
				System.out.println(++l1);
				System.out.println(++f1);
				System.out.println(++d1);
				//System.out.println(b1-b2);FAILS
				System.out.println(++c1);
				System.out.println("End Increment");
				
				//Increment
				System.out.println(by1--);
				System.out.println(s1--);
				System.out.println(i1--);
				System.out.println(l1--);
				System.out.println(f1--);
				System.out.println(d1--);
				//System.out.println(b1-b2);FAILS
				System.out.println(c1--);
				System.out.println("Switch to --");
				System.out.println(--by1);
				System.out.println(--s1);
				System.out.println(--i1);
				System.out.println(--l1);
				System.out.println(--f1);
				System.out.println(--d1);
				//System.out.println(b1-b2);FAILS
				System.out.println(--c1);
				System.out.println("End Increment");
	}

}
