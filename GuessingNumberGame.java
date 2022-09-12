import java.util.Arrays;
import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number, randomNumber;
		int right = 5;
		int[] numberArray = new int[right];
		int count = 0;
		boolean isWrongRange = false;

		randomNumber = (int) (Math.random() * 101);

		while (right > 0) {
			System.out.println("Guess the number:");
			number = sc.nextInt();

			if (number >= 0 && number <= 100) {
				if (number == randomNumber) {
					System.out.println("You won :).");
					break;
				} else if (number > randomNumber)
					System.out.println("Secret number is smaller.");

				else
					System.out.println("Secret number is bigger.");

				numberArray[count] = number;
				count++;
				right--;
			} else {
				System.out.println("Guessed number is not in the range(0-100)");
				if (!isWrongRange) {
					System.out
							.println("If the entered number is not in the range again, your right will be decreased.");
					isWrongRange = true;
				} else {
					right--;
					numberArray[count] = number;
					count++;
				}
			}
			if (right != 0)
				System.out.println("You have " + right + " left");
		}
		if (right == 0)
			System.out.println("You lose :(");
		System.out.println("Your guesses are: " + Arrays.toString(numberArray));
		System.out.println("The secret number is: " + randomNumber);
	}

}
