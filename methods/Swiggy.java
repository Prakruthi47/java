class Swiggy {

	public static double takeOrder(String foodName) {
	
	if(foodName == "Pizza") {
		return 99.00;
	}
	if(foodName == "Burger") {
		return 120.00;
	}
	if(foodName == "Biryani") {
		return 200.00;
	}
	if(foodName == "Dosa") {
		return 50.00;
	}
	if(foodName == "Idli") {
		return 60.00 ;
	}
	if(foodName == "Poha") {
		return 150.00 ;
	}
	if(foodName == "Paratha") {
		return 60.00 ;
	}
	if(foodName == "Poori") {
		return 100.00 ;
	}
	if(foodName == "Bath") {
		return 150.00 ;
	}
	if(foodName == "Bonda") {
		return 50.00 ;
	}
	if(foodName == "Pongal") {
		return  140.00;
	}
	if(foodName == "Salad") {
		return 60.00 ;
	}
	if(foodName == "Chole Bhature") {
		return 150.00 ;
	}
	if(foodName == "vada") {
		return 40.00 ;
	}
	if(foodName == "Puttu") {
		return 80.00;
	}
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}
	
	
	}
	
	public static double takeOrder(String foodName,int quantity){
		
	if(foodName == "Pizza") {
		return 99.00*quantity;
	}
	if(foodName == "Burger") {
		return 120.00*quantity;
	}
	if(foodName == "Biryani") {
		return 200.00*quantity;
	}
	if(foodName == "Dosa") {
		return 50.00*quantity;
	}
	if(foodName == "Idli") {
		return 60.00 *quantity;
	}
	if(foodName == "Poha") {
		return 150.00*quantity ;
	}
	if(foodName == "Paratha") {
		return 60.00 *quantity;
	}
	if(foodName == "Poori") {
		return 100.00 *quantity;
	}
	if(foodName == "Bath") {
		return 150.00*quantity ;
	}
	if(foodName == "Bonda") {
		return 50.00 *quantity;
	}
	if(foodName == "Pongal") {
		return  140.00*quantity;
	}
	if(foodName == "Salad") {
		return 60.00 *quantity;
	}
	if(foodName == "Chole Bhature") {
		return 150.00*quantity ;
	}
	if(foodName == "vada") {
		return 40.00 *quantity;
	}
	if(foodName == "Puttu") {
		return 80.00*quantity;
	}
	
	else{
		System.out.println(foodName + " not found ");
		return 0.0;
	}	
	}



}