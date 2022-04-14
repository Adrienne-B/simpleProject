package simpleProject;

import java.util.Scanner;
import java.util.Random;

//I had asked him why there is a clamp main: he explain
//This is calling a function off an instance.(first type of operation)
//Lottery myValue = new Lottery();
//myValue.clamp();

//While this is calling a function directly off of the class. If you do this, 
//you don't have an instance to work with. Function is not to be call directly off of class, so it is static.(Another operations).
//You want to be able to call clamp without creating a lottery object.
//So in order to call clamp we have to put magicBall = Lottery.clamp(magicBall, 75) which will be on line 88.;
//Lottery.clamp();


public class Lottery {
	
	//There is no problem with declaring functions inside of a class.
	//We can define a function, and declare as many as we want.
	public static int clamp(int value, int minValue, int maxValue) { //static means whether the function needs to be called itself.
		int range = maxValue - minValue + 1;
		
		while(value > maxValue) {
			value -= range;
			//when the value is greater than maxValue, you will subtract that range.
		}
		while(value < minValue) {
			value += range;
			//when the value is lesser than minValue, you will add that range.
		}
		return value;
		//now this will allow us to use clamps with minValue and maxValue.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name");
		String fullName = input.nextLine(); //variable will be what the scanner is asking which is name, the user will give.
		System.out.println("Hello " + fullName);
		
		System.out.print("Do you want to continue?");
		String response = input.nextLine();
		//Now we need to read the response to see if they responded with "yes" or "y"
		//We will use a compare operator by using if statement
		
		while(response.equals("yes") || response.equals("y"));//two options a user may use to answer a question if they want to continue.
				
				System.out.println("What is the name of your favorite pet?");
				String petName = input.nextLine();
				
				System.out.print("what is your lucky number?");
				Integer luckyNumber = Integer.parseInt(input.nextLine()); //parsetInt will convert a string into an integer.
				
				
				System.out.println("Do you have a favorite quarterback?");
				response = input.nextLine();
				boolean hasFavoriteQB = false;
				
				Integer jerseyNumber = -1;
					if(response.equals("yes")|| response.equals("y")) {
						hasFavoriteQB = true;
						System.out.println("What is your jersey number?");
						jerseyNumber = Integer.parseInt(input.nextLine()); //parsetInt will convert a string into an integer.
				}
					
				System.out.println("What are the two digit model year of your car?");
				Integer carYear = Integer.parseInt(input.nextLine()); //parsetInt will convert a string into an integer.
				
				System.out.println("What is the first name of your favorite actor/actress?");
				String thespianName = input.nextLine(); 
				
				System.out.println("Enter a random number between 1 and 50?");
				Integer userRandomNumber = Integer.parseInt(input.nextLine()); //parsetInt will convert a string into an integer.
				
				
					//Now we will generate an output (to generate numerous ball options
					Random rng = new Random(); //This will create random numbers.
					int randomNumbers[] = new int[3];
					for(int i=0; i<randomNumbers.length; ++i) {
						randomNumbers[i] = rng.nextInt(76);
					}
					
					int magicBall;
						if(hasFavoriteQB) {
							magicBall = jerseyNumber;
						}else{
							magicBall = luckyNumber * randomNumbers[0];
						}
						//They want the magicBall to fall in the range 1 to 75. 
						//While they want the regular balls to fall in the 1 to 65
						while(magicBall > 75) {
							magicBall -= 75;
						}
						magicBall = clamp(magicBall, 1, 75);
						//Since we are calling static inside of this function you dont need Lottery.clamp(magicBall, 75)...(you don't have to specify it.
						int[] balls = new int[5];
						
						//Find the 3rd letter of their favorite pet, convert that
						//The character value to as integer value, so we use Char.
						
						//Since balls is in array (line 89), so when you start index 0 counts as 1 (index).
						balls[0] = petName.charAt(2);
						//clamp because the number maybe bigger than 75
						balls[0] = clamp(balls[0], 1, 65);
						
						balls[1] = carYear + luckyNumber;
						balls[1] = clamp(balls[1],1, 65);
						
						balls[2] = userRandomNumber - randomNumbers[1];
						//But we still have a problem, even though we fixed clamps when it is over 75, you still 
						//there is a possibility to get a negative/lower numbers.
						//So we have to make sure we add another clamp (minValue) so we can work with lower numbers in line 22 ().
						balls[2] = clamp(balls[2], 1, 65);
						
						balls[3] = thespianName.charAt(thespianName.length()-1);
						balls[3] = clamp(balls[3], 1, 65);
						
						balls[4] = 42;
						
						System.out.print("Lottery numbers: ");
						for(int i=0; i<balls.length; ++i ) {
							System.out.print(balls[i]);
							if( i != balls.length-1) {
								System.out.print(",");
							}
						}
						System.out.println(" Magic ball: " + magicBall);
						
						System.out.println("Would you like to play again?");
						response = input.nextLine();
						
				}
			}
		
//Always make sure variables' name matches,
//Make sure there are enough appropriate closing brackets
//Make sure semicolons are at the very end of any constructors, methods, functions, prints, etc.

	
			

