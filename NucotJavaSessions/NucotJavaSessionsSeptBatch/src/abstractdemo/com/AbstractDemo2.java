package abstractdemo.com;


abstract class AA
{
	

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

class BB extends AA
{

	public  void sub()
	{
		int d=20;
		int e=10;
		int f=d-e;
		System.out.println(f);
	}
	
}


public class AbstractDemo2 {

	public static void main(String[] args) {
		BB obj=new BB();
		obj.add();
		obj.sub();
	}

}
