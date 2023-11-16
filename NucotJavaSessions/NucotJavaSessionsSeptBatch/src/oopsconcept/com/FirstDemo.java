package oopsconcept.com;

public class FirstDemo {

	
	//gobal variables or class variables
	/*
	int a=10;
	char c='a';
	float f=12.0f;
	double d=1234.00;
	byte b=12;
	short ss=45;
	boolean flag=true;
	long l=123300000;
	String s="Nucot";
	
	*/
	
	
	//1.Normal methods
		//a)Method declaration
		//b)Method defination
	
	
	//a)Method declaration//method prototype
	/*
	 *   data_type method_name();
	 * 
	 * 	example: int add();
	 * 
	 * 
	 * 
	 */
	
	//b)Method defination
	/*
	 * 
	 * data_type method_name()
	 * {
	 * 
	 * 		statements
	 * 
	 * }
	 * 
	 * 
	 * 
	 * example:
	 * 
	 * int add()
	 * {
	 * 
	 * 			statements
	 * }
	 * 
	 * 
	 * 
	 * 
	 */
	
	//access_specifier
	//public
	//private
	//protect
	
	//access_specifier data_type method_name();
	 //public  void add();
	
	public void add123()
	{
		//local variables
		int i=20;
		int j=20;
		int sum=i+j;
		System.out.println(sum);
	}
	
	public void sub123()
	{
		//local variables
		int i=50;
		int j=20;
		int sub=i-j;
		System.out.println(sub);
	}
	
	
	public void mul123()
	{
		//local variables
		int i=50;
		int j=20;
		int mul=i*j;
		System.out.println(mul);
	}
	//entry point for the java compiler
	//always execution will begin here
	public static void main(String[] arags)
	{
		//we need to execute the method(add) ,we have create the object
		//and object is created always inside the main method
		//syntax to create object
		/*
		 * 
		 * class_name obj_name=new class_name();
		 * 
		 * 
		 */
		
		//creation of object
		FirstDemo obj=new FirstDemo();
		
		//to execute the method present inside the class 
		// object.method_name();
		
		obj.add123();
		obj.sub123();
		obj.mul123();
	
		
	}
	
	
	
	
	
	
	
	

}
