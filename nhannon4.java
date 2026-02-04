// Neal Hannon
// CSC 321
// Lab 4

import java.util.Scanner;
public class nhannon4
{
	public static void main(String[] args)
	{
		System.out.println("Select from the following options: ");
		System.out.println("1: Quote\n2: Joke\n3: Hope\n 4: Nope");
		System.out.println("Selection: (1-4)");

		Scanner keyboard = new Scanner(System.in);
		int intInput = keyboard.nextInt();

		if (intInput == 1)
		{
			System.out.println("I got a bad feeling about this.");
		}
		else if (intInput == 2)
		{
			System.out.println("Blunt pencils are really pointless.");
		}
		else if (intInput == 3)
		{
			System.out.println("I believe in you!");
		}
		else if (intInput == 4)
		{
			System.out.println("NOPE!");
		}
		else
		{
			System.out.println("Invalid input.");
		}
	}
}
