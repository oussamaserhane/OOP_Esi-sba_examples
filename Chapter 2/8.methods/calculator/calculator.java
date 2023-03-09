public class calculator {
	
	static int result;
	//Method for addition
	public static int add(int num1, int num2){
		result = num1+num2;
		return result;
	}
	//Method for subtraction
	public static int substract(int num1, int num2){
		result = num1-num2;
		return result;
	}
	//Method for multiplication
	public static int multiply(int num1, int num2){
		result = num1*num2;
		return result;
	}
	//Method for division
	public static float divide(int num1, int num2){
		result = num1/num2;
		return result;
	}
	
	public static void main(String[] args) {
		// call addition method
		int sum_value = add(4, 7);
		System.out.println( " The addition result is : "+sum_value);
		
		// call subtraction method
		int sub_value = substract(4, 7);
		System.out.println( " The subtraction result is : "+sub_value);
		
		// call multiplication method
		int multiplication_value = multiply(4, 7);
		System.out.println( " The multiplication result is : "+multiplication_value);
		
		// call division method
		float div_value = divide(4, 7);
		System.out.println( " The division result is : "+div_value);

	}	
}


