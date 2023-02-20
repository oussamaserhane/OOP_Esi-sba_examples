public class casting {  

	public static void main(String[] args){  
	
		// here start Widening Casting 
		System.out.println("Example of Widening Casting "); 
		int x = 7;  
		//automatically converts the integer type into long type  
		long y = x;  
		//automatically converts the long type into float type  
		float z = y;  
		System.out.println("Before conversion, int value "+x);  
		System.out.println("After conversion, long value "+y);  
		System.out.println("After conversion, float value "+z);  
		
		// here start Narrowing Casting 
		System.out.println("Example of Narrowing Casting "); 
		double d = 166.66;  
		//converting double data type into long data type  
		long l = (long)d;  
		//converting long data type into int data type  
		int i = (int)l;  
		System.out.println("Before conversion: "+d);  
		//fractional part lost  
		System.out.println("After conversion into long type: "+l);  
		//fractional part lost  
		System.out.println("After conversion into int type: "+i);

		// advance casting example 
		System.out.println("Example of Narrowing Casting (String to int) "); 
		int value=Integer.parseInt("200");  
		System.out.println("After conversion String into int type: "+value);
	 }  
}  

