class LightBill
{
	public static void main(String args[])
	{
		int temp, sum = 0;
		if(args.length == 0)
		{
			System.out.println("Argument required...");
		}
		else
		{
			int n = Integer.parseInt(args[0]);
			if(n < 100)
			{
				sum = n * 2;
			}
			else
			{
			
			while(n > 0)
			{
				temp = n % 100;
				if(n > 0 && n <= 100)
				{
					sum += ((temp+100)*2);
				}
				else if(n > 100 && n <= 200)
				{
					sum += ((temp+100)*3);
				}
				else if(n > 200 && n <= 300)
				{
					sum += ((temp+100)*5);
				}
				else if(n > 300 && n <= 500)
				{
					sum += ((temp+100)*10);
				}
				else
				{
					sum += ((temp+100)*20)
				}
				n = n - (100+temp);
			}
			}
			System.out.println("The total amount of bill is: " + (sum+150) + "\n\nUDHARI BAND ahe..");
		}
	}
}