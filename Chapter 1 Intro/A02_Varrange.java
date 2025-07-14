//Variable Range.
public class A02_Varrange {
    public static void main(String[] args){
    System.out.println("Byte Range");
    byte a = 127;
    System.out.println("Current byte Value " + a);
    System.out.println("Min byte Value " + Byte.MIN_VALUE);
    System.out.println("Max byte Value " + Byte.MAX_VALUE);

/*
* Elaborating things in Vars_and_Datatypes.txt
*
* long b = 9223372036854775807;
* compiler takes this as int even if we already have defined long in the declaration
* so, to get rid of this, write it like
* long b = 9223372036854775807l;
* l at the end.
* */


    }
}
