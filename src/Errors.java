/**
 * Errors
  - Reading & Debugging
  - Run-time (logic) vs compile-time errors
 */

/**
 * @author Kyle
 */
public class errors {
	
	
	private static void scanNumber() {
		
		Scanner sc = new Scanner(System.in);
		Scanner s =  null;
		System.out.print("Please enter a number: ");
		
		System.out.println("You entered the number " + sc.nextInt());

		//sc = new Scanner("");
		//sc.next();
		
		// will you get a noSuchElementException if you're scanning from System.in?
		
	}
	
	private static void tipCalculator() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your subtotal: ");
		double subtotal = sc.nextDouble();
		
		System.out.print("Enter your tip percent as a whole number: ");
		int tipPercent = sc.nextInt();
		
		
		System.out.println("You should tip $" + subtotal * tipPercent);
		
		/*
		System.out.print("Did you tip more than this? (Enter yes/no): ");
		
		// what's going to happen when we get the next line?
		boolean tipMore = (sc.nextLine().equals("yes"));
		
		
		if(tipMore = true) {		// is this right?
			System.out.println("You are a good tipper");
		}
		
		*/
	}
	
	public static void main(String [] args) {
		
		// fix compiler errors first
		Scanner scnr = new Scanner("3 4 5")
				
	    // runtime errors with scanner
		//scanNumber();
		
		// logic errors with simple math example
		//tipCalculator();
		
	}

}
