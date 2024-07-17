class GoldShopRunner{


     public static void main(String runner[]){
	 
	 	System.out.println("The gold items main is started");

	  boolean isAdded=GoldShop.addGoldItem("Gold Ring");
		  System.out.println("The gold item is added:" +isAdded);
	 boolean isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	  isAdded=GoldShop.addGoldItem("Silver Bangle");
		  System.out.println("The gold item is added:" +isAdded);
      isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
      isAdded=GoldShop.addGoldItem("Silver Necklace");
		  System.out.println("The gold item is added:" +isAdded);
      isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	  isAdded=GoldShop.addGoldItem("Designer Gold Bangle");
		  System.out.println("The gold item is added:" +isAdded);
      isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	  isAdded=GoldShop.addGoldItem("Trendy designer gold earring");
		  System.out.println("The gold item is added:" +isAdded);
      isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=GoldShop.addGoldItem("Kids Jewellary");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=GoldShop.addGoldItem("Silver Ring");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=GoldShop.addGoldItem("Diamond Necklace");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=GoldShop.addGoldItem("gold coin");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
     isAdded=GoldShop.addGoldItem("Gold necklace");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=GoldShop.addGoldItem("Diamond Ring");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=GoldShop.addGoldItem("silver trendy Ring");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=GoldShop.addGoldItem("Gold bangle");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=GoldShop.addGoldItem("Diamond necklace");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	 isAdded=GoldShop.addGoldItem("Diamond necklace");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
		  isAdded=GoldShop.addGoldItem("Diamond necklace");
		  System.out.println("The gold item is added:" +isAdded);
     isPrice=GoldShop.getGoldItemPrice(5000.0);
		  System.out.println("The gold item is added:" +isPrice);
		  
	  
	  //invoking
	  System.out.println("The available gold items are");
	  GoldShop.getGoldItems();
	  
	  System.out.println("The available gold item prices are");
	  GoldShop.getGoldItemPrices();
	  
	  //updated 
	boolean isUpdated=GoldShop.updateGoldItem("Gold Ring","Diamond Ring");
	System.out.println("The updated gold item is:" +isUpdated);
	System.out.println("The updated gold items are:"); 	  
	  	 System.out.println("The updated gold items are:"); 	  
			  GoldShop.getGoldItems();

	 
	    System.out.println("The gold items main is ended");
	 
	boolean isDeleted = GoldShop.deleteGoldItem("Kids Jewellary");
	System.out.println("is gold item deleted : "+isDeleted); 
	 
	 GoldShop.getGoldItems();
	 }


}