import java.util.Scanner;

abstract class Shape 
{
	abstract void area();

	void demo() 
	{
        	System.out.println("I am in Abstract class with a non-abstract method");
    	}
}

class Rectangle extends Shape 
{
	public void area() 
	{
        	int l, b;
        	double area;
        	Scanner sobj = new Scanner(System.in);
        	System.out.println("Enter length and breadth:");
        	l = sobj.nextInt();
        	b = sobj.nextInt();
        	area = l * b;
        	System.out.println("Area of rectangle: " + area);
    	}
}

class Square extends Shape 
{
	public void area() 
	{
        	int side;
        	double area;
        	Scanner mobj = new Scanner(System.in);
        	System.out.println("Enter side length:");
        	side = mobj.nextInt();
        	area = side * side;
        	System.out.println("Area of square: " + area);
    	}
}

class Triangle extends Shape 
{
	public void area() 
	{
        	double base, height;
        	double area;
        	Scanner obj = new Scanner(System.in);
        	System.out.println("Enter base:");
        	base = obj.nextInt();
        	System.out.println("Enter height:");
        	height = obj.nextInt();
        	area = 0.5 * base * height;
        	System.out.println("Area of triangle: " + area);
    	}
}

class Circle extends Shape 
{
	public void area() 
	{
        	double radius;
        	double area;
        	Scanner obj = new Scanner(System.in);
        	System.out.println("Enter radius:");
        	radius = obj.nextInt();
        	area = 3.14 * radius * radius; // Using 3.14 as an approximation of PI
        	System.out.println("Area of circle: " + area);
    	}
}

class Pentagon extends Shape 
{
	public void area() 
	{
        	double side;
        	double area;
        	Scanner obj = new Scanner(System.in);
        	System.out.println("Enter side length:");
        	side = obj.nextInt();
       		area = 1.72 * side * side; // Using approximation for pentagon area
        	System.out.println("Area of pentagon: " + area);
    	}
}

public class Abstractclass 
{
	public static void main(String[] arg) 
	{
       		Rectangle rect = new Rectangle();
        	System.out.println("Rectangle:");
        	rect.area();
	
	        Square square = new Square();
	        System.out.println("Square:");
	        square.area();
	
	        Triangle triangle = new Triangle();
	        System.out.println("Triangle:");
	        triangle.area();
	
	        Circle circle = new Circle();
	        System.out.println("Circle:");
	        circle.area();
	
	        Pentagon pentagon = new Pentagon();
	        System.out.println("Pentagon:");
	        pentagon.area();
	}
}
