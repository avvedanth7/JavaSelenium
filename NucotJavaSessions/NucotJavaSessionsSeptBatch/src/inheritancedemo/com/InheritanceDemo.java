package inheritancedemo.com;


class A
{
	
	
	
	
	 public void test1()
	 {
		 System.out.println("This is test1 in parent");
	 }
	
	 public void test2()
	 {
		 System.out.println("This is test2 in parent");
	 }
	
	 public void test3()
	 {
		 System.out.println("This is test3 in parent");
		 
	 }
		
}

//syntax to create child class
/*
 * class child_class_name extends parent_class_name
 * {
 * 
 * }
 * 
 * 
 * 
 */

class B extends A
{
	
	//method overriding
	//When you have a method in parent class and same method in the child class
	//with the same name
	//with the same number of parameters
	//with the same return 
	@Override
	public void test1()
	 {
		 System.out.println("This is test1 in child");
		 
	 }
	
	
	public void show()
	{
		System.out.println("this is show in the child");
	}
	

}


public class InheritanceDemo {

	public static void main(String[] args) {
		
//		A obj=new A();
//		obj.test1();
//		obj.test2();
//		obj.test3();
//		
//		//obj.show();
//		
		
		
		
		B obj1=new B();
		
		obj1.test1();
		obj1.test2();
		obj1.test3();
		obj1.show();
		
		

	}

}
