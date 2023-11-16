package inheritancedemo.com;

public class BMW  extends Car{
	
	@Override
	public void start()
	{
		System.out.println("this is start in BMW");
		
	}
	
	public void autoParking()
	{
		System.out.println("this is autoParking in BMW");
		
	}
	
	
}
