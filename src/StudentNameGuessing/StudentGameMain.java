package StudentNameGuessing;

public class StudentGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String studentNames[]=
		// {"Aleena","Angel","Asha","Clemin","Gopesh","Hamneet","Jimna","Jobin","Jude","kamaldeep","Manpreets","Manpreetk","Mariya","Neela","Namitha","Nisha","Parminder","Rajat","Rojy","Sojan","Sucharita","Vindhuja"};

		System.out.println("Welcome to the Student Name Guessing Game ");
		System.out.println(" \n You have 5 points to win the Game :Good Luck ");
		StudentNameGuessingGame s1 = new StudentNameGuessingGame();
		s1.displayRandomName();

		System.out.println();
		int points = s1.startGuessingTheLetter();

		System.out.println("\n The available points  :" + points);

		String correctName = s1.checkigTheCorrectName();
		System.out.println("  \t \t   " + correctName);

	}

}
