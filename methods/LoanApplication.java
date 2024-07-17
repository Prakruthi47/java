class LoanApplication {
    static String applicantName, loanType,bankName;
    static double amountRequested,rateOfIntrest;
	static int creditScore;
	static long bankAccountNumber;
	static boolean isApproved = false;
	
	public static boolean submitLoanApplication(String applicantNme,
	String bankNme,long bankAccountNumber,int creditScore, String loantype,
	double amountRequested,double rateOfIntrest) {
	
	boolean isAmountRequestedValid = false;
	boolean isApplicantNameValid =false;
	boolean isBankAccountNumberValid = false;
	boolean isBankNameValid = false;
	boolean isCreditScoreValid = false;
	boolean isLoanTypeValid = false;
	boolean isRateOfIntrestValid = false;
	
		if(applicantNme!=null)
		{
			 applicantName = applicantNme;
			 isApplicantNameValid=true;

		}
		else
		{
			System.out.println("Enter Valid Name");
		}
		if(loantype!=null)
		{
			 loanType = loantype;
			 isLoanTypeValid=true;
		}
		else
		{
			System.out.println("Enter Valid LoanType");
		}
		if(bankNme!=null)
		{
			bankName = bankNme;
			isBankNameValid=true;
		}
		else
		{
			System.out.println("Enter Valid bankName");
		}
		if(amountRequested>0.0)
		{
			 amountRequested = amountRequested;
			 isAmountRequestedValid=true;
		}
		else
		{
			System.out.println("Enter Valid Amount Required");
		}
		if(rateOfIntrest>0.0)
		{
			 rateOfIntrest = rateOfIntrest;
			isRateOfIntrestValid=true;
		}
		else
		{
			System.out.println("Enter Valid Rate Of Intrest");
		}
		if(creditScore>0)
		{
			 creditScore = creditScore;
			isCreditScoreValid=true;
		}
		else
		{
			System.out.println("Enter Valid creditScore");
		}
		if(bankAccountNumber>0)
		{
			 bankAccountNumber = bankAccountNumber;
			isBankAccountNumberValid=true;
		}
		else
		{
			System.out.println("Enter Valid bankAccountNumber");
		}
		if(isAmountRequestedValid&&isRateOfIntrestValid&&isApplicantNameValid
		&&isBankAccountNumberValid&&isCreditScoreValid&&isLoanTypeValid
		&&isBankNameValid)
		{
			isApproved=true;
		}
		else
		{
		isApproved=false;
		System.out.println("Your Loan Apllication has some error Check that to get Approval");

		}
        return isApproved; 
    }
    public static void displayLoanApplicationDetails()
	{
		if(isApproved == true)
		{
        System.out.println("Applicant Name: " + applicantName +
							"\nbankName: "+bankName+
							"\nbankAccountNumber: "+bankAccountNumber+
							"\ncreditScore: "+creditScore+
                           "\nLoan Type: " + loanType +
                           "\nAmount Requested: " + amountRequested 
                           );
		}
	}
}
