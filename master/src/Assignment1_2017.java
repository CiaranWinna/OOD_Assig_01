/**
 * Student name:Ciaran Winnan	
 *
 * Student number:2940836
 * 
 */
import java.util.*;
 
public class Assignment1_2017 {
    
    public static void main(String[] args) {
    	
    		   //=====================================
  	// Test code for Question 1
  		/*System.out.println("Question 1:\n");
  		
  		Switch mySwitch = new Switch (false);
  		mySwitch.switchToString();
  		mySwitch.setSwitchState(false);
  		mySwitch.switchToString();
  		
  	
  	
  	//=======================================
  	//Test code for Question 2
		System.out.println("Question 2:\n");
		
  		Film movie1 = new Film ("Star Wars","Jack",65.8, 10.5);
  		Film movie2 = new Film ("LOTR","Bill",90.32, 110.76);
  		Film movie3 = new Film ("Twilight","John",70.7, 54.2);
  		
  		Film movieArray [] = {movie1, movie2, movie3};
  		
  		for(int i = 0; i < movieArray.length; i++){
  			System.out.println(movieArray[i].toString()+ "\n\n");
  		}
  		
  		String mostExpensiveFilm = "Star Wars";
  			
  		for(int i = 1; i < movieArray.length; i++){
  			if(movieArray[i].getProductionCost() > movieArray[i-1].getProductionCost()){
  				mostExpensiveFilm = movieArray[i].getFilmName();
  			}
  		}
  		
  		System.out.println(mostExpensiveFilm + " was the most expensive film to make!");*/
  		
  		
  		//Lab 3
  		
  		Switch panel [] = new Switch[10];
  		for( int i = 0; i < panel.length; i++){
  			System.out.print(panel[i] + " ");
  		for(int j = 0; j < panel.length; j++){
  				panel[j] = new Switch(false);
  		}
  		for(Switch sw : panel) System.out.print(sw + " ");
  			System.out.println();
  		}
  	
  	//=======================================
  
	}
}




//================================================
//code for classes here

class Switch{
	
	private boolean switchState;
	
	public Switch(boolean switchStateIndicator){
		switchState = switchStateIndicator;
	}
	
	/*public boolean getSwichState(){
		return switchState;
	}*/
	
	public void setSwitchState(boolean switchChangeState){
		
		if(switchChangeState == false){
			switchState = true;
		}
		
		else if(switchChangeState == true){
			switchState = false;
		}
	}
	
	public void switchToString(){
		if(switchState == false){
			System.out.println("Switch is: " + switchState + "(Off)\n");
		}
	
		else{
			System.out.println("Switch is: " + switchState + "(On)\n");
		}
	}
	
}
	
	
class Film{
	
	private String filmName;
	private String directorName;
	private double filmDuration;
	private double productionCost;
		
	public Film (String file, String director, double duration, double cost){
		filmName = file;
		directorName = director;
		filmDuration = duration;
		productionCost = cost;
	}
	
	public String getFilmName(){
		return filmName;
	}
	
	public String getDirectorName(){
		return directorName;
	}
	
	public double getFilmDuration(){
		return filmDuration;
	}
	
	public double getProductionCost(){
		return productionCost;
	}
	
	/*public void display(){
		System.out.println("Name: " + filmName);
		System.out.println("Director: " + directorName);
		System.out.println("filmDuration: " + filmDuration + " Minutes");
		System.out.println("Production Cost: " + productionCost + " Million\n");
	}*/
	
	public String toString (){
		String movieToString = "Film: " + filmName + "\nDirector: " + directorName + "\nDuration: " + filmDuration + " Minutes" + "\nCost: " + productionCost + " Million";
		return movieToString;
	}
}
    

