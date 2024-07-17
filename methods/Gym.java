import java.util.Arrays;
class Gym {

	static String name = "";
	static String ownerName = "";
	static String gymEquipments[] = {null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean createGymEquipment(String equipmentName){
	
		System.out.println("createGymEquipment method started");
		boolean isGymEquipmentAdded = false;
		if(equipmentName!=null){
			gymEquipments[index] = equipmentName;
			index++;
			isGymEquipmentAdded = true;
		
		}else
			System.out.println("gym equipment name cannot be null please enter correct name");
		
		System.out.println("createGymEquipment method ended");
		return isGymEquipmentAdded;
	
	}
	
		
	
	
	public static void getGymEquipments() {
		
		for(String gymEquipment:gymEquipments)
			System.out.println("the available gym equipments in gym  are: "+gymEquipment);
			
		
		
	}
	
	
	public static boolean updateGymEquipment(String oldEquipmentName,String newEquipmentName){
		System.out.println("updateGymEquipment method started");
		boolean isEquipmentNameUpdated = false;
		for(int index = 0;index<gymEquipments.length;index++){
			if(oldEquipmentName==gymEquipments[index]){
				gymEquipments[index] = newEquipmentName;
				isEquipmentNameUpdated = true;
				
			}
			
			
		}
		if(isEquipmentNameUpdated==false){
			System.out.println(oldEquipmentName+" not found");
		}
		
		
		
		System.out.println("updateGymEquipment method ended");
		return isEquipmentNameUpdated;
	}
	
	
	public static boolean removeGymEquipment(String equipmenttobeRemoved){
		System.out.println("removeGymEquipment started");
		
		boolean isEquipmentRemoved = false;
		int oldindex,newindex;
		for(newindex = 0,oldindex=0;oldindex<gymEquipments.length;oldindex++){
			if(equipmenttobeRemoved!=gymEquipments[oldindex]){
			
			gymEquipments[newindex]=gymEquipments[oldindex];
			newindex++;
			
			}else isEquipmentRemoved =true;
			
		}
		gymEquipments = Arrays.copyOf(gymEquipments,newindex);
		if(isEquipmentRemoved == false){
			System.out.println(equipmenttobeRemoved + "not found");
		}
		
		
		
		
		
		System.out.println("removeGymEquipment ended");
		return isEquipmentRemoved;
	}



}