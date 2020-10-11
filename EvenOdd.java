import java.util.*;

class EvenOdd
{
	public static void main(String args[])
	{
		System.out.println("Plz enter any natural number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0)
		{
			System.out.println("The number is EVEN..");
		}
		else
		{
			System.out.println("The number is ODD..");
		}
	}
}