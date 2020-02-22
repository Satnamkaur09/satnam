package package1;

public class student 

{
int age;
int rollno;

public void display()
   {
	System.out.println("Welcome to ALL");
	System.out.println("age=  "+age);
	System.out.println("rollno=  " +rollno);
	}
public void display2()
{
	System.out.println("WElcome Guys");
}

public static void main(String[] args)

{
	student satnam=new student();
	 satnam.age= 11;
	 satnam.rollno = 1;
	 satnam.display();
	 satnam.display2();
	 satnam.age= 22;
	 satnam.rollno = 2;
	 satnam.display();
	 satnam.display2();
	 
	
}
}
