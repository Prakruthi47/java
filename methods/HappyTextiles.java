import java.util.Arrays;
class HappyTextiles{

     static String name="Happy Textiles";
	 static String ownerName="Shree";
	 static String materialBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	 static double materialPrices[]={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
	 static int materialBrandIndex;
	 static int materialPriceIndex;
	 
	 public static boolean addMaterial(String materialBrand){
	 
	     System.out.println("The material list is started");
		 boolean isMaterialAdded=false;
		 
		if(materialBrandIndex<materialBrands.length){
		    if(materialBrand!=null){
			
			materialBrands[materialBrandIndex]=materialBrand;
			materialBrandIndex++;
			isMaterialAdded=true;
			
			}else System.out.println("The material is not found ...please provide");
		
		 }else System.out.println("the material are full/index is out of bound");
	 
	     System.out.println("The material list is ended");
        return isMaterialAdded;	 
	 
	 }
	 public static boolean addMaterialPrice(double materialPrice){
	    
		System.out.println("The material price list is started");
		 boolean isMaterialPriceAdded=false;
		 
		 if(materialPrice>0){
			 materialPrices[materialPriceIndex]=materialPrice;
			 materialPriceIndex++;
			 isMaterialPriceAdded=true;
			 
		 }else System.out.println("The price cannot be zero,please provide valid price");
		 
	    System.out.println("The material price is ended");
	return isMaterialPriceAdded;	 
	 }
	 
	 public static boolean updateMaterial(String oldMaterial,String newMaterial){
	    System.out.println("The updated material method is started");
          boolean isMaterialNameUpdated=false;
		  
		  for(int index=0;index<materialBrands.length;index++){
			  if(oldMaterial==materialBrands[index]){
				 materialBrands[index]=newMaterial;
				 isMaterialNameUpdated=true;
			  }
		  }
		  if(isMaterialNameUpdated==false){
			  System.out.println(oldMaterial + "not found");
		  }
 
 
	    System.out.println("The updated material method is ended");
		return isMaterialNameUpdated; 
	 }
	 
	 public static void getAllMaterials(){
		 
		 for(String materialName: materialBrands)
			 System.out.println("The material name is :" +materialName);
		 	 
	 }
	 public static void getAllMaterialPrices(){
		 
		 for(double materialPrice:materialPrices)
			 System.out.println("The material prices are:" +materialPrice);
		 
	 }
	 
	 
	public static boolean deleteMaterialName(String materialtobeDeleted){
		System.out.println("deleteMaterialName started");
		boolean isMaterialDeleted = false;
		int oldindex,newindex;
		for(oldindex =0,newindex=0;oldindex<materialBrands.length;oldindex++){
			if(materialtobeDeleted!=materialBrands[oldindex]){
				materialBrands[newindex]=materialBrands[oldindex];
				newindex++;
			}else isMaterialDeleted = true;
		}
		
		materialBrands=Arrays.copyOf(materialBrands,newindex);
		
		if(isMaterialDeleted==false){
			System.out.println(materialtobeDeleted+" not found");
		}
		
		
		
		
		System.out.println("deleteMaterialName ended");
		return isMaterialDeleted;
	}



}