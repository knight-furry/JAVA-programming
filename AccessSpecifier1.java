package as1;
import as.Parenta;

class Child1 extends as.Parenta
{
	public void fun()
	{
		System.out.println("This is another package child class...");
		System.out.println("b =" + b + " c =" + c);
	}	
}

class Others1
{
	public void fun()
	{
		System.out.println("This is another package with another class...");
		as.Parenta obj = new as.Parenta();
		System.out.println("b =" + obj.b);
	}
}

class AccessSpecifier1
{
	public static void main(String args[])
	{
		//For another package access specifier
		as1.Child1 c1 = new as1.Child1();
		c1.fun();


		//For another package access specifier
		as1.Others1 x = new as1.Others1();
		x.fun();
	}
}