class FoodPanda {

	public static double takeOrder(String foodName) {
	
	if(foodName == "Veg Biriyani") {
		return 220.00;
	}
	if(foodName == "veg pizza") {
		return 499.00;
	}
	if(foodName == "veg burger") {
		return 599.00;
	}
	if(foodName == "veg Sizzler") {
		return 499.00;
	}
	if(foodName == "Veg wrap") {
		return 299.00 ;
	}
	if(foodName == "veg Fried Rice") {
		return  299.00;
	}
	if(foodName == "veg manuchurian") {
		return  349.00;
	}
	if(foodName == "jalebi") {
		return 249.00 ;
	}
	if(foodName == "gulab jamun") {
		return  249.00;
	}
	if(foodName == "thali") {
		return  449.00;
	}
	if(foodName == "paratha") {
		return 299.00 ;
	}
	if(foodName == "nuggets") {
		return 299.00 ;
	}
	if(foodName == "tikka Masala") {
		return 349.00 ;
	}
	if(foodName == "veg curry") {
		return 299 ;
	}
	if(foodName == "palak paneer") {
		return 349.00 ;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	
	}

	public static double takeOrder(String foodName,int quantity){
		
	if(foodName == "Veg Biriyani") {
		return 220.00*quantity;
	}
	if(foodName == "veg pizza") {
		return 499.00*quantity;
	}
	if(foodName == "veg burger") {
		return 599.00*quantity;
	}
	if(foodName == "veg Sizzler") {
		return 499.00*quantity;
	}
	if(foodName == "Veg wrap") {
		return 299.00 *quantity;
	}
	if(foodName == "veg Fried Rice") {
		return  299.00*quantity;
	}
	if(foodName == "veg manuchurian") {
		return  349.00*quantity;
	}
	if(foodName == "jalebi") {
		return 249.00 *quantity;
	}
	if(foodName == "gulab jamun") {
		return  249.00*quantity;
	}
	if(foodName == "thali") {
		return  449.00*quantity;
	}
	if(foodName == "paratha") {
		return 299.00 *quantity;
	}
	if(foodName == "nuggets") {
		return 299.00 *quantity;
	}
	if(foodName == "tikka Masala") {
		return 349.00 *quantity;
	}
	if(foodName == "veg curry") {
		return 299 *quantity;
	}
	if(foodName == "palak paneer") {
		return 349.00 *quantity;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
		
	}

}