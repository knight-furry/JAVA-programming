class PummyTummyMummy
{
	public static void main(String args[])
	{
		int x = 1;
		for (int i = 0; i < 10; i++)
		{
			for(int j = 1; j <= 11; j++)
			{
				if((x % 3 == 0) && (x % 5 == 0))
				{
					System.out.print("PummyTummy" + "\t");
				}
				else if(x % 3 == 0)
				{
					System.out.print("Tummy" + "\t");
				}
				else if(x % 5 == 0)
				{
					System.out.print("Pummy" + "\t");
				}
				else if(x % 7 == 0)
				{
					System.out.print("Mummy" + "\t");
				}
				else
				{
					System.out.print(x + "\t");
				}
				x++;
			}
			System.out.println();
		}
	}
}