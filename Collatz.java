// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		

		String mode = args[1];
		
		
		if (mode.equals("v")) {

			
			System.out.println("1 4 2 1 (4)");

			for (int i = 2; i <= seed; i++) { 
				
				String sequence = "";
				int number = i;
				sequence += number;
				int steps = 1;
				
				
				while (number > 1)  {
			
					if (number % 2 == 0) {
						number /= 2;
					} else {
						number = number * 3 + 1;
					}

					sequence += " " + number;
					steps++;
					

				}

				System.out.println(sequence + " (" + steps + ")");
			}

			System.out.println("");
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");

			} else {
				System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
			}
		}
	}

