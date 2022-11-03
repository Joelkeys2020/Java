package coursework;
import java.util.Scanner;

public class Coursework {
	public static void main (String[]args) {
		System.out.println("Welcome to Java ");
		Scanner keyboardInput = new Scanner(System.in); //Initializing the Scanner variable
		System.out.println("Java would like to know your name, Please:");
		String username = keyboardInput.nextLine();
		System.out.println("Hello " + username + "\nYour name is " + username.length() + " letters long.\n" );
		
		System.out.println("Java can do a lot of Things.");
		System.out.println("Like for example,It has Just told you the number of Letters in Your First name.");
		System.out.println("Let's check out other features through some few Questions from Java Himself:\n ");
		
		System.out.println("In which year were you born?");
		Scanner scanner = new Scanner(System.in);
		int Year= scanner.nextInt();
		int Age = 2022 - Year;
		System.out.println("\nWow! That makes you " + Age + " Years old.");
		
		System.out.println("How many marks did you get in Maths?:");
		int maths= scanner.nextInt();
		System.out.println("Nice.How about English?:");
		int eng= scanner.nextInt();
		System.out.println("Great! And Social Studies?:");
		int sst= scanner.nextInt();
		System.out.println("Sweet! What of Science?:");
		int sci= scanner.nextInt();
		int total = maths+eng+sci+sst;
		int average = ((total)/4);
		System.out.println("So your average mark is:" + average );
		System.out.println("Your Total mark is:" + total );
		System.out.println("Let's do one more thing. pick a very big number:");
		int num1 = scanner.nextInt();
		System.out.println("That's Huge! Pick another Huge number:");
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		int diff = num1 - num2;
		int pdt = num1 * num2;
		int rem = num1 % num2;
		System.out.println("If I multiply these numbers i get: " + pdt);
		System.out.println("If I add these numbers i get: " + sum);
		System.out.println("If I subtract the second number from the first numbers i get: " + diff);
		System.out.println("If I divide the first number by the second number, i get a remainder of:" + rem);
		
		System.out.println("\nIt's been a pleasure touring with you " + username + ". Feel free to come and learn more fun things that Java can do. Goodbye!");
		
	}
}
