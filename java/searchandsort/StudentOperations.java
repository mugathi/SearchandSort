package searchandsort;

import java.io.*;
import java.util.*;
/**
 * @author Pavan Kumar
 */
public class StudentOperations {

public static void main(String[] args) {
	
//    	   Declaration of variables
	
    	Scanner in=new Scanner(System.in);
        String csvFile = "c:/Users/Administrator/eclipse-workspace/searchandsort/src/main/resources/Data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        boolean crctOption=true;
        int option=0;
        String data=null;
        int arrLength=0;
        
        /**
         * @Student array to store student objects
         */
        
        Student[] studentArray=new Student[1000];
        
        /**
         * @Values used to insert the student object into hashMap.
         */
        
        Values values=new Values();
        
        /**
         * @Choose the correct option to sort the details.
         */
        
        while(crctOption)
        {
        System.out.println("please enter your option to sort by: 1 ->First Name , 2-> Last Name , 3->Id , 4-> Class , 5-> Department");
        
         option =in.nextInt();
         
        if(option>=1&&option<=5)
        {
        	crctOption=false;
        }
        else 
        {
        	System.out.println("Choose correct option");
        }
        
        }
        

        try {
        	
            br = new BufferedReader(new FileReader(csvFile));
            line=br.readLine();
            
            /**
             * @Fetch the details from the csv file and store it into Student array in the form of objects
             */
            
            while ((line = br.readLine()) != null) {

                String[] arr = line.split(cvsSplitBy);
                Student student=new Student(arr[0],arr[1],arr[2],arr[3],arr[4]);
                values.add(student,arrLength);
                studentArray[arrLength++]=student;
            }
            
            Student[] finalstudentarray=new Student[arrLength];
            
            for(int i=0;i<arrLength;i++)
            {
            	finalstudentarray[i]=studentArray[i];
            }
            
            switch(option)
            {
            	case 1:	Arrays.sort(finalstudentarray,new Order.SortbyFirstName());break;
            	case 2: Arrays.sort(finalstudentarray,new Order.SortbyLastName());break;
            	case 3: Arrays.sort(finalstudentarray,new Order.SortbyId());break;
            	case 4: Arrays.sort(finalstudentarray,new Order.SortbyClass());break;
            	case 5: Arrays.sort(finalstudentarray,new Order.SortbyDepartment());break;
            	default: break;
            	
            }
            
           
            
            for(int i=0;i<arrLength;i++)
            {
            	System.out.println(finalstudentarray[i].toString());
            }
            
            /**
             * @Searching by entering the required details
             */
            
            System.out.println("Enter the studentArray that you want to search for");
        	data=in.next();
        	
        	int[] result=values.fetchResults(data);
        	int i=0;
        	
            for(;result[i]!=-9999;i++)
            {
            	System.out.println(studentArray[result[i]]);
            }
            
        	if(i==0)
        	{
        		System.out.println("student details not found");
        	}
        	
            } catch (Exception e) {
            e.printStackTrace();
           }
            finally
            {
        	try
        	{ 
        		br.close();
        		in.close();
        	}
        	catch(Exception e){
        		e.printStackTrace();
        	}
        }
    }

}




