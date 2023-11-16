package abstractdemo.com;

public class LoginPage extends Page{

	@Override
	public void titleOfThePage() {
		
		System.out.println("this is title of the page");
	}

	@Override
	public void currentUrl() {
		
		System.out.println("this is current url of the page");
	
	}
	
	
	public void loginBtn()
	{
		System.out.println("login in button");
	}
	
	
	

}
