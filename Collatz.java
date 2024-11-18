// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		

		String mode = args[1];
		
		
		if (mode.equals("v")) {

			for (int i = 1; i <= seed; i++) { 
		
				String sequence = "";
				int number = i;
				sequence += number;

				while (number > 1) {
			
					if (number % 2 == 0) {
						number /= 2;
					} else {
						number = number * 3 + 1;
					}

					sequence += ", " + number;

				}

				System.out.println(sequence);
			}

			} else {
				System.out.println("error");
			}
		}
	}

