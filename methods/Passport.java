class Passport {
	static String cprLoc;
	static int dcdrLoc;
	static String surNme;
	static String givenNme;
	static String	dateOfBirth;
	static String emailId;
	static boolean emailLoginSme;
	static String login;
	static String password;
	static String confirmPassword;
	static String hintQuestion;
	static String hintAnswer;
	static String captchagiven;

	public static boolean createPassport(String cprLocation,int dcdrLocation,
	String surName,String givenName,String dob,String email,boolean emailLoginSame,String loginId,String pwd,
	String confirmpwd,String hintQues,String hintAns,String captcha){
	
	boolean isPassportDataCreated = false;
	/*if(cprLocation!= null && dcdrLocation > 0  && 
	surName != null && givenName!= null && dob!=null && 
	email!=null && loginId!=null && pwd!=null && confirmpwd!=null && hintQues!=null &&hintAns!=null &&captcha!=null) {*/
	boolean dcdrLocationValid = false;
	if(dcdrLocation > 0){
		dcdrLoc = dcdrLocation;
		dcdrLocationValid = true;
	}else{
		
		System.out.println("please provide valid dcdrlocation");
	}
	if(surName!=null){
		surNme = surName;
		isSurNameValid = true;
	}else{
		System.out.println("please provide valid surname");
		
	}
	if(emailLoginSame!=false){
		surNme = surName;
		isSurNameValid = true;
	}else{
		System.out.println("please provide valid surname");
		
	}
	
		cprLoc =cprLocation;
		
		surNme = surName;
		givenNme = givenName;
		dateOfBirth = dob;
		emailId = email;
		emailLoginSme = emailLoginSame;
		login = loginId;
		password = pwd;
		confirmPassword = confirmpwd;
		hintQuestion = hintQues;
		hintAnswer = hintAns;
		captchagiven = captcha;
		isPassportDataCreated = true;
		System.out.println("passport data created successfully");
	}else{
			System.out.println("please provide all required details");
	
	}
	
	
	return isPassportDataCreated;
	}
	
	
	public static void getPassportDetails() {
		
	System.out.println("The cpr location is : " +cprLoc);
	System.out.println("The dcdr location is : " +dcdrLoc);
	System.out.println("The sur name is : " +surNme);
	System.out.println("The Given name is :"+givenNme);
	System.out.println("The date of birth is :"+dateOfBirth);
	System.out.println("The email is: "+emailId);
	System.out.println("is email and login id same : "+emailLoginSme);
	System.out.println("The login id : "+login);
	System.out.println("password : "+password);
	System.out.println("confirm password: "+confirmPassword);
	System.out.println("hint question : "+hintQuestion);
	System.out.println("hint answer : "+hintAnswer);
	System.out.println("captcha : "+captchagiven);
		
	}



}