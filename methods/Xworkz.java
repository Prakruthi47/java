class Xworkz{

     static String fullNameOfStudent;
	 static long phoneNumber;
	 static String emailId;
	 static String usn;
	 static String college;
	 static boolean isCreateData=false;
	 
	 
	 static boolean isFullNameOfStudentValid,isPhoneNumValid,isEmailValid,isUsnValid,isCollegenameValid;


    public static boolean createdAcc(String fullName, long phoneNum,String email,String usnNum,String collegeName){
	    
		
		
	if(fullName!=null){
		
		fullNameOfStudent=fullName;
		isFullNameOfStudentValid=true;	
	}else{
		System.out.println("Please..enter valid patient name");
	}
	if(phoneNum>0){
		
		phoneNumber=phoneNum;
		isPhoneNumValid=true;	
	}else{
		System.out.println("Please..enter valid contact num");
	}
	if(email!=null){
		
		emailId=email;
		isEmailValid=true;	
	}else{
		System.out.println("Please..enter valid registerationNum");
	}
	if(usnNum!=null){
		
		usn=usnNum;
        isUsnValid=true;	
	}else{
		System.out.println("Please..enter valid Address");
	}
	if(collegeName!=null){
		
		college=collegeName;

		isCollegenameValid=true;	
	}else{
		System.out.println("Please..enter valid emailid");
	}
	if( isFullNameOfStudentValid&&isPhoneNumValid&&isEmailValid&&isUsnValid&&isCollegenameValid){
		isCreateData=false;

	}else{
		isCreateData=true;
		  System.out.println("please enter valid details");
		
	}
			
		
   return isCreateData;

	}
	
	public static void getDetails(){
		
		System.out.println("the full name os student is:"+fullNameOfStudent);
		System.out.println("the phone num is :"+phoneNumber);
		System.out.println("the email id is :"+emailId);
		System.out.println("the usn is :"+usn);
		System.out.println("the college name is :"+college);
		
		
		
		
	}



}