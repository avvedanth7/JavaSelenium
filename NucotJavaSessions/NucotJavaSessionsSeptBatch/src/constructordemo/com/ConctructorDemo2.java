package constructordemo.com;

public class ConctructorDemo2 {

	String name;
	int ssn;
	int age;
	
	ConctructorDemo2(String n,int s,int a)
	{
		
		name=n;
		age=a;
		ssn=s;
		
		//-->this.age-->it will refer to class variable
		
		//normal--> local variable
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		ConctructorDemo2 obj1=new ConctructorDemo2("nucot",10,20);
		//obj1.age;
		System.out.println( obj1.name+":-->"+obj1.ssn+":-->"+":-->"+obj1.age);
		
		
	}

}
