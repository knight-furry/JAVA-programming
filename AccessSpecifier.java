package as;
class Parent
{
	private int a = 10;
	public int b = 20;
	protected int c = 30;
	int d = 40;
	public void fun()
	{
		System.out.println("This is parent class...");
		System.out.println("a =" + a + " b =" + b + " c =" + c + " d =" + d );
	}
}

class Child extends Parent
{
	public void fun()
	{
		System.out.println("This is child class...");
		System.out.println("b =" + b + " c =" + c + " d =" + d );
	}	
}

class Others
{
	public void fun()
	{
		System.out.println("This is Other class...");
		Parent p = new Parent();
		System.out.println("b =" + p.b + " c =" + p.c + " d =" + p.d );
	}
}

class AccessSpecifier
{
	public static void main(String args[])
	{
		//parent class access specifier
		Parent p = new Parent();
		p.fun();

		//child class access specifier
		Child c = new Child();
		c.fun();

		//Other class access specifier
		Others o = new Others();
		o.fun();
	}
}