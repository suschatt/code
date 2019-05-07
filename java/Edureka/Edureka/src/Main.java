
public class Main {

	public static void main(String[] args) {
		String s1=new String("susmit");
		String s2=s1.intern();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//if(s1.equals(s2)){
		if(s1==s2){
			System.out.println("same");
		}
		else
			System.out.println("diff");

	}

}
