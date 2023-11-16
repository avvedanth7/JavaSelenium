package constructordemo.com;

public class DemoOnConstructor {

	String name;
	int usn;
	int phoneNumber;
	String address;
	
	public void display()
	{
		System.out.println("this is display");
	}
	
	
	public DemoOnConstructor(String name) {
		this.name = name;
	}
	
	public DemoOnConstructor(String name, int usn) {
		
		this.name = name;
		this.usn = usn;
	}

	public DemoOnConstructor(String name, int usn, int phoneNumber) {
		this.name = name;
		this.usn = usn;
		this.phoneNumber = phoneNumber;
	}

	public DemoOnConstructor(String name, int usn, int phoneNumber, String address) {
		this.name = name;
		this.usn = usn;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public static void main(String[] args) {
		
		DemoOnConstructor obj=new DemoOnConstructor("nucot");
		System.out.println(obj.name);
		
		
		
		
	}

}
