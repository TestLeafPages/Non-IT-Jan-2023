package LearnCollection;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		
		//to declare a list
		
		List<String> listName= new ArrayList<String>();
		//List-->interface
		//<>-->generic
		//String-->wrapperclass
		//ArrayList
		
		listName.add("Teena");
		listName.add("Priya");
		listName.add("Bala");
		listName.add("Prasanna");
		listName.add("Alice");		
		System.out.println(listName);	
		
		//to reterive the data from the list;
		System.out.println(listName.get(0));
		
		//to find the size of the list
		System.out.println(listName.size());
		
		System.out.println(listName.set(0, "Faizan"));
		System.out.println(listName);
	
		System.out.println(listName.contains("Priya"));
		
		
		
		//Interger-->allows only the number
       List<Integer> intList=new ArrayList<Integer>();
       //allows all datatypes
       
		List<Object> alltypesOfdat=new ArrayList<Object>();
		
		alltypesOfdat.addAll(listName);
		System.out.println(alltypesOfdat);
		
		alltypesOfdat.remove(3);
		System.out.println(alltypesOfdat);
		
		System.out.println(alltypesOfdat.add("Vishvesh"));
		System.out.println(alltypesOfdat);
		
		alltypesOfdat.removeAll(listName);
		System.out.println(alltypesOfdat); 
		
		alltypesOfdat.remove(0);
		System.out.println(alltypesOfdat.isEmpty());
		
		
		listName.clear();
		System.out.println(listName);
		
		List<String> newList=new ArrayList<String>();
		
		newList.add("Vidya");
		newList.add("Ranjani");
		newList.add("Vinoth");
		newList.add("Gokul");
		
		System.out.println(newList.toArray());
		
		
	}

}
