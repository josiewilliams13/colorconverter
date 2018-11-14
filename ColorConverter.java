import java.util.*;
import java.io.*;

public class ColorConverter {

	/*
     * This class opens the main class arguments from the Command Line, and is responsible for opening
     * and reading the data file, obtaining user input, performing some validation and handling
     * all errors that may occur.
     * 
     * @author Josie Williams
     * @throws IOException
	 */

	@SuppressWarnings("resource")
	public static void main (String [] args) throws IOException {		
		String quit = "quit";
		String userHex = "";
		boolean found = false;
		
		//use try block to get file from Command Line
		try {
			Scanner file = new Scanner (new File(args[0]));
			Scanner input = new Scanner (System.in);
			
			//create new ColorList object
			ColorList colorList = new ColorList ();
			
			//read each line from file
			while (file.hasNextLine()) {
				String [] splitStr = (file.nextLine()).split(", ");
			
				//create Color object and add to colorList
				for (int i = 0; i < splitStr.length; i++) {
					Color color = new Color (splitStr[i + 1].trim(), splitStr[i].trim());
					colorList.add(color);
					i++;
					}
				}
				
			do {
				//use try block to check user input
				try {
				System.out.println("Enter the color in HEX format (#RRGGBB) or \"quit\" to stop: ");
				userHex = input.nextLine();
	
				Color hexadecimal = new Color (userHex);
					
				for (int i = 0; i < colorList.size(); i++) {
					
					//check to see if hexadecimal value is in colorList.
					if ((colorList.get(i).getHexValue()).equalsIgnoreCase(hexadecimal.getHexValue())) {
						System.out.println(colorList.get(i).toString());
						i = colorList.size();
						found = true;
					}	
				}
			
				//if color is not in ColorList, create new Color object and place in list. 
				//get information and call toString method.
				if (found == false) {
					Color userInput = new Color (userHex);
					colorList.add (userInput);
					System.out.println (colorList.get(colorList.size() - 1).toString());
				}
					found = false;
			}
			catch (IllegalArgumentException ex) {
				if (userHex.equals(quit)) {
					System.out.println();
				}
				else  {
					System.out.println ("\nError: This is not a valid color specification. Try again.\n");
					}
				}
			} while (!(userHex.equalsIgnoreCase(quit)));	
		}
		catch (java.io.FileNotFoundException ex) {
			if (args[0].isEmpty()) {
				System.out.println ("Usage Error: The program expects file name as an argument.\n");
			}
			else {
				System.out.println ("Error: The file cannot be opened.\n");
			}
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println ("Usage Error: The program expects file name as an argument.\n");
		}
	}
}

