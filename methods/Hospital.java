class Hospital{
	
	
	static String patientFullName;
	static long contactNumber;
	static int registerationNum;
	static String patientAddress;
	static String emailId;
	
		static boolean isPatientData=false;
	    //static	boolean isPatientData=true;
	static boolean isPatientFullNameValid, isContactNumValid,isRegisterationNumValid,isPatientAddressValid,isEmailIdValid;




    public static boolean registerPatient(String patientName,long contactNum,int registerationId,String address,String email){
	
	
	
	if(patientFullName!=null){
		
		Hospital.patientFullName=patientName;
		isPatientFullNameValid=true;	
	}else{
		System.out.println("Please..enter valid patient name");
	}
	if(contactNumber>0){
		
		Hospital.contactNumber=contactNum;
		isContactNumValid=true;	
	}else{
		System.out.println("Please..enter valid contact num");
	}
	if(registerationNum>0){
		
		Hospital.registerationNum=registerationId;
		isRegisterationNumValid=true;	
	}else{
		System.out.println("Please..enter valid registerationNum");
	}
	if(patientAddress!=null){
		
		Hospital.patientAddress=address;
        isPatientAddressValid=true;	
	}else{
		System.out.println("Please..enter valid Address");
	}
	if(emailId!=null){
		
		Hospital.emailId=email;

		isEmailIdValid=true;	
	}else{
		System.out.println("Please..enter valid emailid");
	}
	if(isPatientFullNameValid&&isContactNumValid&&isRegisterationNumValid&&isPatientAddressValid&&isEmailIdValid){
		  Hospital.isPatientData=true;
		
	}else{
		  Hospital.isPatientData=false;
		  System.out.println("please enter valis details");
		
	}
	
	return isPatientData;
	}
	
	public static void getDetails(){
	
	
	   System.out.println("the patient name is:"+patientFullName);
	   System.out.println("the contactNumber is :"+contactNumber);
	   System.out.println("the registerationId is :"+registerationNum);
	   System.out.println("the address is :"+patientAddress);
	   System.out.println("the email id is:"+emailId);
	
	
	}





}