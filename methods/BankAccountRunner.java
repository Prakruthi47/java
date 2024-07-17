class BankAccountRunner {

	public static void main(String[] bank){
	
	double balance = BankAccount.getBalance();
	BankAccount.getBalance();
	System.out.println(balance);
	
	BankAccount.credit(5000.00);
	 balance =BankAccount.getBalance();
	System.out.println(balance);
	
	BankAccount.credit(5000.00);
	 balance =BankAccount.getBalance();
	System.out.println(balance);
	
	BankAccount.credit(5000.00);
	 balance = BankAccount.getBalance();
	System.out.println(balance);
	
	BankAccount.debit(50000.00);
	 balance =BankAccount.getBalance();
	System.out.println(balance);
	
	BankAccount.debit(5000.00);
	 balance =BankAccount.getBalance();
	System.out.println(balance);
	
	
	
	}




}