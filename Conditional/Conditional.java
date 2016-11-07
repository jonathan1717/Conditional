import java.util.Scanner;

public class Conditional
	{

		public static void main(String[] args)
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello, " + name + "!");
			System.out.println("Try to guess the number that I am thinking of. The number is between one and twenty.");
			Scanner userInput = new Scanner(System.in);
			int number = userInput.nextInt();
			System.out.println("");
			if (number==10)
				{
					System.out.println("That is the correct number!");	
				}
			else if (number== 17)
				{
					System.out.println("That is wrong!");
				}
			

			}

	}
