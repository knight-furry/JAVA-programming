import java.util.Scanner;

class Mobile
{
	void insertSIM(SIM s)
	{
		System.out.println("SIM inserted successfully");
		s.calling();
		s.sms();
	}
}

interface SIM
{
	void calling();
	void sms();
}

class Airtel implements SIM
{
	public void calling()
	{
		System.out.println("Airtel calling..");
	}
	public void sms()
	{
		System.out.println("Airtel sms..");
	}
}

class Bsnl implements SIM
{
	public void calling()
	{
		System.out.println("BSNL calling..");
	}
	public void sms()
	{
		System.out.println("BSNL sms..");
	}
}

class Jio implements SIM
{
	public void calling()
	{
		System.out.println("Jio calling..");
	}
	public void sms()
	{
		System.out.println("Jio sms..");
	}
}

class Idea implements SIM
{
	public void calling()
	{
		System.out.println("Idea calling..");
	}
	public void sms()
	{
		System.out.println("Idea sms..");
	}
}

class MobileUser
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		Mobile redmi = new Mobile();
		do
		{
			System.out.println("Please insert the SIM from following options:");
			System.out.println("1. Airtel SIM\n2. BSNL SIM \n3. JIO SIM \n4. Idea SIM\n5. EXIT");
			System.out.print("Enter your choice:");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					redmi.insertSIM(new Airtel());
					break;
				case 2:
					redmi.insertSIM(new Bsnl());
					break;
				case 3:
					redmi.insertSIM(new Jio());
					break;
				case 4:
					redmi.insertSIM(new Idea());
					break;
				default:
					System.out.println("Invalid choice...");
			}
		}while(choice != 5);
	}
}