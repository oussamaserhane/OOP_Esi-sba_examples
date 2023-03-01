public class ConstructorTypes{
	
	public ConstructorTypes(){ // constructor one
 		System.out.println("Im No-argument constractor");
	}
	public ConstructorTypes(String value){ // constructor Two
	   System.out.println("Im constractor with "+ value +" args");
	}
	
	
	public static void main(String [] args){
		ConstructorTypes No_Args = new ConstructorTypes();
		ConstructorTypes With_Args = new ConstructorTypes("hello");
	}
}


