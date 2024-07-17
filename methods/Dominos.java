class Dominos {

	public static double takeOrder(String foodName) {
	
	if(foodName == "Margherita") {
		return 184.00;
	}
	if(foodName == "FarmHouse") {
		return 334.00;
	}
	if(foodName == "Peppy Paneer") {
		return 249.00;
	}
	if(foodName == "Veggy Paradise") {
		return 334.00;
	}
	if(foodName == "Indi Tandoori Panner") {
		return  374.00;
	}
	if(foodName == "Golden Corn") {
		return 79.00 ;
	}
	if(foodName == "Panner & onion") {
		return  129.00;
	}
	if(foodName == "Classic Pizza") {
		return  49.00;
	}
	if(foodName == "Onion") {
		return 69.00 ;
	}
	if(foodName == "Garlic BreadSticks") {
		return 109.00 ;
	}
	if(foodName == "Veg Roll") {
		return  49.00;
	}
	if(foodName == "Taco Maxicana") {
		return  129.00;
	}
	if(foodName == "Choco Lava Cake") {
		return  99.00;
	}
	if(foodName == "cheese and corn") {
		return 349.00 ;
	}
	if(foodName == "panner pizza") {
		return  299.00;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	
	}
	
	
	public static double takeOrder(String foodName,int quantity) {
	
	if(foodName == "Margherita") {
		return 184.00*quantity;
	}
	if(foodName == "FarmHouse") {
		return 334.00*quantity;
	}
	if(foodName == "Peppy Paneer") {
		return 249.00*quantity;
	}
	if(foodName == "Veggy Paradise") {
		return 334.00*quantity;
	}
	if(foodName == "Indi Tandoori Panner") {
		return  374.00*quantity;
	}
	if(foodName == "Golden Corn") {
		return 79.00*quantity ;
	}
	if(foodName == "Panner & onion") {
		return  129.00*quantity;
	}
	if(foodName == "Classic Pizza") {
		return  49.00*quantity;
	}
	if(foodName == "Onion") {
		return 69.00 *quantity;
	}
	if(foodName == "Garlic BreadSticks") {
		return 109.00 *quantity;
	}
	if(foodName == "Veg Roll") {
		return  49.00*quantity;
	}
	if(foodName == "Taco Maxicana") {
		return  129.00*quantity;
	}
	if(foodName == "Choco Lava Cake") {
		return  99.00*quantity;
	}
	if(foodName == "cheese and corn") {
		return 349.00 *quantity;
	}
	if(foodName == "panner pizza") {
		return  299.00*quantity;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	
	}



}