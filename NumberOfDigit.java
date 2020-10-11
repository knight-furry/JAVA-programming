import java.util.*;

class NumberOfDigit
{
	public static void main(String args[])
	{
		System.out.print("Plz enter any natural number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		while(num != 0)
		{
			count += 1;
			num = num / 10;
		}
		
		System.out.println("The Total numbers of digits are: ");
		System.out.println(count);
	}
}