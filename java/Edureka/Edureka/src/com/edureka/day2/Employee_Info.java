package com.edureka.day2;

class PrintValue{
	void display(String[] id,String[] name,String[] salary){
		int i=1;
		while(i<id.length){
			System.out.println(id[i]+"\t"+name[i]+"\t"+salary[i]);
			i++;
		}//end while
	}//end display
	
	//Overloading
	void display(String[] id,String[] name){
		int i=1;
		while(i<id.length){
			System.out.println(id[i]+"\t"+name[i]);
			i++;
		}//end while
	}//end display
	
	void display(String sname, String[] id, String[] name, String salary[]){
		int i=1;
		while(i<id.length){
			if(sname == name[i]){
				System.out.println(id[i]+"\t"+name[i]+"\t"+salary[i]);
			}//end if
			i++;
		}//end while
	}//end display
	
}//end Print Value

public class Employee_Info{

	public static void main(String[] args) {
		String []id={"001","002","003","004","005"};
		String []name={"John","Clark","Nancy","Joe","Mary"};
		String []salary={"600000","550000","500000","500000","300000"};
		//Output of Assignment 1
		System.out.println("###########Assignment 1#############");
		System.out.println("ID	NAME	SALARY");
		PrintValue v=new PrintValue();
		v.display(id,name,salary);
		//Output of Assignment 2
		System.out.println("###########Assignment 2#############");
		System.out.println("ID	NAME");
		v.display(id, name);
		
		//Output of Assignment 3
		System.out.println("###########Assignment 2#############");
		System.out.println("ID	NAME	SALARY");
		v.display("Joe", id, name, salary);
		
	}//end main
}//end employee_info


