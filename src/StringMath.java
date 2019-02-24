import java.util.Scanner;
/*
 * @author Ray
 */
public class StringMath {
	public static void main (String args[]) {
		//String immutability
		String myString = "Hello";
		myString.toUpperCase();
		System.out.println("First: " + myString);
		
		/*
		String string2 = new String("Hello");
		//equal?
		System.out.println("Are the strings equal?");
		System.out.println("String == is " + (myString == string2));
		System.out.println("String .equals() is " + myString.equals(string2));
		*/
		
		/*
		//Math methods
		int x = 5;
		int y = 5;
		
		System.out.println("x == y is " + (x == y));
		//System.out.println(x.equals(y));
		Integer z = 5;
		System.out.println("z.equals(y) is " + z.equals(y));
		*/
		
		/*
		//if we have time, the difference between static/non static
		//static examples
		foo(z); //calling directly
		Math.min(5, 10); //calling with a ClassName.methodName()
		
		//non static examples;
		Scanner scnr = new Scanner("Hello 123");
		String str1 = "something else";
		scnr.nextLine();
		str1.toUpperCase(); //what are the instances in these method calls?
		*/
		
	}
	public static int foo(int num) {
		return num;
	}
}
