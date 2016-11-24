package practical7;

import java.util.*;
public class Test{
	public static Scanner in = new Scanner(System.in);
	//Read words and convert them to lower case until stop is read
	public static void readWords(){	
		boolean finish = false;
		String word = ""; 
		System.out.println("Type your words:");
		while (!finish) 
		{
			word = in.next();		
			if(word.equalsIgnoreCase("stop"))
			{
				finish = true;
				break;
			}
			System.out.println('"' + word.toLowerCase() + '"');
		}
	}
	//Read more words on the same line, split them and put in a new vector
	//convert them to lower case and print each word on a separate line
	public static void splitString()
	{	
		boolean finish = false;
		System.out.println("Type your words on the same line:");
		while (!finish){
			String[] parts = in.nextLine().split(" ");
			for (String word : parts){
				if(word.equalsIgnoreCase("stop")){
					System.out.println("FINISH");
					finish = true;
					break;
				}
				System.out.println('"' + word.toLowerCase() + '"');
			}
		}	
	}
	public static void main(String[] args)
	{
			//readWords();
			splitString();
	}
}
