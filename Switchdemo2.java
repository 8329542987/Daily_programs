import java.util.*;

class Switchdemo2 
{
    public static void main(String[] args) 
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice:\n 1.Check Even or odd \n 2.Calculate Grade \n 3.Find out cube which divisible by 5 \n 4.Check which no. is greatest");
        choice = sc.nextInt();

        switch (choice) 
   	{
            case 1:
                int num;
                System.out.println("Enter a number:");
                num = sc.nextInt();
                if (num % 2 == 0) 
		{
                    System.out.println("Even number");
                } else 
		{
                    System.out.println("Odd number");
                }
                break;

            case 2:
                int m1, m2, m3, m4, m5, total;
                char grade;

                System.out.println("Enter the mark of m1:");
                m1 = sc.nextInt();
                System.out.println("Enter the mark of m2:");
                m2 = sc.nextInt();
                System.out.println("Enter the mark of m3:");
                m3 = sc.nextInt();
                System.out.println("Enter the mark of m4:");
                m4 = sc.nextInt();
                System.out.println("Enter the mark of m5:");
                m5 = sc.nextInt();

                if (m1 > 40 && m2 > 40 && m3 > 40 && m4 > 40 && m5 > 40) 
		{
                    total = m1 + m2 + m3 + m4 + m5;
                    if (total >= 250) 
		    {
                        grade = 'A';
                       System.out.println(grade);
                    } else if (total >= 150 && total < 250) 
		    {
                        grade = 'B';
                        System.out.println(grade);
                    } else 
		    {
                        System.out.println("Candidate failed");
                    }
                     
                }
		else 
		{
                    System.out.println("Candidate fail");
                }
                break;

            case 3:
                int numCube;
                System.out.println("Enter a number:");
                numCube = sc.nextInt();
                if (numCube % 5 == 0) 
		{
                    int cube = numCube * numCube * numCube;
                    System.out.println("The cube of number is: " + cube);
                } else 
		{
                    System.out.println("Number should be divisible by 5");
                }
                break;

            case 4:
                int n1, n2, n3;

                System.out.println("Enter the value of n1:");
                n1 = sc.nextInt();
                System.out.println("Enter the value of n2:");
                n2 = sc.nextInt();
                System.out.println("Enter the value of n3:");
                n3 = sc.nextInt();

                if (n1 > n2 && n1 > n3) 
		{
                    System.out.println("n1 is greater");
                } else if (n2 > n1 && n2 > n3) 
		{
                    System.out.println("n2 is greater");

                } else if (n3 > n1 && n3 > n2) 
		{
                    System.out.println("n3 is greater");
                } else {
                    System.out.println("Invalid number");
                }
              
                break;

            default:
                System.out.println("Please select a valid choice");
        }
    }
}
