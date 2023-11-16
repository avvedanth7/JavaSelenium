package abstractdemo.com;

public abstract class Page {
	//cannot create the object for abstract class
	
	public void companyLogo()
	{
		System.out.println("This is the logo of the company");
	
	}
	
	public abstract void titleOfThePage();
	
	public abstract void currentUrl();

}
