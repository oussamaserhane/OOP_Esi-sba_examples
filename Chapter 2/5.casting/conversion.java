public class conversion{  
	public static void main(String args[]){  
		int i=200;  
		String s = String.valueOf(i);  
		System.out.println(i+100); //300 because + is binary plus operator  
		System.out.println(s+100); //200100 because + is string concatenation operator
		
		s = Integer.toString(i);   //Now it will return "200"  
		System.out.println(s+100); //200100 because + is string concatenation operator  
		
		s = String.format("%d",i);  
		System.out.println(s+200); //200200 because + is string concatenation operator  
	}
}  


