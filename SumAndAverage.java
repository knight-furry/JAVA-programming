class SumAndAverage
{
	public static void main(String args[])
	{
		int i = args.length;
		if (args.length == 0)
		System.out.println("Argument is expected...");
		else
		{
			int count1=0, count2=0;
			int oddsum = 0;
			int evensum = 0;
			int evenaverage = 0;
			int oddaverage = 0;
			for(int j = 0; j < i; j++)
			{
				if(Integer.parseInt(args[j]) % 2 == 0)
				{
					evensum += Integer.parseInt(args[j]);
					count1 += 1;
				}
				else
				{
					oddsum += Integer.parseInt(args[j]);
					count2 += 1;
				}
			}
			System.out.println("For EVEN numbers:\n" + "Even-sum: " + evensum +"\nEven-average: " + (evensum/count1));
			System.out.println("\nFor ODD numbers:\n" + "Odd-sum: " + oddsum +"\nOdd-average: " + (oddsum/count2));
		}
	}
}