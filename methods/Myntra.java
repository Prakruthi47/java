class Myntra {

	static String emailaddress;
	static long mobileno;
	static String fullName;
	static String pwd;
	static String confirmPwd;
	
	static boolean isEmailAddressValid,isMobileNumValid,isFullNameValid,isPasswordValid,isConfirmPwdValid;

	public static void createAccount(String email,long mobileNumber,String name,String password,String confirmPassword){
		boolean isAccountRegistered = false;
		
	
	if(emailaddress!=null){
		
		Myntra.emailaddress = email;
		isEmailAddressValid=true;	
	}else{
		System.out.println("Please..enter valid patient name");
	}
	if(mobileNo>0){
		
		Myntra.mobileno = mobileNumber;
		isMobileNumValid=true;	
	}else{
		System.out.println("Please..enter valid contact num");
	}
	if(fullName!=){
		
		Myntra.fullName = name;
		isFullNameValid=true;	
	}else{
		System.out.println("Please..enter valid registerationNum");
	}
	if(pwd!=null){
		
		Myntra.pwd = password;
        isPasswordValid=true;	
	}else{
		System.out.println("Please..enter valid Address");
	}
	if(confirmPwd!=null){
		
		Myntra.confirmPwd = confirmPassword ;

		isConfirmPwdValid=true;	
	}else{
		System.out.println("Please..enter valid emailid");
	}
	if( isEmailAddressValid&&isMobileNumValid&&isFullNameValid&&isPasswordValid&&isConfirmPwdValid){
		Myntra.isAccountRegistered = true;
		
	}else{
		Myntra.isAccountRegistered = false;
		  System.out.println("please enter valis details");
		
	}
	
	
	return isAccountRegistered ;
	}
	
	public static void getDetails() {
		
		System.out.println("email addresss : "+emailaddress);
		System.out.println("mobile number : "+mobileno);
		System.out.println("full name : "+fullName);
		System.out.println("password : "+pwd);
		System.out.println("confirm Password : "+confirmPwd);
		
		
	}
	

}