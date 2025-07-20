import java.util.Scanner;
public class A02_Java_Instructions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number: ");
        //Type Declaration - here int a and b is declared that it is input through keyboard.
        int a = sc.nextInt();   // Read first number

        System.out.print("Enter second number: ");
        int b = sc.nextInt();   // Read second number

        //Arithmetic Declaration
        int sum = a + b;        // Add the numbers

        System.out.println("Sum = " + sum);  // Display result

        //-----------------

        char x = 'a', y = 'b' ;
        int z , a1, a2;
        z = x + y ;
        a1 = x;
        a2 = y;
        System.out.println("Z = " + a1);
        System.out.println("Z = " + a2);
        System.out.println("Z = " + z);
        //when we assign a char var containing any alphabet or special symbol, to an int var
        //then int var gives us the unicode value of that character.
        //--------------------

        double d ;
        d = Math.pow ( 3.0, 2.0 ) ;// 3*3*3
        System.out.println(d);


    }
}

//Control Declaration = to control the flow of program like, if-else
//Exceptional Handling = To handle situation of error during execution of program
//Advanced = Instructions for thread synchronization