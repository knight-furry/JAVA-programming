import java.util.*;

class BankAccount
{
	private String accountnum;
	private double balance;
	
	public BankAccount()
	{
		accountnum = "0000";
		balance = 0000;
	}
	
	public BankAccount(String accnum, double bal)
	{
		accountnum = accnum;
		balance = bal;
	}
	
	public void deposit(double amount)
	{
		balance = balance + amount; 
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	public double getbalance()
	{
		return(balance);
	}
	
	public String getaccountnum()
	{
		return(accountnum);
	}
}

class Bank
{
	public static void main(String args[])
	{
		int choice;
		System.out.println("\n=============================== BANK-OF-TECHNORBIT ===============================\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("To create an account please enter any number: ");
		String accnum = sc.nextLine();
		System.out.print("Enter your initail Bank Balance: ");
		double bal = sc.nextDouble();
		BankAccount a = new BankAccount(accnum, bal);
		do
		{
			System.out.println("1. Deposit amount\n2. Cash withdraw\n3. Check Balance\n0. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Please enter amount to deposit: ");
					double bal1 = sc.nextDouble();
					a.deposit(bal1);
					break;
				case 2:
					System.out.print("Please enter amount to withdraw: ");
					double bal2 = sc.nextDouble();
					a.withdraw(bal2);
					break;
				case 3:
					System.out.println("Your Account number is: " + a.getaccountnum());
					System.out.println("Your Account number is: " + a.getbalance());
					break;
			}
		}while(choice != 0);
	}
}