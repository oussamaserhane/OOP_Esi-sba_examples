public class methodEx {
 
	public static int smallNumber(int num1, int num2, int num3){
		int small_One;
		if(num1<num2){
			if(num3<num1){
				small_One = num3;
			} else{
				small_One = num1;
			}
		}else{
			if(num2<num3){
				small_One = num2;
			} else{
				small_One = num3;
			}
		}
	 
		return small_One;
	}
	
	
	public static int average (int num1, int num2, int num3){
		int avg;
		avg = (num1 + num2 + num3) / 3 ;
		
		return avg;
	}
	
		
	public static void displayNumber (){
		int maxDisplay = 50;
		for(int i =0; i< maxDisplay ; i ++) {
			System.out.print(i+1 + "|");
			if((i+1) %10 == 0){
				System.out.println("");
			}
		}
	}
	
	
	public static void main(String[] args) {
		int result = smallNumber(10, 145, 5);
		System.out.println( " The smallest number is : "+result);
		
		int average_resault = average(10, 145, 5);
		System.out.println( " The average  is : "+average_resault);
		
		displayNumber();

	}	
}






