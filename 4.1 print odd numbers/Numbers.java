public class Numbers {
	
	public static void main(String[] args) {
		
		// Incrementing 2 in each step (use "continue" to skip 7) 
		for (int i = 5; i <= 15; i += 2) {
			if (i == 7) {
				continue;
				}
			System.out.println(i);
		}

		// Incrementing 1 in each step (use "continue") 
		for (int i = 5; i <= 15; i++) {
			if (i % 2 == 0) {
				continue;
			}
			if (i == 7) {
				continue;
			}
			System.out.println(i);
		}

		// With and endless loop (using "break" & "continue")
		for (int i = 5; ; i += 2) {
			if (i == 7) {
				continue;
			}
			if (i > 15) {
				break;
			}
			System.out.println(i);
		}
	}
}


