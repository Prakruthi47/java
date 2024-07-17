import java.util.Arrays;
class Bar{

     static String name="Shree Bar and Restorent";
	 static String ownerName="Shreedevi";
	 static String wineBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	 static double winePrices[]={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
	 static int wineBrandIndex;
	 static int winePriceIndex;
	 
	 public static boolean addWineBrands(String wineName){
	 
	     System.out.println("The winebrand list is started");
		 boolean isWineBrandAdded=false;
		 
		if(wineBrandIndex<wineBrands.length){
		    if(wineName!=null){
			
			wineBrands[wineBrandIndex]=wineName;
			wineBrandIndex++;
			isWineBrandAdded=true;
			
			}else System.out.println("The wine name is not found ...please provide");
		
		 }else System.out.println("the wine names are full/index is out of bound");
	 
	     System.out.println("The wine items list is ended");
        return isWineBrandAdded;	 
	 
	 }
	 public static boolean addWinePrice(double winePrice){
	    
		System.out.println("The wine price list is started");
		 boolean isWinePriceAdded=false;
		 
		 if(winePrice>0){
			 winePrices[winePriceIndex]=winePrice;
			 winePriceIndex++;
			 isWinePriceAdded=true;
			 
		 }else System.out.println("The price cannot be zero,please provide valid price");
		 
	    System.out.println("The winr price is ended");
	return isWinePriceAdded;	 
	 }
	 
	 public static boolean updateWineBrand(String oldWineBrand,String newWineBrand){
	    System.out.println("The updated wine method is started");
          boolean isWineNameUpdated=false;
		  
		  for(int index=0;index<wineBrands.length;index++){
			  if(oldWineBrand==wineBrands[index]){
				 wineBrands[index]=newWineBrand;
				 isWineNameUpdated=true;
			  }
		  }
		  if(isWineNameUpdated==false){
			  System.out.println(oldWineBrand + "not found");
		  }
 
 
	    System.out.println("The updated wine method is ended");
		return isWineNameUpdated; 
	 }
	 
	 public static void getAllBrands(){
		 
		 for(String wineBrand: wineBrands)
			 System.out.println("The wine brand is :" +wineBrand);
		 	 
	 }
	 public static void getAllPrices(){
		 
		 for(double winePrice:winePrices)
			 System.out.println("The wine prices are:" +winePrice);
		 
	 }
	 
	 
	public static boolean deleteWineBrand(String wineBrandtobeDeleted){
		System.out.println("deleteWineBrand started");
		boolean isMaterialDeleted = false;
		int oldindex,newindex;
		for(oldindex =0,newindex=0;oldindex<wineBrands.length;oldindex++){
			if(wineBrandtobeDeleted!=wineBrands[oldindex]){
				wineBrands[newindex]=wineBrands[oldindex];
				newindex++;
			}else isMaterialDeleted = true;
		}
		
		wineBrands=Arrays.copyOf(wineBrands,newindex);
		
		if(isMaterialDeleted==false){
			System.out.println(wineBrandtobeDeleted+" not found");
		}
		
		
		
		
		System.out.println("deleteWineBrand ended");
		return isMaterialDeleted;
	}



}


}