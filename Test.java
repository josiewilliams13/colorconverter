/*package project1;

public class Test {
	public static void main (String [] args) {
		String hexValue = "#F0F8FF";
		
		System.out.println("Hello, I'm working");
		
		for (int i = 0; i < 3; i++) {
			String str = "Hello, I'm working in a for loop";
			System.out.println(str);
		}
	
		String newHexVal = hexValue.toUpperCase();
		int red = Integer.valueOf (newHexVal.substring(1, 3), 16);
		int green = Integer.valueOf (newHexVal.substring(3, 5), 16);
	
		newHexVal = newHexVal + " ";
		int blue = Integer.valueOf (newHexVal.substring(5, 7), 16);
		
		System.out.println(red + ", " + green + ", " + blue);

		String hex = ("#" + Integer.toHexString(red)).toUpperCase();
		
		System.out.print(hex);
	}
	



//How many times can a number be divided by 16.
//ie. 25/16 --> 1 time w/ 9 remainder

// number / 16 --> first digit
// number % 16 --> second digit


//if (hexValue.charAt(0) != '#' || hexValue.length() < 7) {
//	throw new IllegalArgumentException ("Error: This is not a valid color specification.");
	
	
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
*/
