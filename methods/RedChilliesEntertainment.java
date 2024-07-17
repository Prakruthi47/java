import java.util.*;
class RedChilliesEntertainment {

	
	static String movieActors[] = {null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addMovieActors(String actorsName){
	
		System.out.println("addMovieActors method started");
		boolean isMovieActorsAdded = false;
		if(actorsName!=null){
			movieActors[index] = actorsName;
			index++;
			isMovieActorsAdded = true;
		
		}else
			System.out.println("Movie actors name cannot be null please enter correct name");
		
		System.out.println("addMovieActors method ended");
		return isMovieActorsAdded;
	
	}
	
		
	
	
	public static void getMovieActors() {
		
		for(String movieActor:movieActors)
			System.out.println("the available movie Actors  are: "+movieActor);
			
		
		
	}
	
	public static boolean updateMovieActor(String oldActorName ,String newActorName){
		boolean isActorNameUpdated = false;
		for(index=0;index<movieActors.length;index++){
			if(oldActorName == movieActors[index]){
				movieActors[index] = newActorName;
				isActorNameUpdated=true;
			}
			
		}
		if(isActorNameUpdated==false){
			System.out.println(oldActorName+" not found");
		}
		
	return isActorNameUpdated;	
	}
	
	
	
	public static boolean deleteActorName(String actorNametobeDeleted){
		System.out.println("deleteActorName started");
		boolean isActorNameDeleted = false;
		int oldindex,newindex;
		for(oldindex =0,newindex=0;oldindex<movieActors.length;oldindex++){
			if(actorNametobeDeleted!=movieActors[oldindex]){
				movieActors[newindex]=movieActors[oldindex];
				newindex++;
			}else isActorNameDeleted = true;
		}
		
		movieActors=Arrays.copyOf(movieActors,newindex);
		
		if(isActorNameDeleted==false){
			System.out.println(actorNametobeDeleted+" not found");
		}
		
		
		
		
		System.out.println("deleteActorName ended");
		return isActorNameDeleted;
	}



}