class Wrapper
{
	public static void main(String args[])
	{
		// Xxx.ValueOf() is use to convert primitive to Object:
		int a = 100;
		Integer x = Integer.valueOf(a);
		System.out.println(x);
		byte b = 100;
		Byte y = Byte.valueOf(b);
		System.out.println(y);
		short c = 100;
		Short z = Short.valueOf(c);
		System.out.println(z);
		long d = 100;
		Long w = Long.valueOf(d);
		System.out.println(w);
		float e = 100.6f;
		Float zz = Float.valueOf(e);
		System.out.println(zz);		
		double f = 100;
		Double yy = Double.valueOf(f);
		System.out.println(yy);
		char cc = 'A';
		Character c1 = Character.valueOf(cc);
		System.out.println(c1);
		boolean bb = true;
		Boolean b1 = Boolean.valueOf(bb);
		System.out.println(b1);
		System.out.println();
		
		// Autoboxing
		char ch = 'a'; 
        Character as = ch;
		System.out.println(as);
		System.out.println();
		
		// Unboxing
		Character ch1 = 'a'; 
        char a1 = ch1; 
		System.out.println(a1);
		System.out.println();
		
		// Obj.xxxValue() method is used to convert Object to primitive:
		Byte x1 = 100;
		System.out.println(x1.byteValue());
		Short x2 = 100;
		System.out.println(x2.shortValue());
		Integer x3 = new Integer(100);
		System.out.println(x3.intValue());
		Long x4 = new Long(100);
		System.out.println(x4.longValue());
		Float x5 = new Float(100);
		System.out.println(x5.floatValue());
		Double x6 = new Double(100);
		System.out.println(x6.doubleValue());
		Boolean x7 = new Boolean(true);
		System.out.println(x7.booleanValue());
		Character x8 = 'A';
		System.out.println(x8.charValue());
		System.out.println();
		
		// Xxx.parseXxx() method is used to convert String to primitive datatypes:
		
		int i1 = Integer.parseInt("10"); 
        double d1 = Double.parseDouble("10.5"); 
        boolean b11 = Boolean.parseBoolean("true");
		int ii = Integer.parseInt("1000", 2); // Using base
        long ll = Long.parseLong("1111", 4); 
        System.out.println(ii); 
        System.out.println(ll);		
        System.out.println(i1); 
        System.out.println(d1); 
        System.out.println(b11);
		System.out.println();
		
		// Xxx.toString() method is used to convert wrapper class to string or primitive to string:
		
		Integer I = new Integer(10); 
        String s = I.toString(); 
        System.out.println(s);
		
		String s11 = Integer.toString(15, 2); 
        System.out.println(s11); 
        String s12 = Long.toString(11110000, 4); 
        System.out.println(s12); 
		System.out.println();
		
		
	}
}