// Calculation of simple interest
package siusingcmdlineargs ;
import java.lang.* ;
public class test2{
    public static void main ( String[ ] args )
    {
        float p, r, si ;
        int n ;
        p = Float.parseFloat ( args[ 0 ] ) ;
        n = Integer.parseInt ( args[ 1 ] ) ;
        r = Float.parseFloat ( args[ 2 ] ) ;
        si = p * n * r / 100 ;
        System.out.println ( "Simple interest = Rs. " + si ) ;
    }
}

//CLI Arguments - Modify run configuration