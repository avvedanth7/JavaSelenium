package polymorphismdemo.com;

public class TestDemo {

	
	public static void test()
	{
		System.out.println("This test method");
	}
	
	public static void test(int i)
	{
		System.out.println("This test method"+i);
		
	}
	
	public static void test(int j,int a)
	{
		System.out.println("This test method"+j);
		System.out.println("This test method"+a);
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		TestDemo obj=new TestDemo();
		obj.test();
		obj.test(10);
		obj.test(10,20);
		
		
		
		
	}

}
