class ZomatoRunner {

	public static void main(String runner[]) {
	
		double price = Zomato.takeOrder("Rolls");
		System.out.println(price);
		double price1 = Zomato.takeOrder("Rolls",4);
		System.out.println(price1);
	
	}



}