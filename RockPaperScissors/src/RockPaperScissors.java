
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		// Create Scanner and Random objects
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		// Options for the game
		String[] rps = { "r", "p", "s" };

		// Game loop
		while (true) {
			// User input
			System.out.println("Enter your choice (r, p, s). Type 'exit' to quit:");
			String userChoice = scanner.nextLine();

			// Check if the user wants to exit
			if (userChoice.equalsIgnoreCase("exit")) {
				System.out.println("Thanks for playing!");
				break;
			}

			// Validate user input
			boolean validInput = false;
			for (String option : rps) {
				if (userChoice.equalsIgnoreCase(option)) {
					validInput = true;
					break;
				}
			}
			if (!validInput) {
				System.out.println("Invalid choice. Please choose r, p, or s.");
				continue;
			}

			// Computer choice
			int computerChoiceIndex = random.nextInt(3);
			String computerChoice = rps[computerChoiceIndex];

			// Display choices
			System.out.println("Computer choice: " + computerChoice);

			// Determine the winner
			if (userChoice.equalsIgnoreCase(computerChoice)) {
				System.out.println("It's a tie!");
			} else if ((userChoice.equalsIgnoreCase("r") && computerChoice.equals("s"))
					|| (userChoice.equalsIgnoreCase("p") && computerChoice.equals("r"))
					|| (userChoice.equalsIgnoreCase("s") && computerChoice.equals("p"))) {
				System.out.println("You win!");
			} else {
				System.out.println("You lose!");
			}

			System.out.println(); // New line for readability
		}

		scanner.close();
	}
}
