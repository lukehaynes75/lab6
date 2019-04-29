package labnum6;

import java.util.Random;
import java.util.Scanner;

public class dicerolling {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String enter = "yes";
		String roll = "yes";

		do {

			while (roll.equalsIgnoreCase("yes")) {
				System.out.println("How many sides are on the die?");
				int sides = scan.nextInt(); // how many sides on the die?
				int die1 = generateRandomDieRoll2(sides);
				int die2 = generateRandomDieRoll(sides);
				System.out.println("Would you like to roll the dice? Yes/no");
				roll = scan.next();

				if (roll.equalsIgnoreCase("no")) {
					enter = "no";
					break;
				} else if (die1 == 6 && die2 == 6) {
					System.out.println("Box Car! " + die1 + ", " + die2);
				} else if (die1 == 1 && die2 == 1) {
					System.out.println("Snake Eyes! " + die2 + ", " + die1);
				} else if (die1 == 5 && die2 == 5) {// Rolled a double 5 for nice guys
					System.out.println("Fives are for nice guys " + die2 + ", " + die1);
				} else {
					System.out.println("First dice  " + die1 + " and the second dice " + die2);

				}
				System.out.println("Do you want to roll again? yes/no");
				enter = scan.next();
			}

		} while (enter.equalsIgnoreCase("yes"));
		scan.close();
		System.out.println("Goodbye");
	}

	public static int generateRandomDieRoll2(int sides) {
		int roll = (int) (Math.random() * sides) + 1;

		return roll;
	}

	public static int generateRandomDieRoll(int sides) {
		Random rand = new Random();
		int rollin = rand.nextInt(sides) + 1;

		return rollin;
	}
}
