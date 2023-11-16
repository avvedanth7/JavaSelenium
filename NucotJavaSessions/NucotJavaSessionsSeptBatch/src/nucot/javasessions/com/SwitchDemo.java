package nucot.javasessions.com;

public class SwitchDemo {

	public static void main(String[] args) {
		
		//4.switch statement
		//syntax
		/*
		 * switch(expression)
		 * {
		 * 
		 * 		case 1:
		 *		-->statements
		 *		break;
		 * 
		 * 		case 2:
		 *		-->statements
		 *		break;
		 *		
		 *		case 3:
		 *		-->statements
		 *		break;
		 *
		 *		case 4:
		 *		-->statements
		 *		break;
		 *
		 *
		 *		default:
		 *		break;
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	/*	String browser="firefox";
		
		switch(browser)
		{
		
			case "chrome":
				System.out.println("Open chrome browser");
				break;
			
			case "ie":
				System.out.println("Open ie browser");
				break;
			
			case "firefox":
				System.out.println("Open firefox browser");
				break;
			
			case "safari":
				System.out.println("Open safari browser");
				break;
				
				
			default:
				System.out.println("Please Pass the right browser name to open");
				break;
			
		}
		
		System.out.println("Thanks");
		
	*/	
		
		int day=5;
		
		switch(day)
		{
		
			case 1:
				System.out.println("sunday");
				break;
			
			case 2:
				System.out.println("monday");
				break;
			
			case 3:
				System.out.println("tuesday");
				break;
			
			case 4:
				System.out.println("wednesday");
				break;
			case 5:
				System.out.println("thursday");
				break;
			case 6:
				System.out.println("firday");
				break;
			case 7:
				System.out.println("saturday");
				break;
				
			default:
				System.out.println("Please Pass the vaild day");
				break;
			
		}
		
		System.out.println("Thanks");
		
		
		
		String courses="BE";
		
		
		switch(courses)
		{
		
			case "BE":
				System.out.print("BE");
				System.out.print("Hi");
				System.out.print("Hello");
				System.out.print("Say");
				break;
			
			case "Bsc":
				System.out.println("Bsc");
				break;
			
			case "Bcom":
				System.out.println("Bcom");
				break;
			
			case "BBM":
				System.out.println("BBm");
				break;
				
				
			default:
				System.out.println("Please Pass the right course name");
				break;
			
		}
		
		System.out.println("Thanks");
		
		
		
		
		
		
		
		

	}

}
