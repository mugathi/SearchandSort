package searchandsort;

/**
 * used for inserting and accessing values into hashmap.
 */

public class Values {
	
	HashMap map=new HashMap();

	/**
	 * used to insert values into hashMap 
	 */
	
	void add(Student student,int index)
	{
	map.insert(student.firstname,index);
	map.insert(student.lastname, index);
	map.insert(student.id, index);
	map.insert(student.cls, index);
	map.insert(student.department, index);
	}
	
	/**
	 * used to  fetching the original indexes in student array if the value has been matched by calling hashmap object .
	 */
		
	
	int[] fetchResults(String value)
	{
		return map.search(value);
	}

}
