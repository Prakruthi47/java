class HospitalRunner{


  public static void main(String runner[]){
  
     System.out.println("the main is started");
	 
	 boolean isPatientdata=Hospital.registerPatient("Prakruthi",7645262787L,453,"MAdavara","Prakru133@gmail.com");
	 
	 System.out.println("the patient data is :"+isPatientdata);
	 
	 Hospital.getDetails();
	 
	 System.out.println("the main is started");

	 
	 
	 
  
  
  
  }



}

    //public static boolean registerPatient(String patientName,long contactNum,String ,int registerationId,String address,String email){
