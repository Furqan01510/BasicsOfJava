package DataTypes;

public class TypeConversions {

	public static void main(String[] args) {
		// Character Type Conversion
		char ch = 'a';
		int i = ch;		// Type Conversion or Implicit Conversion
		System.out.println(i); // Printing ASCII Value of 'a'
		ch = (char)i;	// Type Incompatible or Explicit Conversion
		System.out.println(ch); // Printing Conversion in character
		ch = (char)(ch + 1);	// Type Incompatible or Explicit Conversion
		System.out.println(ch); // Printing Conversion in character

		// Integers 
		short s = 17;
		i = s;	// Implicit Conversion or Type Conversion
		s = (short)i;	// Explicit Conversion or Incompatible Conversion
		System.out.println(i); 	// Printing Conversion in Integer 
		System.out.println(s);	// Printing Conversion in Integer 

		//Float & Double 
		i = (int) 10.6; 	// Conversion of double to integer
		float f =(float)1.7; // Explicit conversion & Declaration 
		float fl = 1.7f;	// Declaration

		System.out.println(i); // Printing Conversion in Integer 
		System.out.println(f); // Printing Conversion in floating 
		System.out.println(fl); // Printing Conversion in float ing 

	}
}
