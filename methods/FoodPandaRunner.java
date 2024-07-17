class FoodPandaRunner {

	public static void main(String runner[]) {
	
		double price = FoodPanda.takeOrder("veg Fried Rice");
		System.out.println(price);
		double price1 = FoodPanda.takeOrder("veg Fried Rice",2);
		System.out.println(price1);
	
	}



}