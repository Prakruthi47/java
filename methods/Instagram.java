class Instagram{

  static String emailId;
  static String password;
  static String confirmPassword;
  static String fullName;
  static long phoneNumber;
  

  

     public static boolean createInstaAccount(String email,String pwd,String confirmPwd,String fName,long phoneNum){
	     boolean isInstaAccCreated=false;    
	     boolean isEmailIdValid = false;
		boolean isPasswordValid = false;
		 boolean isConfirmPwdValid = false;
		 boolean isFullNameValid = false;
		 boolean isPhoneNumValid = false;
			 
	if(email!=null){
		
		emailId=email;
		isEmailIdValid=true;	
	}else{
		System.out.println("Please..enter valid email");
	}
	if(pwd!=null){
		
		password=pwd;
		isPasswordValid=true;	
	}else{
		System.out.println("Please..enter valid password");
	}
	if(confirmPwd!=null){
		
		confirmPassword=confirmPwd;
		isConfirmPwdValid=true;	
	}else{
		System.out.println("Please..enter valid confirm password");
	}
	if(fName!=null){
		
		fullName=fName;
        isFullNameValid=true;	
	}else{
		System.out.println("Please..enter valid full name");
	}
	if(phoneNum>0){
		
		phoneNumber=phoneNum;

		isPhoneNumValid=true;	
	}else{
		System.out.println("Please..enter valid phone number");
	}
	if(isEmailIdValid&&isPasswordValid&&isConfirmPwdValid&&isFullNameValid&&isPhoneNumValid){
	    isInstaAccCreated=true;
		
	}else{
	  
		  System.out.println("please enter valid details");
		
	}
	 
	 
	 
	 
	 return isInstaAccCreated;
	 
	 }
	 
	 public static void getDetails(){
		 
		 System.out.println("The email  is:"+emailId);
		 System.out.println("The password  is:"+password);
		 System.out.println("The confirm password  is:"+confirmPassword);
		 System.out.println("The full name  is:"+fullName);
		 System.out.println("The phone number  is:"+phoneNumber);

	 }

}