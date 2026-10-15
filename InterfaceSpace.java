package assignment2;

public interface InterfaceSpace {
    interface Shape {
	        double area();
	    }

	    static class Circle implements Shape {
	        final double PI = 3.14;
	        double r;

	        Circle(double r) {
	            this.r = r;
	        }

	        public double area() {
	            return PI * r * r;
	        }
	    }

	    static class Sphere implements Shape {
	        final double PI = 3.14;
	        double r;

	        Sphere(double r) {
	            this.r = r;
	        }

	        public double area() {
	            return 4 * PI * r * r;
	        }
	    }

	    public static void main(String[] args) {

	        Circle c = new Circle(5);
	        Sphere s = new Sphere(5);

	        System.out.println("Circle Area = " + c.area());
	        System.out.println("Sphere Area = " + s.area());
	    }
	}


