import java.util.Scanner;

public class SphereVolume 
{ 
public static void main(String[] args) 
{ 
	System.out.println("Prints volume of sphere given diameter input.\n");
	System.out.println("What is the diameter of your sphere?");
	Scanner myScanner = new Scanner(System.in);
	double diam = myScanner.nextDouble();
	double radius = diam/2;
	double volume = (4d/3d)*Math.PI*Math.pow(radius, 3);
	
	System.out.println("The volume of a sphere with diameter " + diam + " is " + volume);
	
	myScanner.close();
} 
} 
