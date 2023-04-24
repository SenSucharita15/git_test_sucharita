package StudentNameGuessing;

import java.util.*;

public class StudentNameGuessingGame {
	String studentNames[] = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"kamaldeep", "Manpreets", "Manpreetk", "Mariya", "Neelam", "Namitha", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Sucharita", "Vindhuja" };
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	String student = studentNames[rand.nextInt(studentNames.length)];

	int points = 5;
	int wrongGuess = 0;
	boolean flag = false;
	// int index;
	int numGuessLetters = 0;
	char[] guessedLetter = new char[student.length()];
	// To keep track of the guess letters

	void displayRandomName() {
		Random rand = new Random();
		// int index = rand.nextInt(names.length);
		System.out.println();
		for (int i = 0; i < student.length(); i++) {

			System.out.print(" -\t ");

		}
	}

	int startGuessingTheLetter() {
		// System.out.println("You are guessing ");

		while (points > 0) {
			// System.out.println("You are guessing ");

			System.out.println("\n Guess a letter :");
			System.out.println("You are now guessing the letter  ");

			Scanner sc = new Scanner(System.in);
			char letter = sc.nextLine().charAt(0);
			// String inputLetter = Character.toString(letter);
			if (Character.isDigit(letter)) {
				System.out.println("Error:Please enter letter not digit:\n ");
			}

			// char letter = sc.next().charAt(0);
			boolean correctGuess = false;

			for (int i = 0; i < student.length(); i++) {

				if (student.charAt(i) == letter) {
					if (guessedLetter[i] == 0) {
						guessedLetter[i] = letter;
						numGuessLetters++;
						// System.out.println("The number of right guess is "+ numGuessLetters);
						correctGuess = true;
					}

				}
			}

			if (!correctGuess) {
				// int wrongGuess=0;
				points--;
				wrongGuess++;
				System.out.println("Number of Wrong guess is:: " + wrongGuess);

			}
			if (numGuessLetters == student.length()) {
//				System.out.println("congrats you guess the student name  " + student + " " + "correctly)");
//				// return;
				// flag = true;
				break;
			}
			// }
			System.out.print("Current guess is ");
			for (int i = 0; i < student.length(); i++) {
				if (guessedLetter[i] == 0) {
					System.out.print("-");

				} else {
					System.out.print(guessedLetter[i] + " ");
				}
			}
			System.out.println("\n \t Remaining Point is " + points);

		}
//int flag;
//		if (!flag) {
//			System.out.println("Sorry you lost the Game :the student name was:" + student);
//		}
		return points;
	}

	String checkigTheCorrectName() {

		for (int i = 0; i < student.length(); i++) {
			if (numGuessLetters == student.length()) {
				System.out.println("Congrats You WIN : you guess the student name  " + " " + "correctly)");
				// return;
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Sorry you lost the Game :the student name was:" + " ");
		}
		return student;
	}

}
