/**
 * Primitives and Wrappers
 *  - Primitives vs Reference
 *  - Memory diagram
 *  - Autoboxing / Autounboxing
 *
 * @author Jack
 */

import java.util.Random;
import java.util.Scanner;

public class PrimitivesAndWrappers {

    public static void main(String[] args) {

	//example1();
	//example2();
	//example3();

    }

    public static void example1(){

	System.out.println("Example 1:");
	
	int temp = 100;
	Integer midtermGrade = temp; //autoboxing (?)
	Integer anotherMidtermGrade = midtermGrade; //autoboxing (?)
	
	System.out.println(midtermGrade == anotherMidtermGrade); //autounboxing (?)
	midtermGrade = 95;
	System.out.println(midtermGrade == anotherMidtermGrade);
	
    }

    public static void example2(){

	//Whats the difference?
	String helloWorld = "Hello world"; //autoboxing (?)
	String helloWorld2 = new String("Hello world");

	Scanner myScanner = new Scanner(System.in);
	System.out.println("Enter a character: ");
	char userInput = myScanner.nextLine().charAt(0);

	//Why are wrapper classes helpful?

	//Method 1
	boolean isADigit = false;

	switch (userInput) {
	case '0':
	    isADigit = true;
	    break;
	case '1':
	    isADigit = true;
	    break;
	case '2':
	    isADigit = true;
	    break;
	case '3':
	    isADigit = true;
	    break;
	case '4':
	    isADigit = true;
	    break;
	case '5':
	    isADigit = true;
	    break;
	case '6':
	    isADigit = true;
	    break;
	case '7':
	    isADigit = true;
	    break;
	case '8':
	    isADigit = true;
	    break;
	case '9':
	    isADigit = true;
	    break;
	}
	System.out.println("Digit: " + isADigit);


	//versus:
	isADigit = false;
	Character myChar = userInput; //autoboxing
	isADigit = Character.isDigit(myChar); 
	System.out.println("Digit: " + isADigit);

	//or:
	System.out.println("Digit: " + Character.isDigit(userInput));
	
    }

    public static void example3(){

	System.out.println("Example 3:");

	//Challenging!
	Random rand1 = new Random(100);
	for(int i = 0; i < 10; i++){
	    System.out.print(rand1.nextInt(10) + " ");
	}
	System.out.println();

	Random rand2 = new Random(100);
	Random rand3 = rand2;
	for(int i = 0; i < 5; i++){
	    System.out.print(rand2.nextInt(10) + " ");
	}
	for(int i = 0; i < 5; i++){
	    System.out.print(rand3.nextInt(10) + " ");
	}
	System.out.println();
	
    }


}
