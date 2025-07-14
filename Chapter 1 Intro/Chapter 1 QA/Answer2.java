public class Answer2 {
    public static void main(String args[]) {
        double km = 5.0; // Assume a suitable value
        double meters, centimeters, feet, inches;

        //1km = 1000mtr
        meters = km * 1000;
        //1km = 100000cm
        centimeters = km * 100000;
        //1km = 3280.84ft
        feet = km * 3280.84;
        //1km = 39370.1 inch
        inches = km * 39370.1;

        System.out.println("Distance in kilometers: " + km + " km");
        System.out.println("In meters       : " + meters + " m");
        System.out.println("In centimeters  : " + centimeters + " cm");
        System.out.println("In feet         : " + feet + " ft");
        System.out.println("In inches       : " + inches + " in");
    }
}