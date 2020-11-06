package TechnOrbit;

class Techno
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
			int x = Integer.parseInt(args[0]);
			if(x%2 == 0)
			{
				System.out.println("The number is ODD...");
			}
			else
			{
				System.out.println("The number is EVEN...");
			}
		}
	}
}