package nucot.javasessions.com;

public class IncrementAndDecrementDemo {

	public static void main(String[] args) {
		
		//++ ,--
		//++  -->Increment
		//--  -->decrement 
		
		//-->Post increment-->a++
		//-->Pre increment-->++a
		
		//-->Post decrement-->a--
		//-->Pre decrement-->--a
		
		
		//1.Post -->
		//syntax-->variable operator
		
		//2.Pre-->
		//syntax--> operator variable
		
		
		//1.Post Increment-->
		//syntax-->variable operator
			//example-->a++
		
		int a=1;
		int b=a++;
		
		System.out.println(a);//2
		
		System.out.println(b);//1
		
		
		
		int aa=3;
		int bb=aa++;
		
		System.out.println(aa);//2
		
		System.out.println(bb);//1
	//******************************************	
		
		//Pre increment
		//++a
		
		int aaa=3;
		int bbb=++aaa;
		
		System.out.println(aaa);//4
		
		System.out.println(bbb);//4
		
		
		int aaaa=-3;
		int bbbb=++aaaa;
		System.out.println(aaaa);//-4
		
		System.out.println(bbbb);//-4
		
		//**********************************8
		
		//post decrement
		//i--
		
		
		int i=2;
		int j=i--;
		System.out.println(i);//1 1
		System.out.println(j);//2 0
		
		
		int ii=-2;
		int jj=ii--;
		System.out.println(ii);//-3
		System.out.println(jj);//-2
		
		
		
		//pre decrement
		//--a
		
		int p=2;
		int q=--p;
		
		System.out.println(p);//1
		System.out.println(q);//1
		
		
		
	//****************************************	
		
		//Normal variables
		int x=10;
		x=20;
		x=30;
		x=40;
		System.out.println(x);
				
		
	//final variables// constant variable
		
		final int days=7;
		final int noofdaysinyear=365;
		
		final char gender='f';
		final String s="Nucot";
		
		
//***********************************************
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
