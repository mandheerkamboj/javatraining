class DataTypes
{
	static String college;
	static String school;//static donot need object
	String name; //needs object
 public static void main(String args[])
 {
		DataTypes dt=new DataTypes();
		DataTypes dt1=new DataTypes();
		school="Sacred Heart Convent School";
		college="chitkara";
		dt.name="Mandheer";
		int age=25;
		char letter='a';
		System.out.println(age);
		System.out.println(letter);
		System.out.println("School: "+dt.school);//prints scared heart
		dt.school="D.C.M";
		
		System.out.println("School: "+dt1.school);
		System.out.println("Name: "+dt.name);
		System.out.println("College: "+college);
 }
}