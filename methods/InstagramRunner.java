class InstagramRunner{


    public static void main(String runner[]){
		
		System.out.println("The main is started");
	
	      boolean isInstaAccCreated=Instagram.createInstaAccount("prakruthi133@gmail.com","prakruthi@1312","prakruthi@1312","Prakruthi",9876543210L);
		  
		  
	      System.out.println("The account is created :" +isInstaAccCreated);
		  Instagram.getDetails();

	
			System.out.println("The main is ended");
			

	
	
	
	}


}






//String email,String pwd,String confirmPwd,String name,int phoneNum