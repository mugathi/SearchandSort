package searchandsort;

/**
 * @creating Object to student details
 */

class Student {
	String firstname,lastname,id,cls,department;
	Student(String firstname,String lastname,String id,String cls,String department)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.id=id;
		this.cls=cls;
		this.department=department;
	}
	public String toString()
	{
		return firstname+" "+lastname+" "+id+" "+cls+" "+department;
	}
}
