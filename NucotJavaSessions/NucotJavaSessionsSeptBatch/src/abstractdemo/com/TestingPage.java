package abstractdemo.com;

public class TestingPage {

	public static void main(String[] args) {
		//Page obj=new Page();
		
		//creating  object for child class
		LoginPage obj=new LoginPage();
		
		//abstract class method or parent class method
		obj.companyLogo();
		
		//child class methods--override methods
		obj.currentUrl();
		
		obj.titleOfThePage();
		//child class dependent method
		obj.loginBtn();
		
		
		//topcasting
		//child class object be referred by the parent abstract ref obj
		Page obj1=new LoginPage();
		obj1.companyLogo();
		obj1.currentUrl();
		obj1.titleOfThePage();
		//child class dependent method
		//obj1.loginBtn();
		
	}

}
