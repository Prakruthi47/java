class AmazonRunner {

	public static void main(String[] runner){
	
	System.out.println("The main is started");

		boolean accDetails=Amazon.createAccount("prakruthibc123@gmail.com",8867467794L,null,"Prakru@47","Prakru@47");
		
		System.out.println("the account is created:"+accDetails);
		Amazon.getDetails();
		
	System.out.println("The main is ended");
	
	
	
	}





}