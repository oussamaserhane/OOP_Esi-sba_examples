public class MultiDimensional_Array {
  public static void main(String[] args) {
    int[][] myNumbers = { {4, 5, 9}, {9, 8, 0}, {7, 1, 4} };
    
    for (int i =0; i < myNumbers.length; i ++) {
      for (int j =0; j < myNumbers.length; j ++) {
          System.out.println(" i:" + i + " j:"+ j + " Value: " + myNumbers[i][j]);  
      }
	  System.out.println("");
    }
  }
}
 
 
 



