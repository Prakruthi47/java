class ZeptoRunner {

	public static void main(String runner[]) {
	
		double price = Zepto.takeOrder("honey");
		System.out.println(price);
		double price1 = Zepto.takeOrder("honey",2);
		System.out.println(price1);
	
	}



}