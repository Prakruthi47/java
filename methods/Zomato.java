class Zomato {

	public static double takeOrder(String foodName) {
	
	if(foodName == "Rolls") {
		return 150.00;
	}
	if(foodName == "icecreams") {
		return 200.00;
	}
	if(foodName == "MilkShake") {
		return 200.00;
	}
	if(foodName == "Pasta") {
		return 200.00;
	}
	if(foodName == "French Fries") {
		return 100.00 ;
	}
	if(foodName == "Shawarma") {
		return  200.00;
	}
	if(foodName == "Sandwich") {
		return 150.00 ;
	}
	if(foodName == "Cookies") {
		return 200.00 ;
	}
	if(foodName == "Cold Coffee") {
		return 199.00 ;
	}
	if(foodName == "Samosa") {
		return 79.00 ;
	}
	if(foodName == "Pulav") {
		return  239.00;
	}
	if(foodName == "Maggi") {
		return 99.00 ;
	}
	if(foodName == "Panner Tikka") {
		return  199.00;
	}
	if(foodName == "Cake") {
		return  450.00;
	}
	if(foodName == "Lemon Juice") {
		return 99.00 ;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	
	}
	
	public static double takeOrder(String foodName,int quantity){
		
	double price = 0.0;
		
	if(foodName == "Rolls") {
		price = 150.00*quantity;
		return price;
	}
	if(foodName == "icecreams") {
		 price = 200.00*quantity;
		 return price;
	}
	if(foodName == "MilkShake") {
		price = 200.00*quantity;
		 return price;
		
	}
	if(foodName == "Pasta") {
		price = 200.00*quantity;
		 return price;
		
	}
	if(foodName == "French Fries") {
		price = 100.00*quantity;
		 return price;
		
	}
	if(foodName == "Shawarma") {
		price = 200.00*quantity;
		 return price;
		
	}
	if(foodName == "Sandwich") {
		price = 150.00*quantity;
		 return price;
		
	}
	if(foodName == "Cookies") {
		price = 200.00*quantity;
		 return price;
		
	}
	if(foodName == "Cold Coffee") {
		price = 199.00*quantity;
		 return price;
		
	}
	if(foodName == "Samosa") {
		price = 79.00*quantity;
		 return price;
		
	}
	if(foodName == "Pulav") {
		price = 239.00*quantity;
		 return price;
		
	}
	if(foodName == "Maggi") {
		price = 99.00*quantity;
		 return price;
		
	}
	if(foodName == "Panner Tikka") {
		price = 199.00*quantity;
		 return price;
		
	}
	if(foodName == "Cake") {
		price = 450.00*quantity;
		 return price;
		
	}
	if(foodName == "Lemon Juice") {
		price = 99.00*quantity;
		 return price;
		
	}
	

	return price;	
	}



}