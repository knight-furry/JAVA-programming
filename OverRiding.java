class Employee
{
	int salary = 30000;
	int calculateSalary()
	{
		return this.salary;
	}
}

class Manager extends Employee
{
	int calculateSalary()
	{
		return (this.salary + 5000);
	}	
}

class OverRiding
{
	public static void main(String args[])
	{
		Employee e =  new Employee();
		System.out.println("The salary of commen employee is: "+e.calculateSalary());
		Manager m =  new Manager();
		System.out.println("The salary of commen manager is: "+m.calculateSalary());
		Employee e1 = new Manager();
		System.out.println("The salary of commen manager is: "+e1.calculateSalary());
	}
}