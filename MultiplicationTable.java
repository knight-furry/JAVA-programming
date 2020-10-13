class MultiplicationTable
{
	public static void main(String args[])
	{
		if (args.length == 0)
		System.out.println("Argument is expected...");
		else if(args.length > 1)			
		{
			System.out.println("Invalid input argument...");
		}
		else
		{
			int num = Integer.parseInt(args[0]);
			for(int i = 1; i <= num; i++)
			{
				for(int j = 1; j <= 10; j++)
				{
					System.out.print((j*i) + "\t");
				}
				System.out.println();
			}
			
		}
	}
}