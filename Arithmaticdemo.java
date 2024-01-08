import java.util.*;
class Arithmaticdemo
{
	public  static void main(String[] arg)
	{
		//declaration of variable
		int a,b;
		int r1,r2,r3,r4;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=s1.nextInt();		

		System.out.println("Enter the value of b :");
		b=s1.nextInt();
		
		// operation//
		r1=a+b;
		System.out.println("Addition is  : "+ r1);

		r2=a-b;
		System.out.println("Sub is :"+r2);
		

		r3=a/b;
		System.out.println("Division is :"+r3);
		
		r4=a%b;
		System.out.println(r4);

		
		
	}
}