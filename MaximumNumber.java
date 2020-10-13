class MaximumNumber
{
	public static void main(String args[])
	{
		int i = args.length;
		if (args.length == 0)
		System.out.println("Argument is expected...");
		else
		{
			int max = Integer.parseInt(args[0]);
			for(int j = 0; j < i; j++)
			{
				if(max < Integer.parseInt(args[j]))
				{
					max = Integer.parseInt(args[j]);
				}
			}
		System.out.println(max);
		}
	}
}