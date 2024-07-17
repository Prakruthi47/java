class Zepto {

	public static double takeOrder(String item) {
	
	if(item == "Appy Fizz") {
		return 60.00;
	}
	if(item == "tea tree face wash") {
		return 149.00;
	}
	if(item == "lotion") {
		return 140.00;
	}
	if(item == "honey") {
		return 400.00;
	}
	if(item == "biscuits") {
		return  35.00;
	}
	if(item == "jam") {
		return 50.00 ;
	}
	if(item == "healthy drink") {
		return  120.00;
	}
	if(item == "cookies") {
		return  30.00;
	}
	if(item == "shampoo") {
		return  80.00;
	}
	if(item == "cream") {
		return  140.00;
	}
	if( item == "salt") {
		return 20.00 ;
	}
	if(item == "powder") {
		return  40.00;
	}
	if(item == "hair oil") {
		return 100.00 ;
	}
	if(item == "soap") {
		return 100.00 ;
	}
	if(item == "sugar") {
		return  50.00;
	}
	else{
		System.out.println(item + " not found ");
		return 0.0;
	}
	
	
	
	}
	
	
	public static double takeOrder(String item,int quantity){
		
	if(item == "Appy Fizz") {
		return 60.00*quantity;
	}
	if(item == "tea tree face wash") {
		return 149.00*quantity;
	}
	if(item == "lotion") {
		return 140.00*quantity;
	}
	if(item == "honey") {
		return 400.00*quantity;
	}
	if(item == "biscuits") {
		return  35.00*quantity;
	}
	if(item == "jam") {
		return 50.00 *quantity;
	}
	if(item == "healthy drink") {
		return  120.00*quantity;
	}
	if(item == "cookies") {
		return  30.00*quantity;
	}
	if(item == "shampoo") {
		return  80.00*quantity;
	}
	if(item == "cream") {
		return  140.00*quantity;
	}
	if( item == "salt") {
		return 20.00 *quantity;
	}
	if(item == "powder") {
		return  40.00*quantity;
	}
	if(item == "hair oil") {
		return 100.00 *quantity;
	}
	if(item == "soap") {
		return 100.00*quantity ;
	}
	if(item == "sugar") {
		return  50.00*quantity;
	}
	else{
		System.out.println(item + " not found ");
		return 0.0;
	}	
	}



}