import java.util.Arrays;
class Girias {

	static String name = "";
	static String ownerName = "";
	static String homeAppliances[] = {null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createHomeAppliance(String homeApplianceName){
	
		System.out.println("createHomeAppliance method started");
		boolean isHomeApplianceAdded = false;
		if(homeApplianceName!=null){
			homeAppliances[index] = homeApplianceName;
			index++;
			isHomeApplianceAdded = true;
		
		}else
			System.out.println("home Appliances name cannot be null please enter correct name");
		
		System.out.println("createHomeAppliance method ended");
		return isHomeApplianceAdded;
	
	}
	
		
	
	
	public static void getHomeAppliances() {
		
		for(String homeAppliance:homeAppliances)
			System.out.println("the available home Appliances  are: "+homeAppliance);
			
		
		
	}
	
	public static boolean updateHomeAppliances(String oldApplianeName ,String newApplianceName){
		boolean isHomeApplianceNameUpdated = false;
		for(index=0;index<homeAppliances.length;index++){
			if(oldApplianeName == homeAppliances[index]){
				homeAppliances[index] = newApplianceName;
				isHomeApplianceNameUpdated=true;
			}
			
		}
		if(isHomeApplianceNameUpdated==false){
			System.out.println(oldApplianeName+" not found");
		}
		
	return isHomeApplianceNameUpdated;	
	}
	
	public static boolean removeHomeEquipment(String equipmenttobeRemoved){
		System.out.println("removeHomeEquipment started");
		
		boolean isEquipmentRemoved = false;
		int oldindex,newindex;
		for(newindex = 0,oldindex=0;oldindex<homeAppliances.length;oldindex++){
			if(equipmenttobeRemoved!=homeAppliances[oldindex]){
			
			homeAppliances[newindex]=homeAppliances[oldindex];
			newindex++;
			
			}else isEquipmentRemoved =true;
			
		}
		homeAppliances = Arrays.copyOf(homeAppliances,newindex);
		if(isEquipmentRemoved == false){
			System.out.println(equipmenttobeRemoved + "not found");
		}
		
		
		
		
		
		System.out.println("removeHomeEquipment ended");
		return isEquipmentRemoved;
	}
	
	



}