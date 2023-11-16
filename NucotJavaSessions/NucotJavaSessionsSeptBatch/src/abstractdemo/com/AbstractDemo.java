package abstractdemo.com;

  public abstract class AbstractDemo {

	//1.Any class prefixed with abstract keyword is called abstract class
	//2.abstract class contains implemented methods and un-implemented
	//3.We cannot create object for abstract class
	//4.We create child class then we implement un-implemented methods then in will create obj for child class
	/*
	 * Example implemented--->method def
	 * 
	 * void add()
	 * {
	 * 
	 * }
	 * 
	 * 
	 */
	/*
	 * Example un-implemented--->method declar
	 * 
	 * abstract void add();
	 * 
	 * 
	 */
		//implemented method
		public void add()
		{
			
			int a=20;
			int b=30;
			int c=a+b;
			System.out.println(c);
			
		}
	
		//un-implemented method
		public abstract void sub();
	
}


class B extends AbstractDemo
{
	public  void sub()
	{
		int d=20;
		int e=10;
		int f=d-e;
		System.out.println(f);
	}
	
	
	public static void main(String[] args)
	{
		B obj=new B();
		obj.add();
		obj.sub();
		
		
		
		
	}
	
	
	
	
}



