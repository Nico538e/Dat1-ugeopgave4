import java.util.Scanner;

class Main{
	public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);


	System.out.println("Please type your name");

	String input = scanner.nextLine();

	System.out.println("Hello " + input + ", please type your age");

	int ageInput = scanner.nextInt();

	System.out.println("You are " + ageInput + " years old!");

	int retirementAge = 67;

	int numberOfYearsToRetire = retirementAge - ageInput;

	System.out.println("You will retire in " + numberOfYearsToRetire + " years");



    }

}