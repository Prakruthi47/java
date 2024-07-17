class FiveStarChickenRunner {

	public static void main(String runner[]) {
	
		double price = FiveStarChicken.takeOrder("crispy chicken");
		System.out.println(price);
		double price1 = FiveStarChicken.takeOrder("crispy chicken",2);
		System.out.println(price1);
	
	}



}