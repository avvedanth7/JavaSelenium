package nucot.javasessions.com;

public class StringDemo {
	//String——Groups of characters or words enclosed 
	//within  double quotes—>”hdfghsdhfgf eegwhrgewhgr  jhjhrjg.   jhwejhwjrehtj” is called String
	
	
	
	public static void main(String[] args) {
		
		//declaration of the string
		//datatype variable_name;
		
		//inti of the string
		//datatype variable_name=value;
		
		String aa;//--->example declaration of the string
		aa="Nucot";//-->example inti of the string
		
		//String a="Nucot";//-->declaration and init
		
		
		
		String s="Prime";
		String ss="Electronics";
	
		//String concatenation-->+
		
		System.out.println("This is the value of s is -->"+s);
		
		System.out.println("The value of s and ss--->"+s+ss);
		
		//when ypu applying + operator betwwen two values the + oper will act as addition
		int a=1;
		int b=2;
		System.out.println(a+b);//12--> 3
		
	
		int aaa=11;
		int bbb=22;
		System.out.println("The values of a and b is-->"+aaa+bbb);//--->The values of a and b is-->1122
		System.out.println("The values of sum of a and b is-->"+(aaa+bbb));//The values of sum of a and b is-->33
		
		System.out.println(a+b+s+ss);//3PrimeElectronics
		System.out.println(s+ss+a+b);
		System.out.println(s+ss+(a+b));
		
		System.out.println(a+b+s+ss+a+b);
		
		System.out.println(a+b+s+ss+(a+b));
		
		
		System.out.println((a+b)+s+ss+(a+b));
		
		char c='s';
		System.out.println(c);
		char cc='A';
		System.out.println(cc);
		
		System.out.println(c+a+b);//115+1+2=118
		
		System.out.println(a+b+c);
		System.out.println(c+cc);
		
		
		double d=11.00;
		double dd=22.00;
		System.out.println(d+dd+a+b);
		
		System.out.println('a'+'b');
		System.out.println("a+b");
		
		System.out.println('&'+'a');
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
