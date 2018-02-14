import java.util.*;
public class Main
{
    public static void main (String arg[])
    {
Scanner scnr = new Scanner(System.in);
double lengthRectangle;
double widthRectangle;
double radius;
double sideA; // side A of the triangle
double sideB;
double sideC;
System.out.print( "Enter length of rectangle (positive integer): ");
lengthRectangle = scnr.nextDouble();
System.out.print( "Enter width of rectangle (positive integer): ");
widthRectangle = scnr.nextDouble();
System.out.print( "Now enter the radius of the circle (positive integer): ");
radius = scnr.nextDouble();
System.out.print( "Enter side A of triangle (positive integer): ");
sideA = scnr.nextDouble();
System.out.print( "Enter side B of triangle (positive integer): ");
sideB = scnr.nextDouble();
System.out.print( "Enter side C of triangle (positive integer): ");
sideC = scnr.nextDouble();

System.out.println("");

System.out.println ( "Area of rectangle: " + (lengthRectangle * widthRectangle));
System.out.println ( "Area of circle: " + ((radius * radius) * 3.14));
System.out.println ( "Perimeter of rectangle: " + (( 2 * lengthRectangle) + ( 2 * widthRectangle)));
System.out.println ( "Circumference of circle: " + (2 * 3.14 * radius));
double S = ( sideA + sideB + sideC ) / 2;
System.out.println ( "Area of triangle: " + (Math.sqrt( S * (S - sideA) * ( S - sideB) * ( S - sideC))));
System.out.println ( "Perimeter of triangle: " + ( sideA + sideB + sideC ));

System.out.println("");

double radiusSphere;
double diameterPrism;
double heightPrism;
double widthPrism;
double heightCylinder;
double radiusCylinder;

System.out.print( "Enter the radius of the sphere: ");
radiusSphere = scnr.nextDouble();
System.out.print( "Enter the diameter of the rectangular prism: ");
diameterPrism = scnr.nextDouble();
System.out.print( "Enter the height of the rectangular prism: ");
heightPrism = scnr.nextDouble();
System.out.print( "Enter the width of the rectangular prism: ");
widthPrism = scnr.nextDouble();
System.out.print( "Enter the height of the cylinder: ");
heightCylinder = scnr.nextDouble();
System.out.print( "Enter the radius of the cylinder: ");
radiusCylinder = scnr.nextDouble();

System.out.println("");

System.out.println( "The surface area of the sphere is: " + ( 4 * 3.14 * ( radiusSphere * radiusSphere )) );
System.out.println("The volume of the sphere is: " + ( (( radiusSphere * radiusSphere * radiusSphere ) / 3) * 4 * 3.14));
System.out.println("The surface area of the rectangular prism is: " + (2 * ((heightPrism * diameterPrism) + (heightPrism * widthPrism) + (diameterPrism * widthPrism))));
System.out.println("The volume of the rectangular prism is: " + (heightPrism * widthPrism * diameterPrism));
System.out.println("The surface area of the cylinder is: " + ((2 * 3.14 * radiusCylinder * heightCylinder) + (2 * 3.14 * (radiusCylinder * radiusCylinder))));
System.out.println("The volume of the cylinder is: " + (3.14 * (radiusCylinder * radiusCylinder) * heightCylinder));








    }
   }
