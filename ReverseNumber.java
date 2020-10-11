import java.util.*;

class ReverseNumber
{
	public static void main(String args[])
	{
		System.out.print("Plz enter any natural number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, rem;
		while(num != 0)
		{
			rem = num % 10;
			sum = rem + sum*10;
			num = num / 10;
		}
		
		System.out.println("The Reverse number is:");
		System.out.println(sum);
	}
}