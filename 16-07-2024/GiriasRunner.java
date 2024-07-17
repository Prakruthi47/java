class GiriasRunner {

	public static void main(String[] gym) {
	
	boolean homeApplianceAdded = Girias.createHomeAppliance("Water Purifier");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("Flask");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("Mixer Grinder");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("Mini Chopper");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("Iron Box");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("Electric Kettle");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("Electric Chimney");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("vaccum cleaner");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("Hand blender");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("Toaster");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("Electric cooker");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	homeApplianceAdded = Girias.createHomeAppliance("Induction stove");
	System.out.println("is home Appliance  name added :"+homeApplianceAdded);
	
	
	Girias.getHomeAppliances();
	
	
	boolean isNameUpdated =Girias.updateHomeAppliances("Induction stove","Fan");
	System.out.println("is home appliance name updated:"+isNameUpdated);
	
	Girias.getHomeAppliances();
	
	
	boolean isNameDeleted =Girias.removeHomeEquipment("Fan");
	System.out.println("is home appliance name Deleted:"+isNameDeleted);
	
	Girias.getHomeAppliances();
	}




}