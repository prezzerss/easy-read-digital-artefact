
import java.util.Scanner;
import java.util.ArrayList;

public class ezread 
{
	public static void main(String[] args)
	{
		//main method
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- Welcome to the EZRead Checker ---");
		System.out.println("--- Insert a sentence to be checked or type 'quit' to exit ---");
		
		boolean runProgramme = true;
		
		while (runProgramme)
		{
			String userInput = scanner.nextLine();
			
			if(userInput.equalsIgnoreCase("quit"))
			{
				runProgramme = false;
				break;
			}
			switch(countWords(userInput))
	        {
	            case 3,4,5,6,7,8,9:
	                excellentLength();
	                break;
	                
	            case 10,11,12,13:
	                goodLength();
	                break;
	                
	            case 14,15,16:
	                fairLength();
	                break;
	                
	            case 17,18:
	                poorLength();
	                break;
	                
	            default:
	                
	            	if(countWords(userInput) > 18)
	                {
	                    badLength();
	                }
	                else
	                {
	                    invalidLength();
	                }
	                break;
	        }
			
			//countCharacters(userInput);
		}
		
	}
	
	private static void excellentLength()
	{
		System.out.println("");
		System.out.println("--- Excellent Length ---");
		System.out.println("");
	}
	
	private static void goodLength()
	{
		System.out.println("");
		System.out.println("--- Good Length ---");
		System.out.println("");
	}
	
	private static void fairLength()
	{
		System.out.println("");
		System.out.println("--- Fair Length ---");
		System.out.println("");
	}
	
	private static void poorLength()
	{
		System.out.println("");
		System.out.println("--- Poor Length ---");
		System.out.println("");
	}
	
	private static void badLength()
	{
		System.out.println("");
		System.out.println("--- Bad Length ---");
		System.out.println("");
	}
	
	private static void invalidLength()
	{
		System.out.println("");
		System.out.println("--- Invalid Length ---");
		System.out.println("");
	}
	
	private static int countWords(String words)
	{
		//count of words in sentence method
		String[] splitWords = words.split("\\s+");
		
		int counter = 0;
		
		for(int i = 0; i < splitWords.length; i++)
		{
			String individualWords = splitWords[i];
			
			if(individualWords.matches(".*[A-Za-z0-9].*"))
			{
				counter++;
			}
		}
		return counter;
	}
	
	private static int countCharacters(String sentence)
	{
	}
}
