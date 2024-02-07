import java.util.Scanner;

// Superclass Hillstations
class Hillstations 
{
	// Method to display location
	public void location() 
	{
        	System.out.println("Location: Varies");
    	}

	// Method to display what they are famous for
	public void famousfor() 
	{
        	System.out.println("Famous for: Natural beauty and scenic views");
    	}
}

// Subclass Manali
class Manali extends Hillstations 
{
	// Overriding location method
   	
        public void location() 
	{
        	System.out.println("Location: Himachal Pradesh, India");
    	}

	// Overriding famousfor method
    	
    	public void famousfor() 
	{
        	System.out.println("Famous for: Adventure sports and temples");
    	}
}

// Subclass Mussoorie
class Mussoorie extends Hillstations 
{
	// Overriding location method
	
	public void location() 
	{
        	System.out.println("Location: Uttarakhand, India");
    	}

	// Overriding famousfor method
	
    	public void famousfor() 
	{
        	System.out.println("Famous for: Mall Road and Kempty Falls");
    	}
}

// Subclass Gulmarg
class Gulmarg extends Hillstations 
{
	// Overriding location method
    	
    	public void location() 
	{
       		System.out.println("Location: Jammu and Kashmir, India");
    	}

        // Overriding famousfor method
        
    	public void famousfor() 
	{
        	System.out.println("Famous for: Skiing and snowboarding");
    	}
}

// Main class
public class HillStationMain
{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

        	// Variable to store user's choice
        	int choice;
		char ans;

	        

	        do 
		{
            		// Asking user to choose a hill station
            		System.out.println("------------------------------------------ Choose a hill station:  -----------------------------------------");
            		System.out.println("1. Manali");
            		System.out.println("2. Mussoorie");
            		System.out.println("3. Gulmarg");
            		choice = scanner.nextInt();
	
		        Hillstations hillstation;

		        // Creating object based on user's choice
	                switch (choice) 
			{
                		case 1:
                			hillstation = new Manali();
                			break;
                		case 2:
                    			hillstation = new Mussoorie();
                    			break;
               			case 3:
                	 		hillstation = new Gulmarg();
                    			break;
                		default:
                   			System.out.println("Invalid choice. Defaulting to Manali.");
                    		 	hillstation = new Manali();
            		}


            	// Calling methods
            	System.out.println("\nDetails of selected hill station:");
            	hillstation.location();
            	hillstation.famousfor();

	       System.out.println("\n");
		System.out.println("\n");
			System.out.println("--------------------------Do you want to Select any other hill station Y/N--------------------------------");

			System.out.println("\n");
			ans=scanner.next().charAt(0);
			
        	} while (ans=='Y' || ans=='y');

	 }
}
