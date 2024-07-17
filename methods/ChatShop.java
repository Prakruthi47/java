import java.util.Arrays;
class ChatShop {

	static String name = "Shreedevi Chats";
	static String ownerName = "";
	static String chatNames[] = {null,null,null,null,null,null};
	static double chatPrices[] = {0.0,0.0,0.0,0.0,0.0,0.0};
	static int chatNameindex;
	static int chatPriceIndex;
	
	public static boolean addChatName(String chatName){
	
		System.out.println("addChatName method started");
		boolean isChatNameAdded = false;
		if(chatNameindex<chatNames.length){
			if(chatName!=null){
				chatNames[chatNameindex] = chatName;
				chatNameindex++;
				isChatNameAdded = true;
		
			}else
				System.out.println("chat name cannot be null please enter correct name");
		}else{
			System.out.println("chat name is full... ");
		}
		System.out.println("addChatName method ended");
		return isChatNameAdded;
	
	}
	public static boolean addChatPrice(double chatPrice){
	
		System.out.println("addChatPrice method started");
		boolean isChatPriceAdded = false;
		if(chatPrice >0.0){
			chatPrices[chatPriceIndex] = chatPrice;
			chatPriceIndex++;
			isChatPriceAdded = true;
		
		}else
			System.out.println("chat price cannot be zero please enter correct price");
		
		System.out.println("addChatPrice method ended");
		return isChatPriceAdded;
	
	}
	
	
	
	
	public static void getChatNames() {
		
		for(String chatName:chatNames)
			System.out.println("the available chat are: "+chatName);
			
		
		
	}
	public static void getChatPrices() {
		
		for(double chatPrice:chatPrices)
			System.out.println("the price of  are"+chatPrice);
			
		
		
	}
	
	public static boolean updateChatNames(String oldChatName,String newChatName){
		System.out.println("updateChatNames method started");
		boolean isChatNameUpdated = false;
		for(int index = 0;index<chatNames.length;index++){
			if(oldChatName==chatNames[index]){
				chatNames[index] = newChatName;
				isChatNameUpdated = true;
				
			}
			
			
		}
		if(isChatNameUpdated==false){
			System.out.println(oldChatName+" not found");
		}
		
		
		
		
		System.out.println("updateChatNames method ended");
		return isChatNameUpdated;
	}
	
	
	
	public static boolean deleteChatName(String chatNametobeDeleted){
		System.out.println("deleteChatName started");
		boolean isChatNameDeleted = false;
		int oldindex,newindex;
		for(newindex =0,oldindex=0;oldindex<chatNames.length;oldindex++){
			if(chatNametobeDeleted!=chatNames[oldindex]){
				
				chatNames[newindex]=chatNames[oldindex];
				newindex++;
				
			}else isChatNameDeleted =true;	
			
		}
		chatNames = Arrays.copyOf(chatNames,newindex);
		/*if(chatNames!=null){
			isChatNameDeleted=true;
		}*/
		if(isChatNameDeleted==false){
			
			System.out.println(chatNametobeDeleted+" not found");
		}
		
		
		System.out.println("deleteChatName started");
		
		return isChatNameDeleted;
	}



}