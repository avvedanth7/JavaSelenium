package polymorphismdemo.com;

public class PolymorphismDemo {
	//One of the OOps concept in java
	//poly--many
    //morphism--ways
	
	//Two types of Polymorphism
	//1.Compile time Polymorphism(static)-->Method overloading
	//2.Run time Polymorphism(dynamic)-->Method overriding
	
	
	//1.Compile time Polymorphism(static)
	//Example-->Method overloading
	
	//1.with in the class,if you have mutiple methods
	//a.method name should be always same 
	//b.with the different parameters
	//c.with different number of parameters
	//d.with different order of parameters
	
	
	void show(int jj)
	{
		
	}
	
	void area(int r)
	{
		System.out.println("this is area of the circle");
		
	}
	
	void area(String s)
	{
		System.out.println("this is string");
	}
	
	void area(int l,int w)
	{
		System.out.println("this is area of the triangle");
		
	}
	
	void area(int l,String ss)
	{
		System.out.println("this is area of the triangle");
		
	}
	void area(String sss,int a)
	{
		System.out.println("this is area of the triangle");
		
	}
	
	void area(int h,int w,int total)
	{
		System.out.println("this is area of the rectangle");
	}
	
	void area(int a,int b,int c,int d)
	{
		System.out.println("this is area of the room");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
