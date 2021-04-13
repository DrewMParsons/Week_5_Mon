package generics;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main
{

	public static void main(String[] args)
	{
		List<String> alist = new ArrayList<String>();
		ArrayList<String> anArraylist = new ArrayList<String>();
		Integer newInt = 2;
		
		GenericDemoClass<List<String>, Integer> interfaceGeneric= 
				new GenericDemoClass<List<String>,Integer>(alist,newInt);
		GenericDemoClass<List<String>, Integer> interfaceGenericTwo= 
				new GenericDemoClass<List<String>,Integer>(anArraylist,newInt);
		GenericDemoClass<AbstractList<String>, Integer> abstractGeneric= 
				new GenericDemoClass<AbstractList<String>,Integer>(anArraylist,newInt);
		
		//DOESNT WORK-must cast the List to AbstractList
//		GenericDemoClass<AbstractList<String>, Integer> abstractGeneric= 
//				new GenericDemoClass<AbstractList<String>,Integer>(alist,newInt);

	}

}
