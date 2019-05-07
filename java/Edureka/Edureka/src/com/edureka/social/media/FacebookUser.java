package com.edureka.social.media;

class FacebookUser extends User{
		
		public FacebookUser(StringBuilder name, int age, StringBuilder location,StringBuilder jobTitle) throws CheckAge {
		super(name, age, location);
		this.jobTitle=jobTitle;
		}
	
		StringBuilder jobTitle;
		
		
		
		@Override
		public String toString() {
			return "FacebookUser [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", location=" + location
					+ "]";
		}

		void postStatus(){
			System.out.println("Status");
		}//end postStatus
		
		void likeComments(){};
		void changeDP(){};
		void sharePost(){};

}//end FacebookUser
