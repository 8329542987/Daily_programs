import java.util.*;
class Profitdemo2
{
	public static void main(String[] arg)
	{
		//declaration of variable //
		int sell,cost,profit;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Selling price :");
		sell=sc.nextInt();
		System.out.println("Enter the cost Price :");
		cost=sc.nextInt();
		
		//operation  //
		profit=sell-cost;
		System.out.println("Profit :"+profit);
		
	}
}