import java.util.*;
class Areademo
{
	public static void main(String[] arg)
	{
		//Declaration of variable//
		double r;
		double area,circumference;
		
		//Scanner object to input the variable//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of radius :");
		r=sc.nextInt();
		
		//operation//
		area=3.14*(r*r);
		
		System.out.println("Area of circle is  : "+area);
		
		circumference=2*3.14*r;
		System.out.println("Area of circle is  : "+circumference);
		

		
	}
}