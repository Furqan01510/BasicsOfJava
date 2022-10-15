package DataTypes;

public class DataTypeStored {

	public static void main(String[] args) {
		// How Data is stored

		int min = Integer.MIN_VALUE;	// -2^31 Possible Negative value
		int max = Integer.MAX_VALUE;	// 2^31-1 Possible Positive value
		System.out.println(min+" "+max); // Printing the Results 
		
		// Double
		double mind = Double.MIN_VALUE;	// -2^31 Possible Negative value
		double maxd = Double.MAX_VALUE;	// 2^31-1 Possible Positive value
		System.out.println(mind+" "+maxd); // Printing the Results 
		
		// Character 
		char ch = 'a';	
		System.out.println(ch);	// Printing Single Character
		
		int chInt = ch;		// Type Conversion 
		System.out.println(chInt); // Printing Type Conversion
		
		System.out.println('a' + 3);	// 'a' have ASCII value is 97 
		// Result in Addition of Integer.
		// In java the larger data type is consider among 2 different data type
	}
}
