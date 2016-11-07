import java.util.Scanner;

public class Conditional
	{

		public static void main(String[] args)
			{
			
			//greeting
			//secretNumber
				{
				boolean stillGuessing = true;
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Hello, " + name + "!");
					
			
				int secretNumber=(int) (Math.random()*10)+1;  
				System.out.println("");
				System.out.println("Try to guess the number that I am thinking of!. The number is between one and ten.");
				
			
					while (stillGuessing)
						{
							Scanner userInput2 = new Scanner(System.in);
						int userGuess = userInput2.nextInt();
						if (userGuess == secretNumber)
						{
						System.out.println("That is the correct number! Great Job!");	
						}
				else if (userGuess > secretNumber)
						{
						System.out.println("That is too high!");
						}
				
				else if (userGuess < secretNumber)
						{
						System.out.println("That is too low!"); 
						}
					
					}
				
				}
				

			}
		
		
	}	

				

					
