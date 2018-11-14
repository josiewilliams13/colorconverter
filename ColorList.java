import java.util.ArrayList;

@SuppressWarnings("serial")
/*
 * This class is used to store all Color objects whose name and hexadecimal value are provided in
 * the file. The ColorList class inherits ArrayList<e>.
 * 
 * @author Josie Williams
 */

public class ColorList extends ArrayList <Color> {
	
	/*
	 * ColorList class only has one, no-parameter constructor. Used to create an empty array list.
	 */
	public ColorList () { 
		
	}
	
	/*
	 * This method is meant to return the Color object in the list whose color name matches the colorName specified
	 * in the parameters. 
	 * 
	 * @param colorName
	 * returns Color object if colorName finds a match, null otherwise.
	 */
	public Color getColorByName (String colorName) {
		for (int i = 0; i < this.size(); i++) {
			//add if-statement for if name equals null
			if (!(this.get(i).getName() == null)) {
				if (this.get(i).getName().equalsIgnoreCase(colorName)) {
					return this.get(i);
				}
			}
		}
		return null;
	}
	
	/*
	 * This method return the Color object in the list whose hexadecimal value matches the colorHexValue 
	 * specified in the parameters. 
	 * 
	 * @param colorHexValue
	 * returns Color object if colorHexValue matches, null otherwise.
	 */
	public Color getColorByHexValue (String colorHexValue) {
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).getHexValue().equalsIgnoreCase(colorHexValue)) {
				return this.get(i);
			}
		}
		return null; 
	}
}
