class objects
{
	String school;//static donot need object
	String name; //needs object
 public static void main(String args[])
 {
		DataTypes dt=new DataTypes();
		DataTypes dt1=new DataTypes();
		//dt.school="Sacred Heart Convent School";
		dt.name="Mandheer";
		System.out.println("School: "+dt.school);//prints scared heart
		dt.school="D.C.M";
		System.out.println("School: "+dt1.school);
		System.out.println("Name: "+dt.name);
 }
}