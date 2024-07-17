class PassportRunner {

	public static void main(String runner[]) {
	
	boolean isAccountCreated = Passport.createPassport("PO",8,"gowda","Prakruthi","04/07/2001","prakruthibc2001@gmail.com",true,"prakruthibc2001@gmail","Prakruthi@89","Prakruthi@89","color","blue","Qwer52");
	Passport.getPassportDetails();
	System.out.println("is account created :"+isAccountCreated);
	}



}