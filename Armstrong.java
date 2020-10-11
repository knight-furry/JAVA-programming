class Armstrong
{
	public static void main(String args[])
	{
		int i,temp,count,sum,j;
	
		for(j=1;j<=1000;j++)
		{
			int x=j;
			int y=j;
			sum=0;
			count=0;
		
			while(y!=0)
			{
				count++;
				y=y/10;
			}
			while(x !=0)
			{
				temp=x%10;
				sum = sum + pow(temp,count);
				x=x/10;
			}
		
			if(sum==j)
			{
				System.out.println(j);
			}
		}

	}
	
	static int pow(int x, int y)
	{
		int res=1, i;
		for(i=y; i>0; i--)
		{
			res = res * x;
		}
		return(res);
	}
}