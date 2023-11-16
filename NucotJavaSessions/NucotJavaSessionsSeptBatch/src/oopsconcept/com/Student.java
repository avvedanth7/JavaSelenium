package oopsconcept.com;

public class Student {

	//create a method to get the marks of the student
	//return the marks
	//camelcase
	
		public int  getStudentMarksResult(String stuName)
		{
		
			System.out.println("This method is returning the student marks--->"+stuName);
			int marks=-1;
			
			if(stuName.equalsIgnoreCase("aaa"))
			{
				marks=100;
			}
			else if(stuName.equalsIgnoreCase("bbb"))
			{
				marks=90;
			}
			else if(stuName.equalsIgnoreCase("ccc"))
			{
				marks=80;
			}
			else if(stuName.equalsIgnoreCase("ddd"))
			{
				marks=60;
			}
			
			else if(stuName.equalsIgnoreCase("eee"))
			{
				marks=30;
			}
			else
			{
				System.out.println("Please pass the vaild student name--->"+stuName);
			}
			
			return marks;
			
	
			
		}
	
	
	
	

	
	public static void main(String[] args) {
		
		Student objname=new Student();
		int value=objname.getStudentMarksResult("ddd");
		System.out.println(value);
		
		
		

	}

}
