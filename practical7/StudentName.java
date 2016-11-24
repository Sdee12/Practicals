package practical7;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StudentName {
	//jkdksgmklsdl
	//boolean function which just test if a string is a integer 
	public boolean isInteger( String input ) {
	    try {
	        Integer.parseInt( input ); // if "9" than -> 9
	        return true;
	    }
	    catch( Exception e ) {
	        return false;   // if "word" than -> error -> false
	    }
	}
	
	public static void main(String[] args){
		
		//create an object (call a method which is not static)
		StudentName name = new StudentName();
		
		//create a scanner object for reading
		Scanner in = new Scanner(System.in);
		
		//create a map
		Map<String, String> fullName = new HashMap<String, String>();
	
		//read the number of students and instantiate the array of names
		System.out.println("Enter the numer of students:");
		String noStudent = in.nextLine();
		int noStudents = Integer.parseInt(noStudent);
		String[] names = new String[noStudents];
		
		//adding elements to map
		for(int i = 0 ; i < names.length ; i++){
			//reading the student's name
			names[i] = in.nextLine();
			
			//using split method to separate in first and last name
			String[] parts = names[i].split(" " , 2);
			String first = parts[0];
			String last = parts[ parts.length - 1 ];
			
			//use first name as a key and last name as a value
			fullName.put( first, last );
		}
		
	/**JUST FOR TESTING (see what keys and what values are stored in the map)
	  	for( String k : fullName.keySet() ){
			System.out.println( k );
		}
		
		for( String v : fullName.values() ){
			System.out.println( v );
		} */
	
		//read the users's input
		System.out.println("Enter the student's first name or his position:");
		String userInput = in.next();
		
		//if the user's input is a number
		if( name.isInteger(userInput) ){
			
			//convert the string to an integer
			int number = Integer.parseInt(userInput);
			
			//error message: if the user input is too big 
			while( number > noStudents ){
				System.out.println("You submited a too big number, please try again:");
				number = in.nextInt();
			}
			
			//prints the full name
			System.out.println("The student's full name is: " + names[number-1]);
		}
		
		//if the user's input is a string
		else{
			//searches through keys
			for( String key : fullName.keySet() ){
				
				//if any key from the map is the same with the user's input, print the student's last name
				if( key.equalsIgnoreCase(userInput)){
					System.out.println("The student's last name is: " + fullName.get(key) );
				}
			}
		}
	}
}