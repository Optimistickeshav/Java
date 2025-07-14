public class A03_Variables {
    public static void main(String[] args) {
        final int x = 855;
        System.out.println(x);
        //x = 65;
        //System.out.println(x);
        //int ax = 60; // will generate an error
        //System.out.println(x +" "+ ax);
    }

}

// - If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only)
/*
How to Declare a Var.

* int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
*
* */