import java.util.Scanner;

public class strChallenge {
   public static void main(String[] args) {
        String str = args[0];
        System.out.println("Original String = " + str);

		Scanner myInput = new Scanner(System.in);
		
		while(true){
			int inputIndex = myInput.nextInt();
			char caracter = str.charAt(inputIndex);
			System.out.println("The character in possition "+inputIndex+ 
				"is "+ caracter );
		}
    }
}