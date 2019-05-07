//Super class for FaceBookUser and TwitterUser class
//TO DO Change string to string builder

package com.edureka.social.media;

public class User {
	StringBuilder name;
	Integer age;
	StringBuilder location;
	
	public User(StringBuilder name, Integer age, StringBuilder location) throws CheckAge {
		super();
		this.name = name;
			if (age<18)
				throw new CheckAge();
		this.age = age;
		this.location = location;
	}
	
	

}
