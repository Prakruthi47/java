class BlinkIt {

	public static double takeOrder(String item ) {
	
	if(item == "Milk") {
		return 48.00;
	}
	if(item == "bread") {
		return 120.00;
	}
	if(item == "eggs") {
		return 200.00;
	}
	if(item == "ghee") {
		return 50.00;
	}
	if(item == "namkeen") {
		return  120.00;
	}
	if(item == "maggi") {
		return  105.00;
	}
	if(item == "coca-cola") {
		return  60.00;
	}
	if(item == "soap") {
		return  35.00;
	}
	if(item == "toothpaste") {
		return  50.00;
	}
	if(item == "biscuits") {
		return  30.00;
	}
	if(item == "corn flakes") {
		return  120.00;
	}
	if(item == "chips") {
		return  40.00;
	}
	if(item == "kurkure") {
		return 35.00 ;
	}
	if(item == "chocolate") {
		return  60.00;
	}
	if(item.equalsIgnoreCase("tea powder")) {
		return  50.00;
	}
	else{
		System.out.println(item + " not found ");
		return 0.0;
	}
	
	
	}
	
	public static double takeOrder(String item,int quantity ) {
	
	if(item == "Milk") {
		return 48.00*quantity;
	}
	if(item == "bread") {
		return 120.00*quantity;
	}
	if(item == "eggs") {
		return 200.00*quantity;
	}
	if(item == "ghee") {
		return 50.00*quantity;
	}
	if(item == "namkeen") {
		return  120.00*quantity;
	}
	if(item == "maggi") {
		return  105.00*quantity;
	}
	if(item == "coca-cola") {
		return  60.00*quantity;
	}
	if(item == "soap") {
		return  35.00*quantity;
	}
	if(item == "toothpaste") {
		return  50.00*quantity;
	}
	if(item == "biscuits") {
		return  30.00*quantity;
	}
	if(item == "corn flakes") {
		return  120.00*quantity;
	}
	if(item == "chips") {
		return  40.00*quantity;
	}
	if(item == "kurkure") {
		return 35.00 *quantity;
	}
	if(item == "chocolate") {
		return  60.00*quantity;
	}
	if(item.equalsIgnoreCase("tea powder")) {
		return  50.00*quantity;
	}
	else{
		System.out.println(item + " not found ");
		return 0.0;
	}
	
	
	}



}