package nucot.javasessions.com;

public class ConditionalStatementsDemo2 {

	public static void main(String[] args) {
		
	/*	
		boolean b=true;
		if(b)
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Bye");
		}
		
		int a=10;
		int bb=20;
		if(a==bb)
		{
			System.out.println("both equal");
			
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		
	*/	
		
		
		
		
		
		//3.if-else-if
		
		//syntax:
		
		/*
		 * if(condition)
		 * {
		 *--->statements
		 * }
		 * else if(condition)
		 * {
		 * --->statements
		 * }else if(condition)
		 * {
		 * --->statements
		 * }else if(condition)
		 * {
		 * --->statements
		 * }
		 * else
		 * {
		 * --->statements
		 * }
		 * 
		 */
		
		//to compare strings we have use .equal and compare other than string we use ==
		
		String browser="ie";
		
		if(browser.equals("chrome"))
		{
			System.out.println("Launch chrome Browser");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("Launch firefox Browser");
		}
		else if(browser.equals("ie"))
		{
			System.out.println("Launch ie Browser");
		}
		else if(browser.equals("safari"))
		{
			System.out.println("Launch safari Browser");
		}
		else
		{
			System.out.println("Plz pass the right browser name to luanch");
		}
		
		
		
		int a1=10;
		int a2=60;
		int a3=95;
		
		if(a1>=a2 && a1>=a3)
		{
			System.out.println("a1 is greater");
			
		}
		else if(a2>=a1 && a2>=a3)
		{
			System.out.println("a2 is greater");
			
		}
		else
		{
			System.out.println("a3 is greater");
			
		}
		
		
		
		char a11='a';
		char b11='z';
		char c11='c';
		
		if(a11>=b11 && a11>=c11)
		{
			System.out.println("a11 is greater");
			
		}
		else if(b11>=a11 && b11>=c11)
		{
			System.out.println("b11 is greater");
			
		}
		else
		{
			System.out.println("c11 is greater");
			
		}
		
		
		byte bb=10;
		byte bbb=5;
		byte bbbb=25;
		
		
		if(bb>=bbb && bb>=bbbb)
		{
			System.out.println("bb is greater");
			
		}
		else if(bbb>=bb && bbb>=bbbb)
		{
			System.out.println("bbb is greater");
			
		}
		else
		{
			System.out.println("bbbb is greater");
			
		}
		
		
		
		
		

	}

}
