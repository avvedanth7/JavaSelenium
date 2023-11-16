package abstractdemo.com;

abstract class Phone {
	
	int a;
	final int b=20;
	
	public Phone()
	{
		System.out.println("this is constructor in abstract class");
	}
	

	void phoneList()
	{
		int totallist=200;
		System.out.println(totallist);
		System.out.println("List of iphone list");
	}

	abstract void contact();
	
}

class Iphone5s extends Phone
{
	
	void contact()
	{
		System.out.println("iphone 5s contactIcon");
	}
	
	
	
}

class Iphone15s extends Phone
{
	
	void contact()
	{
		System.out.println("iphone 15s contactIcon");
	}
		
	
	
	
}