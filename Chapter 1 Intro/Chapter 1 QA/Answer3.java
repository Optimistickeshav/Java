import java.util.Scanner;
//This imports the Scanner class from Java’s utility library.

public class Answer3 {
    public static void main(String args[]) {
        int m1, m2, m3, m4, m5, total;
        float percentage;

        Scanner sc = new Scanner(System.in);
// Now this is the line that creates the Scanner object.
//Scanner	The class name (tool for taking input)
//sc	Your object name (you can name it anything, like input, reader, or anythings.)
//new	Tells Java to create a new object
//Scanner(System.in)	Tells Scanner to read from the keyboard (called System Input)
//So this line creates a Scanner named sc that reads input from the keyboard.
        System.out.println("Enter marks of 5 subjects (out of 100):");
        System.out.print("Subject 1: ");
        m1 = sc.nextInt();
//By using Object sc, Read the next integer number entered by the user.
        System.out.print("Subject 2: ");
        m2 = sc.nextInt();
        System.out.print("Subject 3: ");
        m3 = sc.nextInt();
        System.out.print("Subject 4: ");
        m4 = sc.nextInt();
        System.out.print("Subject 5: ");
        m5 = sc.nextInt();

        total = m1 + m2 + m3 + m4 + m5;
        percentage = (total * 100.0f) / 500;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}
