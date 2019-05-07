package com.edureka.social.media;

import java.util.HashSet;
import java.util.Set;

public class TestFacebookUser {

	static{
		System.out.println("Welcome");
	}
	
	public static void main(String[] args) {
		
		StringBuilder nm=new StringBuilder("Susmit");
		StringBuilder place=new StringBuilder("Austin");
		StringBuilder jTitle=new StringBuilder("Software Engineer");
		
		StringBuilder nm1=new StringBuilder("Sayani");
		StringBuilder place1=new StringBuilder("Dallas");
		StringBuilder jTitle1=new StringBuilder("Lead Software Engineer");
		
		try{
		FacebookUser susmit= new FacebookUser(nm, 28, place,jTitle);
		FacebookUser sayani= new FacebookUser(nm1, 28, place1,jTitle1);
		System.out.println(susmit);
		Set<FacebookUser> friends = new HashSet <FacebookUser>();
		friends.add(sayani);
		System.out.println(friends);
		
		
		/*System.out.println(susmit.name);
		System.out.println(susmit.age);
		System.out.println(susmit.location);
		System.out.println(susmit.jobTitle);*/
		}catch (CheckAge e){
			System.out.println("Age restriction.Should be 18 years or older");
		}
		
		System.out.println("Twitter Check");
		StringBuilder handleName=new StringBuilder("@susmit_tweets");
		try{
			TwitterUser susmit = new TwitterUser(nm, 18,handleName, place,jTitle);
			System.out.println(susmit);
			
			
		}catch (CheckAge e){
			System.out.println("Age restriction.Should be 18 years or older");
		}
		
	
	}

}
