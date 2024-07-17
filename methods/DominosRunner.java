class  DominosRunner{

	public static void main(String runner[]) {
	
		double price = Dominos.takeOrder("cheese and corn");
		System.out.println(price);
		
		double price1 = Dominos.takeOrder("cheese and corn",3);
		System.out.println(price1);
	
	}



}