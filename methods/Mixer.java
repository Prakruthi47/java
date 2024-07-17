class Mixer {

	static boolean isConnected = false;
	
	public static void onOrOff() {
		System.out.println("onOrOff started");
		if(isConnected == false) {
			isConnected = true;
			System.out.println("Mixer is onn");
		}else if(isConnected == true){
			isConnected =false;
			System.out.println("Mixer is off");
		}
	
		System.out.println("onOrOff ended");
	return;
	} 
	static int currentSpeed;
	static int maximumSpeed = 3;
	static int minimumSpeed;
	
	public static void increaseSpeed(){
		System.out.println("increaseSpeed started");
		if(isConnected==true){
			if(currentSpeed< maximumSpeed){
				currentSpeed = currentSpeed +1;
				System.out.println(currentSpeed);	
			}else{
				System.out.println("maximum speed reached");
			}
		}else{
			System.out.println("onn the Mixer");
			
		}	
		System.out.println("increaseSpeed ended");
		return;	
	}




}