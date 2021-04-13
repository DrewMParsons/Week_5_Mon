package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArrayLists
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String> stringArrayList = new ArrayList<String>();
		ArrayList<String> anotherStringArrayList = new ArrayList<String>();
		
		//old method of creating ArrayList using Arrays class
		List<Integer> intList = Arrays.asList(1,2,5);
		
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>(intList);
	
		stringArrayList.add("Drew");
		stringArrayList.add("Prew");
		stringArrayList.add("Shrew");
		
		anotherStringArrayList.add("a");
		anotherStringArrayList.add("b");
		anotherStringArrayList.add("c");
		anotherStringArrayList.add("d");
		
		//add another  object  of collection to the collection
		//number is optional- index of where to insert(default is end  of  array)
		stringArrayList.addAll(1,anotherStringArrayList);
		
		/*
		 * Remove method can be used to remove at index, or can pass an object to remove
		 * index removed returns the value removed, object removed returns boolean
		 * you don't need to set the return value, just there if you want it
		 */
		Integer num  =1;
		//boolean result = integerArrayList.remove(num);
		boolean result = integerArrayList.remove((Integer)1);
		Integer removedValue = integerArrayList.remove(1);
		for (String stringS : stringArrayList)
		{
			System.out.println(stringS);
		}
		System.out.println(result + "  "  + removedValue+ "  "  + integerArrayList);

//		boolean result = c.remove(Integer)1);
//		System.out.println(result + ":" + c);
		
		
		
	}

}
