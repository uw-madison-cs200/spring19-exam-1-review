/**
 * Branching / Conditionals
 */

/**
 * @author Yuan
 *
 */
public class Branching {
    public static void main (String[] args) {
        // Example 1 boolean variable
        boolean flag = false;
        System.out.println(flag);

        // Example 2 not operator
        boolean cool = false;
        System.out.println(!cool);
        System.out.println(cool == true);

        // Example 3 if-else
        boolean sunny = true;
        boolean warm = true;
        if (sunny && warm) {
            System.out.println("I am very happy");
        } else if (sunny) {
            System.out.println("I am OK");
        } else if (warm) {
            System.out.println("The weather is warm");
        } else {
            System.out.println("I am not happy");
        }

        // Example 4 short circuit
        boolean nice = true;
        int a = 2;
        if (nice || (a = 10) != 10) {
            System.out.println("TAs are nice");
        } else {
            System.out.println("TAs are bad");
        }
        System.out.println("a: " + a);

        // Example 5 short circuit
        nice = false;
        a = 2;
        if (nice || (a = 10) != 10) {
            System.out.println("TAs are nice");
        } else {
            System.out.println("TAs are bad");
        }
        System.out.println("a: " + a);

        // Example 6 switch
        int box = 2;
        switch (box) {
            case 0:
                System.out.println("have no box");
                break;
            case 1:
                System.out.println("have a box");
                break;
            case 2:
                System.out.println("have 2 boxes");
            case 3:
                System.out.println("have 3 boxes");
                break;
            default:
                System.out.println("A lot of boxes");
                break;
        }

        // Example 7 put all together
       int c = 10;
       String str = null;
       if (c == (c = c + 2) && str.equals("awesome")) {
           System.out.println("Both true!");
       } else {
           System.out.println("c " + c);
       }
    }
}
