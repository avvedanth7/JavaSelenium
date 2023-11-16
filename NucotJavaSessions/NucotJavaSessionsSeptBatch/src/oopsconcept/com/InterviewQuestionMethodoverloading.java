package oopsconcept.com;

public class InterviewQuestionMethodoverloading {

	
	public static void main(int a) {
		
		System.out.println("this is one parameter");

	}
	
	public static void main(String args,int b) {
		System.out.println("this is two parameter");

	}
	
	public static void main(String args,int c,int d) {
		System.out.println("this is three parameter");

	}
	
	public static void main(String[] args) {
		System.out.println("this is one parameter with string array");
		main(10);
		main("nucot",10);
		main("nucot",10,20);

	}
	
}
