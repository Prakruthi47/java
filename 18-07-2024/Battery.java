class Battery{

	String	name;
	int	id;
	double	weight;
	
	public boolean createBatteryDetails(String name,int id,double weight){
	
		boolean isBatteryDataCreated = false;
		if(name!=null&&id>=0&&weight>=0.0){
		this.name=name;
		this.id = id;
		this.weight=weight;
		isBatteryDataCreated=true;
		}else	System.out.println("please enter correct details");
	
	return isBatteryDataCreated;
	}
	
	
	public void dispalyInfo(){
	
		System.out.println("The name of battery is: "+this.name);
		System.out.println("The id of battery is : "+this.id);
		System.out.println("The weight of battery is : "+weight);
	
	return;
	}



}