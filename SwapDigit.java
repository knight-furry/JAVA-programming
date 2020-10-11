import java.util.*;

class SwapDigit
{
	public static void main(String args[])
	{
		System.out.print("Plz enter any natural number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, count = 0, temp, rem, x = 0;
		int m = 1, n = 1;
		temp = num;
		while(temp != 0)
		{
			count += 1;
			temp /= 10;
			m *= 10;
		}
		m /= 10;
		while(num != 0)
		{
			rem = num % 10;
			sum = sum + (m * rem);
			x = m*rem - rem;
			m = n * 10;
			n = n * 10;
			num /= 10;
		}
		
		System.out.println("The 1st and last digit swaped number is:");
		System.out.println(sum - x);
	}
}