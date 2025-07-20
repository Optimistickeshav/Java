import java.lang.*;
//it is a General and Java's Default library, for all, it includes -
//System.out.println(), String[] args and Integer.parseInt .

public class A01_inputs {
        public static void main (String[] args)
        {
            int n, a, b, c;
            a = Integer.parseInt ( args[ 0 ] ) ;//java.lang.* package used for this.
            b = Integer.parseInt ( args[ 1 ] ) ;//java.lang.* package used for this.
            c = Integer.parseInt ( args[ 2 ] ) ;//java.lang.* package used for this.
            n = a+b+c;
            System.out.println ( "Sum of 3 Digits are = " + n ) ;
        }

}
//Another way to Enter a Number is using (String[] args)
/*
* Every software have his own Command Line Arguments to insert input manually.
*
* To use Software's Command Line Argument
* 1. ALT+SHIFT+F10
* 2. Select 0(Edit Configuration)
* 3. In [Program Arguments], write your values using space, if string, use double quotes.
* 4. this will take all inputs as String we, have to convert them using Integer.parseInt(args[0])
*
* */