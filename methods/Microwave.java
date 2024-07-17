class Microwave {

	static boolean isConnected = false;
	
	public static void onOrOff() {
		System.out.println("onOrOff started");
		if(isConnected == false) {
			isConnected = true;
			System.out.println("microwave is onn");
		}else if(isConnected == true){
			isConnected =false;
			System.out.println("microwave is off");
		}
	
		System.out.println("onOrOff ended");
	return;
	} 
	static int currentTemp;
	static int maximumTemp = 2000;
	static int minimumTemp;
	
	public static void increaseTemperature(){
		System.out.println("increaseTemperature started");
		if(isConnected==true){
			if(currentTemp< maximumTemp){
				currentTemp = currentTemp +500;
				System.out.println(currentTemp);	
			}else{
				System.out.println("maximum temperature reached");
			}
		}else{
			System.out.println("onn the Microwave");
			
		}	
		System.out.println("increaseTemperature ended");
		return;	
	}



}