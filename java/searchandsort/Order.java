package searchandsort;

import java.util.Comparator;

/**
 * @Used to sort the data based on our requirements
 */

 class Order {
	
	 static class SortbyFirstName implements Comparator<Student>
	{
		public int compare(Student x,Student y)
		{
			return x.firstname.compareTo(y.firstname);	
		}
	}
	static class SortbyLastName implements Comparator<Student>
	{
		public int compare(Student x,Student y)
		{
			return x.lastname.compareTo(y.lastname);	
		}
	}
	static class SortbyId implements Comparator<Student>
	{
		public int compare(Student x,Student y)
		{
			return x.id.compareTo(y.id);	
		}
	}
	static class SortbyClass implements Comparator<Student>
	{
		public int compare(Student x,Student y)
		{
			return x.cls.compareTo(y.cls);	
		}
	}
	static class SortbyDepartment implements Comparator<Student>
	{
		public int compare(Student x,Student y)
		{
			return x.department.compareTo(y.department);	
		}
	}

}
