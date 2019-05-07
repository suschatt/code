package com.edureka.social.media;

public class TwitterUser extends User{
	public TwitterUser(StringBuilder name,Integer age,StringBuilder handleName,StringBuilder location,StringBuilder jobTitle) throws CheckAge {
		super(name,age,location);
		this.handleName = handleName;
		this.jobTitle = jobTitle;
		}
	StringBuilder handleName,jobTitle;
	
	
	@Override
	public String toString() {
		return "TwitterUser [handleName=" + handleName + ", jobTitle=" + jobTitle + ", name=" + name + ", age=" + age
				+ ", location=" + location + "]";
	}
	void tweet(){};
	void changeDP(){};
	void likeStatus(){};
	void comment(){};
}
