class BlinkItRunner {

	public static void main(String runner[]) {
	
		double price = BlinkIt.takeOrder("Tea Powder");
		System.out.println(price);
		
		double price1 = BlinkIt.takeOrder("Tea Powder",6);
		System.out.println(price1);
	
	}



}