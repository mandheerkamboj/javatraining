import java.util.Scanner;
class salary
{
	public static void main(String args[])
{
	String name;
	double sal;
	char grade;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name:");
	name=sc.next();
	System.out.println("Enter your salary:");
	sal=sc.nextDouble();
	System.out.println("Enter your grade:");
	grade=sc.next().charAt(0);
  if (sal>=50000)
  {
  if (grade=='a')
	{
	sal=sal+(20*sal)/100;
	System.out.println(name+" your increased salary to: "+ sal);
	}
	 else if (grade=='b')
	{
	sal=sal+(15*sal)/100;
	System.out.println(name+" your increased salary to: "+ sal);
	}
	else if (grade=='c')
	{
	sal=sal+(10*sal)/100;
	System.out.println(name+" your increased salary to: "+ sal);
	}
	else if (grade=='d')
	{
	sal=sal+(5*sal)/100;
	System.out.println(name+" your increased salary to: "+ sal);
	}
  }
}
}
	
 
