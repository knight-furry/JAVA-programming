class Employee
{
	int salary = 30000;
	static String name = "Deepak";
	int calculateSalary()
	{
		return this.salary;
	}
	
	String showName()
	{
		return name;
	}
}

class Manager extends Employee
{
	String name = "Pradip";
	int calculateSalary()
	{
		return (salary + 5000);
	}

	String showName()
	{
		return this.name;
	}	
}

class OverRidingWithStatic
{
	public static void main(String args[])
	{
		Employee e =  new Employee();
		System.out.println("The salary of commen employee is: "+e.calculateSalary());
		System.out.println("The name of commen employee is: "+e.showName());
		Manager m =  new Manager();
		System.out.println("The salary of commen manager is: "+m.calculateSalary());
		System.out.println("The name of commen manager is: "+m.showName());
		Employee e1 = new Manager();
		System.out.println("The salary of commen manager is: "+e1.calculateSalary());
		System.out.println("The name of commen employee is: "+e1.showName());
	}
}