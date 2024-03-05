import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
        	// Creating an ArrayList
        	ArrayList<String> demo = new ArrayList<>();

	        // Adding elements to the ArrayList
	        demo.add("Apple");
	        demo.add("Banana");
	        demo.add("Orange");
	        demo.add("Mango");
	
        	// Printing the ArrayList
        	System.out.println("ArrayList: " + demo);
	
		System.out.println("----------------------------------------------------------------------------------------------------------");
        	// Accessing elements by index
        	System.out.println("Element at index 1: " + demo.get(1));		

		System.out.println("----------------------------------------------------------------------------------------------------------");			

        	// Modifying elements
	        demo.set(2, "Grapes");
        	System.out.println("Modified ArrayList: " + demo);

		
		System.out.println("----------------------------------------------------------------------------------------------------------");

	        // Removing elements
	        demo.remove("Apple");
	        System.out.println("ArrayList after removing 'Apple': " + demo);

		
		System.out.println("----------------------------------------------------------------------------------------------------------");

	        // Checking if an element exists
	        if (demo.contains("Mango")) 
		{
        		System.out.println("Mango is present in the ArrayList.");
        	}
		else 
		{
                	System.out.println("Mango is not present in the ArrayList.");
        	}

		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
	        // Getting the size of the ArrayList
	        System.out.println("Size of ArrayList: " + demo.size());

		
		System.out.println("----------------------------------------------------------------------------------------------------------");
	
	        // Iterating over elements using iterator
	        System.out.println("Iterating over ArrayList using Iterator:");
	        Iterator<String> iterator = demo.iterator();
        	while (iterator.hasNext()) 
		{
                	String fruit = iterator.next();
            		System.out.println(fruit);
        	}

	        // Clearing the ArrayList
	        demo.clear();
	        System.out.println("ArrayList after clearing: " + demo);
    	}	
}
