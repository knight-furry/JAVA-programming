import java.util.Scanner;
class NfiTQ_pallindrome
{
	static boolean pallindrome(int num)
	{
		int temp = num;
		int res = 0;
		while(temp != 0)
		{
			int digit = temp % 10;
			res = res * 10 + digit;
			temp = temp / 10;
		}
		if(num == res)
		return true;
		else
		return false;
	}
	
	static int getResult(int num)
	{
		int temp = num;
		int res = 0;
		while(temp != 0)
		{
			int digit = temp % 10;
			res = res * 10 + digit;
			temp = temp / 10;
		}
		
		int newNumber = num + res;
		if(pallindrome(newNumber))
		return newNumber;
		else
		{
			return getResult(newNumber);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = getResult(num);
		System.out.println(res);
	}
}