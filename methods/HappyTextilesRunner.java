class HappyTextilesRunner{


     public static void main(String runner[]){
	 
	 	System.out.println("The textile main is started");
		
		boolean isAdded=HappyTextiles.addMaterial("Cotton");
		  System.out.println("The shoe brand is added:" +isAdded);
	   boolean isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //1
	    isAdded=HappyTextiles.addMaterial("Wool");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //2
	    isAdded=HappyTextiles.addMaterial("Silk");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
		//3  
       isAdded=HappyTextiles.addMaterial("Nylon");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
		 //4 
		  isAdded=HappyTextiles.addMaterial("Flax");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //5
	 isAdded=HappyTextiles.addMaterial("Polyester");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //6
	 isAdded=HappyTextiles.addMaterial("Mineral");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //7
	 isAdded=HappyTextiles.addMaterial("Synthetic");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //8
	 isAdded=HappyTextiles.addMaterial("Hemp fibers");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //9
	 isAdded=HappyTextiles.addMaterial("Jute");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //10
	 isAdded=HappyTextiles.addMaterial("Chemical and Auxiliaries");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //11
	 isAdded=HappyTextiles.addMaterial("Dyes");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //12
	 isAdded=HappyTextiles.addMaterial("Fabric");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //13
	 isAdded=HappyTextiles.addMaterial("Yarn");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //14
	 isAdded=HappyTextiles.addMaterial("Denim");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       //15
	 isAdded=HappyTextiles.addMaterial("Leather");
		  System.out.println("The shoe brand is added:" +isAdded);
	    isPrice=HappyTextiles.addMaterialPrice(5000.0);
		  System.out.println("The material price is added:" +isPrice);
       
	 
	     //invoking
	  System.out.println("The available materials are");
      HappyTextiles.getAllMaterials();	  
	  System.out.println("The available shoe prices are");
      HappyTextiles.getAllMaterialPrices();
	  
	  //updated 
	boolean isUpdated=HappyTextiles.updateMaterial("Cross","Khadim's");
	System.out.println("The updated material is:" +isUpdated);
	  	  	  
	  	 System.out.println("The updated materials are:"); 	  
      HappyTextiles.getAllMaterials();	  


	boolean isDeleted=HappyTextiles.deleteMaterialName("Cross");
	System.out.println("is material deleted:" +isDeleted);
	  	  	  
	  	 System.out.println("The updated materials are:"); 	  
      HappyTextiles.getAllMaterials();
       
	 
	 
	 
	 
	 	 	System.out.println("The textile main is ended");

	 
	 
	 }



}