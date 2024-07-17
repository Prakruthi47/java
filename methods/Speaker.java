class Speaker {

	static boolean isConnected = false;
	
	public static void onOrOff() {
		System.out.println("onOrOff started");
		if(isConnected == false) {
			isConnected = true;
			System.out.println("speaker is onn");
		}else if(isConnected == true){
			isConnected =false;
			System.out.println("speaker is off");
		}
	
		System.out.println("onOrOff ended");
	return;
	} 
	static int currentVol;
	static int maximumVol = 5;
	static int minimumVol;
	
	public static void increaseVolume(){
		System.out.println("increaseVolume started");
		if(isConnected==true){
			if(currentVol< maximumVol){
				currentVol = currentVol +1;
				System.out.println(currentVol);	
			}else{
				System.out.println("maximum volume reached");
			}
		}else{
			System.out.println("onn the speaker!!!");
			
		}	
		System.out.println("increaseVolume ended");
		return;	
	}



}