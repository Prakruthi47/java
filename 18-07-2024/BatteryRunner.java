class BatteryRunner{

	public static void main(String[] runner){
	
		Battery battery = new Battery();
		boolean isDataCreated = battery.createBatteryDetails("AA Alkaline Battery",1,23.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery.dispalyInfo();
		
		Battery battery1 = new Battery();
		isDataCreated = battery1.createBatteryDetails("AAA Alkaline Battery",2,11.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery1.dispalyInfo();
		
		Battery battery2 = new Battery();
		isDataCreated = battery2.createBatteryDetails("9V Alkaline Battery",3,45.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery2.dispalyInfo();
		
		Battery battery3 = new Battery();
		isDataCreated = battery3.createBatteryDetails("AA Alkaline Battery",4,23.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery3.dispalyInfo();
		
		Battery battery4 = new Battery();
		isDataCreated = battery4.createBatteryDetails("CR2032 Lithium Coin Cell",5,3.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery4.dispalyInfo();
		
		Battery battery5 = new Battery();
		isDataCreated = battery5.createBatteryDetails("D Alkaline Battery",6,140.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery5.dispalyInfo();
		
		Battery battery6 = new Battery();
		isDataCreated = battery6.createBatteryDetails("C Alkaline Battery",7,68.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery6.dispalyInfo();
		
		Battery battery7 = new Battery();
		isDataCreated = battery7.createBatteryDetails("18650 Lithium-ion Battery",8,23.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery7.dispalyInfo();
		
		Battery battery8 = new Battery();
		isDataCreated = battery8.createBatteryDetails("CR123A Lithium Battery",9,17.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery8.dispalyInfo();
		
		Battery battery9 = new Battery();
		isDataCreated = battery9.createBatteryDetails("LR44 Alkaline Button cell",10,2.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery9.dispalyInfo();
		
		Battery battery10 = new Battery();
		isDataCreated = battery10.createBatteryDetails("AA NiMH Rechargeable Battery",11,26.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery10.dispalyInfo();
		
		Battery battery11 = new Battery();
		isDataCreated = battery11.createBatteryDetails("AA NiMH Rechargeable Battery",12,14.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery11.dispalyInfo();
		
		Battery battery12 = new Battery();
		isDataCreated = battery12.createBatteryDetails("Lead-acid Car Battery",13,15000.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery12.dispalyInfo();
		
		Battery battery13 = new Battery();
		isDataCreated = battery13.createBatteryDetails("21700 Lithium-ion Battery",14,70.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery13.dispalyInfo();
		
		Battery battery14 = new Battery();
		isDataCreated = battery14.createBatteryDetails("CR2 Lithium Battery",15,11.00);
		System.out.println("is battery data created : "+isDataCreated);
		battery14.dispalyInfo();
		
		
	
	}





}