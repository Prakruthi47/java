class Amazon {
	static String emailaddress;
	static long mobileno;
	static String fullName;
	static String pwd;
	static String confirmPwd;
	static boolean isAccountRegistered = false;
	
	static boolean isEmailIdValid,isMobileNumValid,isFullNameValid,isPasswordValid,isConfirmPwdValid;

	public static boolean createAccount(String email,long mobileNumber,String name,String password,String confirmPassword){
		
	 
	 boolean isEmailIdValid = false;
	 boolean isMobileNumValid = false;
	 boolean isFullNameValid = false;
	 boolean isPasswordValid = false;
	 boolean isConfirmPwdValid = false;
	 
		
	if(email!=null){
		
		emailaddress = email;
		isEmailIdValid=true;	
	}else{
		System.out.println("Please..enter valid emailid");
	}
	if(mobileNumber>0){
		
		mobileno = mobileNumber;
		isMobileNumValid=true;	
	}else{
		System.out.println("Please..enter valid contact num");
	}
	if(name!=null){
		
		fullName = name;
		isFullNameValid=true;	
	}else{
		System.out.println("Please..enter valid name");
	}
	if(password!=null){
		
		Amazon.pwd = password;
        isPasswordValid=true;	
	}else{
		System.out.println("Please..enter valid password");
	}
	if(confirmPassword!=null){
		
		confirmPwd = confirmPassword ;

		isConfirmPwdValid=true;	
	}else{
		System.out.println("Please..enter valid confirm password");
	}
	if( isEmailIdValid&&isMobileNumValid&&isFullNameValid&&isPasswordValid&&isConfirmPwdValid){
		 isAccountRegistered = true;
		
	}else{
	      
		  System.out.println("please enter valid details");
		
	}
	
	
	return isAccountRegistered;
	}
	
	public static void getDetails() {
		if(isAccountRegistered == true){
		System.out.println("email addresss : "+emailaddress);
		System.out.println("mobile number : "+mobileno);
		System.out.println("full name : "+fullName);
		System.out.println("password : "+pwd);
		System.out.println("confirm Password : "+confirmPwd);
		}
		
	}
	

}