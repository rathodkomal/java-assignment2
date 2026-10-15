package assignment2.java;
import java.util.Scanner;

public class Circle {
	    double r;

	    Circle(double r) {
	        this.r = r;
	    }

	    double area() {
	        return 3.14 * r * r;
	    }
	}

	class Cylinder extends Circle {
	    double h;

	    Cylinder(double r, double h) {
	        super(r);
	        this.h = h;
	    }

	    double cylinderArea() {
	        return 2 * 3.14 * r * (r + h);
	    }
	}

	class Test {
	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter radius: ");
	        double r = sc.nextDouble();

	        System.out.print("Enter height: ");
	        double h = sc.nextDouble();

	        Cylinder c = new Cylinder(r, h);

	        System.out.println("Circle Area = " + c.area());
	        System.out.println("Cylinder Area = " + c.cylinderArea());
	    }
	}


