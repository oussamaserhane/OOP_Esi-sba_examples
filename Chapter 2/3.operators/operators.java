public class operators {
	
	public static void main(String args[]){	
		// declare variables
		int a = 12, b = 5;
		// addition operator
		System.out.println("a + b = " + (a + b));
		
		{/*  Assignment Operators */} 
		System.out.println("Assignment Operators");

		int var;

		// assign value using =
		var = a;
		System.out.println("var using =: " + var);
		// assign value using =+
		var += a;
		System.out.println("var using +=: " + var);
		// assign value using =*
		var *= a;
		System.out.println("var using *=: " + var);
		
		{/*  Comparison operators */} 
		System.out.println("Comparison operators");
		System.out.println(a == b);  // false
		System.out.println(a != b);  // true
		System.out.println(a < b);  // true
		System.out.println(a >= b);  // false 
		
				{/*  Logical Operators */} 
		System.out.println("Logical Operators");
		System.out.println((5 > 3) && (8 < 5));  // false
		System.out.println((5 < 3) || (8 < 5));  // false
		System.out.println(!(5 > 3));  // false
	}
	
	
 switch(male_or_female) {
  case 'M':
    System.out.println("This person is a Male");
    break;
  case 'F':
    System.out.println("This person is a Female");
    break;
  default:
    System.out.println("this person is not a human");
   }


}



