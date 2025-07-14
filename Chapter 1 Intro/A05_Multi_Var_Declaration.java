public class A05_Multi_Var_Declaration {
    public static void main(String[] args) {
        int x = 5, y = 6, z = 50;
        //Declare Multiple Vars in single line.
        //x = y = z = 50;s
        System.out.println(x + y + z);
    }
}
// Variables ka jo hum naam rkhte hai, wo Unique hona chahiye
// Var. ka naamkaran with Unique and logical name is called - Identifiers
// x,y,z ki jagah we have to use, name, age, gender, no_of_cars, this way...
// int drivingspeed = 80; this is good approach
// OK, but not so easy to understand what ds actually is
// int ds = 80;

/*
* The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter, and cannot contain whitespace
Names can also begin with $ and _
Names are case-sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names
* */