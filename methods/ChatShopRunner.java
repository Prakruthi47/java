class ChatShopRunner {

	public static void main(String[] shop) {
	
	boolean chatNameAdded = ChatShop.addChatName("bhel puri");
	System.out.println("is chat name added :"+chatNameAdded);
	boolean priceAdded = ChatShop.addChatPrice(40.00);
	
	chatNameAdded = ChatShop.addChatName("pani puri");
	System.out.println("is chat name added :"+chatNameAdded);
	priceAdded = ChatShop.addChatPrice(40.00);
	
	chatNameAdded = ChatShop.addChatName("masala puri");
	System.out.println("is chat name added :"+chatNameAdded);
	priceAdded = ChatShop.addChatPrice(40.00);
	
	chatNameAdded = ChatShop.addChatName("dahi puri");
	System.out.println("is chat name added :"+chatNameAdded);
	priceAdded = ChatShop.addChatPrice(40.00);
	
	 chatNameAdded = ChatShop.addChatName("sev puri");
	System.out.println("is chat name added :"+chatNameAdded);
	priceAdded = ChatShop.addChatPrice(40.00);
	
	 chatNameAdded = ChatShop.addChatName("tikki puri");
	System.out.println("is chat name added :"+chatNameAdded);
	priceAdded = ChatShop.addChatPrice(40.00);
	
	
	ChatShop.getChatNames();
	
	boolean ischatnameUpdated = ChatShop.updateChatNames("tikki puri","kachori");
	System.out.println("is chat name updated : " +ischatnameUpdated);
	
	ChatShop.getChatNames();
	
	//ChatShop.getChatPrices();
	
	boolean ischatnameDeleted = ChatShop.deleteChatName("dahi puri");
	System.out.println("is chat name deleted : " +ischatnameDeleted);
	
	ChatShop.getChatNames();
	}




}