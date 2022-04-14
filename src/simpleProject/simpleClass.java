package simpleProject;
import java.util.Scanner;

public class simpleClass {
	//whatever you put here will be properties, fields, functions
	
	public static void main (String [] args) {
		//System.out.println("Hello World");
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter your name");
	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Name is: " + userName);
	    
	    System.out.println("Do you wish to continue the interactive portion?");
	    String answer = myObj.nextLine();  // User will type answer, but if they dont want to continue then type return;
	    if(answer.equals("Yes")) {
	    	
	    }//we use conditions 

//If we have a boolean option for the user, you use .equal when you are comparing strings.
//
	    return;
}//
	    
	    
	}



//This is the main class because it has the main function. Only ONE class should have the main function. 
//So AschiiChars class and ... should NOT have a mian function.