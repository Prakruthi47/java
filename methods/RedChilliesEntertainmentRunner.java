class RedChilliesEntertainmentRunner {

	public static void main(String[] entertainment) {
	
	boolean movieActorNameAdded = RedChilliesEntertainment.addMovieActors("Shah Rukh Khan");
	System.out.println("is movie actor  name added :"+movieActorNameAdded);
	
	movieActorNameAdded = RedChilliesEntertainment.addMovieActors("Deepika Padukone");
	System.out.println("is movie actor  name added :"+movieActorNameAdded);
	
	movieActorNameAdded = RedChilliesEntertainment.addMovieActors("kajol");
	System.out.println("is movie actor  name added :"+movieActorNameAdded);
	
	movieActorNameAdded = RedChilliesEntertainment.addMovieActors("Alia Bhatt");
	System.out.println("is movie actor  name added :"+movieActorNameAdded);
	
	movieActorNameAdded = RedChilliesEntertainment.addMovieActors("Anushka Sharma");
	System.out.println("is movie actor  name added :"+movieActorNameAdded);
	
	movieActorNameAdded = RedChilliesEntertainment.addMovieActors("varun Dhawan");
	System.out.println("is movie actor  name added :"+movieActorNameAdded);
	
	movieActorNameAdded = RedChilliesEntertainment.addMovieActors("sidharth Malhotra");
	System.out.println("is movie actor  name added :"+movieActorNameAdded);
	
	movieActorNameAdded = RedChilliesEntertainment.addMovieActors("Katrina Kaif");
	System.out.println("is movie actor  name added :"+movieActorNameAdded);
	
	movieActorNameAdded = RedChilliesEntertainment.addMovieActors("Sushmita Sen");
	System.out.println("is movie actor  name added :"+movieActorNameAdded);
	
	
	
	
	RedChilliesEntertainment.getMovieActors();
	
	boolean isActorNameUpdated = RedChilliesEntertainment.updateMovieActor("Sushmita Sen","Ranbir Kapoor");
	System.out.println("is actor name updated : "+isActorNameUpdated);
	
	RedChilliesEntertainment.getMovieActors();
	
	
	boolean isActorNameDeleted = RedChilliesEntertainment.deleteActorName("Ranbir Kapoor");
	System.out.println("is actor name deleted : "+isActorNameDeleted);
	
	RedChilliesEntertainment.getMovieActors();
	}




}