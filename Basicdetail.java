import java.util.*;
class Basicdetail
{
	public static void main(String[] arg)
	{

		//declaration  of variable//
		
		String fname ,lname,city ;
		int age;
		char gender;

		Scanner sc=new Scanner(System.in);		
		
		System.out.println("Enter the first  name :");
		fname=sc.nextLine();
		
		System.out.println("Enter the last name :");
		lname=sc.nextLine();
		
		System.out.println("Enter the city :");
		city=sc.nextLine();
		
		System.out.println("Enter the age :");
		age=sc.nextInt();

		System.out.println("Enter gender");
		gender=sc.next().charAt(0);

		//Display all the details //
		System.out.println("First Name :"+fname);
		System.out.println("Last Name :"+lname);
		System.out.println("City :"+city);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
		
		
		
		
		
		
	}
}