class Ncr {

	public static void main(String ncr[]) {
		
		int nValue = 7 ;
		int rValue = 5;
	
		int ncrvalue = Factorial.toGetFact(nValue)/(Factorial.toGetFact(rValue)*Factorial.toGetFact(nValue-rValue));
		System.out.println("ncr value is : "+ncrvalue);
	
	
	
	
	}




}