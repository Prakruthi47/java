class FiveStarChicken {

	public static double takeOrder(String foodName) {
	
	if(foodName == "crispy chicken") {
		return 80.00;
	}
	if(foodName == "chilli burst") {
		return 120.00;
	}
	if(foodName == "crunchy masala") {
		return 200.00;
	}
	if(foodName == "crispy burger") {
		return 50.00;
	}
	if(foodName == "tandoori burger") {
		return  199.00;
	}
	if(foodName == "cheese burger") {
		return  200.00;
	}
	if(foodName == "star burger") {
		return  99.00;
	}
	if(foodName == "tandoori roll") {
		return 159.00 ;
	}
	if(foodName == "chicken nuggets") {
		return  89.00;
	}
	if(foodName == "chicken roll") {
		return 560.00 ;
	}
	if(foodName == "chicken nuggets") {
		return 300.00 ;
	}
	if(foodName == "masala fries") {
		return  200.00;
	}
	if(foodName == "biriyani") {
		return  200.00;
	}
	if(foodName == "chicken strips") {
		return  200.00;
	}
	if(foodName == "chiken wings") {
		return  200.00;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	
	}
	
	public static double takeOrder(String foodName,int quantity) {
	
	if(foodName == "crispy chicken") {
		return 80.00*quantity;
	}
	if(foodName == "chilli burst") {
		return 120.00*quantity;
	}
	if(foodName == "crunchy masala") {
		return 200.00*quantity;
	}
	if(foodName == "crispy burger") {
		return 50.00*quantity;
	}
	if(foodName == "tandoori burger") {
		return  199.00*quantity;
	}
	if(foodName == "cheese burger") {
		return  200.00*quantity;
	}
	if(foodName == "star burger") {
		return  99.00*quantity;
	}
	if(foodName == "tandoori roll") {
		return 159.00 *quantity;
	}
	if(foodName == "chicken nuggets") {
		return  89.00*quantity;
	}
	if(foodName == "chicken roll") {
		return 560.00 *quantity;
	}
	if(foodName == "chicken nuggets") {
		return 300.00*quantity ;
	}
	if(foodName == "masala fries") {
		return  200.00*quantity;
	}
	if(foodName == "biriyani") {
		return  200.00*quantity;
	}
	if(foodName == "chicken strips") {
		return  200.00*quantity;
	}
	if(foodName == "chiken wings") {
		return  200.00*quantity;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	}



}