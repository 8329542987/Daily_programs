class Nestednorepeat
{
	public static void main(String[] arg)
	{
		int i,j,k=0;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				k++;
				System.out.print(k+"\t");
			}
		System.out.println();
		}
	}
}