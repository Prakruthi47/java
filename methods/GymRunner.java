class GymRunner {

	public static void main(String[] gym) {
	
	boolean gymEquipmentAdded = Gym.createGymEquipment("Dumbbells");
	System.out.println("is gym equipment name added :"+gymEquipmentAdded);
	
	gymEquipmentAdded = Gym.createGymEquipment("StairMaster");
	System.out.println("is gym equipment name added :"+gymEquipmentAdded);
	
	gymEquipmentAdded = Gym.createGymEquipment("Treadmill");
	System.out.println("is gym equipment name added :"+gymEquipmentAdded);
	
	gymEquipmentAdded = Gym.createGymEquipment("spin bike");
	System.out.println("is gym equipment name added :"+gymEquipmentAdded);
	
	gymEquipmentAdded = Gym.createGymEquipment("smith machine");
	System.out.println("is gym equipment name added :"+gymEquipmentAdded);
	
	gymEquipmentAdded = Gym.createGymEquipment("Dipping bars");
	System.out.println("is gym equipment name added :"+gymEquipmentAdded);
	
	gymEquipmentAdded = Gym.createGymEquipment("elliptical");
	System.out.println("is gym equipment name added :"+gymEquipmentAdded);
	
	gymEquipmentAdded = Gym.createGymEquipment("Rowing Machine");
	System.out.println("is gym equipment name added :"+gymEquipmentAdded);
	
	
	
	
	 
	
	
	Gym.getGymEquipments();
	
	boolean isEquipmentNameUpdated = Gym.updateGymEquipment("Rowing Machine","Leg curl machine");
	System.out.println("is gym equipment name updated :"+isEquipmentNameUpdated);
	
	Gym.getGymEquipments();
	
	boolean isEquipmentRemoved = Gym.removeGymEquipment("Leg curl machine");
	System.out.println("is gym equipment removed : "+isEquipmentRemoved);
	
	
	Gym.getGymEquipments();
	}




}