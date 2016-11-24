package practical7;

import java.util.Scanner;

public class Saved {
	public static void main(String[] args){
		//create a scanner object
		Scanner in = new Scanner(System.in);
		
		//initialize variables
		int student = 0;
		int number = 0;
		
		System.out.println("Enter the numer of students:");
		number = in.nextInt();
		String[] names = new String[number];
		
		//read values for names array
		for( int i = 0; i < number; i++ ){
			System.out.println("Enter student name:");
			names[i] = in.next();			
		}
		//System.out.println(Arrays.toString(names));
		System.out.println("Enter the number of the student which you want to know:");
		
		//check if it's a valid input
		student = in.nextInt();
		while(student > number){
			System.out.println("Please, insert a valid input:");
			student = in.nextInt();
		}
		
		//show the wanted name of the student
		for( int i = 0; i < number; i++ ){
			//System.out.println(i + "." + names[i]);
			if(i == student){
				System.out.println(names[i]);
			}
		}
	}
}
