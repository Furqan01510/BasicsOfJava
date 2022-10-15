package ConditionalandLoops;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int a=10, b=9;
		
		System.out.println("AND Truth Table"); 	// AND Truth Table
		System.out.println(false && false);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(true && true);
		System.out.println();
		
		System.out.println("OR Truth Table"); 	// OR Truth Table
		System.out.println(false || false);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(true || true);
		System.out.println();
		
		System.out.println("Not Truth Table");	// Not Truth Table
		System.out.println(!false);
		System.out.println(!true);
		System.out.println();
		
		System.out.println("Relational & Logical Operators");
		System.out.println(a>=10 && b>=10);
		System.out.println(a>=10 || b>=10);
		System.out.println();
		
		System.out.println("Different ways of using Relational & Logical Operators");
		System.out.println(!(a>=10) || !(b>=10));
		System.out.println(!(a>=10) || !(b>=10));
		System.out.println();
		
		System.out.println(!((a>=10) && (b>=10)));
		System.out.println(!((a>=10) || (b>=10)));
		
		
	}

}
