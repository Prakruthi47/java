class SwiggyRunner {

	public static void main(String runner[]) {
	
		double price = Swiggy.takeOrder("Burger");
		System.out.println(price);
		double price1 = Swiggy.takeOrder("Pizza",4);
		System.out.println(price1);
	
	}



}