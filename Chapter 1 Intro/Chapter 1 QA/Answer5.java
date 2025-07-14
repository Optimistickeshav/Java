public class Answer5 {
    public static void main(String args[]) {
        // Rectangle values
        double length = 10.0;   // in units
        double breadth = 5.0;   // in units

        // Circle value
        double radius = 7.0;    // in units

        // Rectangle calculations
        double rectArea = length * breadth;
        double rectPerimeter = 2 * (length + breadth);

        // Circle calculations
        double circleArea = 3.1416 * radius * radius; // πr²
        double circleCircumference = 2 * 3.1416 * radius; // 2πr

        // Output
        System.out.println("Rectangle:");
        System.out.println("Length = " + length + ", Breadth = " + breadth);
        System.out.println("Area = " + rectArea);
        System.out.println("Perimeter = " + rectPerimeter);

        System.out.println();

        System.out.println("Circle:");
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + circleArea);
        System.out.println("Circumference = " + circleCircumference);
    }
}
