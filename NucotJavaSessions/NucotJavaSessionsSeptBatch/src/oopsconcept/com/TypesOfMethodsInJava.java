package oopsconcept.com;

public class TypesOfMethodsInJava {

	//Methods-->class members
	
	
	//1.No put and No return Type
	//syntax
	/*
	 *-->No return Type--->void--this method or function will not return anything
	 * datatype method_name()
	 * {
	 * 		body
	 * }
	 * 
	 * 
	 * 
	 */
	//example:
	
	void test(){
		System.out.println("No input and no return type");
	}
	
	void add()
	{	//local variables
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);	
	}
	
	void mul()
	{	//local variables
		int a=10;
		int b=20;
		int prod=a*b;
		System.out.println(prod);	
	}
	
	
	void loginPage()
	{
		System.out.println("This is login in method");
		
	}
	
	//2.No input but return something
	
	/*
	 *  *-->return Type--->Other than void --this method or function will  return something
	 * 
	 * 
	 * datatype method_name()
	 * {
	 * 		body
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	//Example:
	 public int calTax(){
		 int i=10;
		 int tax=6;
		 int finalAmount=i+tax;
		 return finalAmount; 	 
	 }
	
	
	public String nameOfTheTrainer(){
		System.out.println("Name of the Trainer");
		String name="Nucot";
		return name;	
	}
	
	
	
	//3.There is input but no return type
	
		/*
		 *  *--> No return Type---> void -this method or function will not return anything
		 * 
		 * 
		 * datatype method_name(datatype value)
		 * {
		 * 		body
		 * }
		 * 
		 * 
		 */
	
	//example:
	
	void sub(int aa,int bb)
	{
		int subValue=aa-bb;
		System.out.println(subValue);
		
	}
	
	//4.There is input and  return type
	
			/*
			 *  
			 * 
			 * 
			 * datatype method_name(datatype value)
			 * {
			 * 		body
			 * }
			 * 
			 * 
			 */
		
		//example:
	
	
	
	public int multiplication(int c,int d)
	{
		int product=c*d;
		return product;
		
	}
	


	public static void main(String[] args) {
		
		//syntax for creating obj
		TypesOfMethodsInJava obj=new TypesOfMethodsInJava();
		
		System.out.println("**********1.No input and no return type************");
		obj.test();//calling to the method
		obj.add();
		obj.mul();
		obj.loginPage();
		
		System.out.println("***********2.No input and  return something**********");
		int val=obj.calTax();
		System.out.println(val);
		int aa=val+10;
		System.out.println(aa);
		
		String trainerValue=obj.nameOfTheTrainer();
		System.out.println(trainerValue);
		String finalval=trainerValue+"Company";
		System.out.println(finalval);
		
		
		System.out.println("*******3.There is input but no return type*************");
		obj.sub(10,5);
		
		System.out.println("*******4.There is input and return type*************");
		
		int mulValue=obj.multiplication(5,5);
		System.out.println(mulValue);
		

		

	}

}
