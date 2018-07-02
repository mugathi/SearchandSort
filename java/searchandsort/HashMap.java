package searchandsort;

/**
 * Storing values into array based on hashing and the original indexes of student object in studentarray into indexarr. 
 */

public class HashMap {
	
	/**
	 * Key array to store the data given.
	 * indexArr to store the original index of student array
	 */
	
	String[] key=new String[100000];
	int[] indexArr=new int[100000];
	
	int hash(String key)
	{
	return Math.abs(key.hashCode())%100000;	
	}
	
	void insert(String data,int index)
	{
		int i=hash(data);
	for(;key[i]!=null;i=(i+1)%100000)
	{
		
	}
	key[i]=data;
	indexArr[i]=index;
	}
	
	/**
	 * used for searching and if the data has been matched then it returns the array of original indexes in student array.
	 */


	int[] search(String data)
	{
	int[] results=new int[10000];
	int length=0;
	for(int i=hash(data);key[i]!=null&&key[i].equals(data);i=(i+1)%100000)
	{
		results[length++]=indexArr[i];
	}
	results[length]=-9999;
	return results;
	}

}
