// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int number = Integer.parseInt(args[0]);
		double piApproximated = 0;

		for (int i = 0; i < number; i++) {

        if (i % 2 == 0) {
				piApproximated += (1.0 / (2 * i + 1));
			} else {
				piApproximated -= (1.0 / (2 * i + 1));
			}
        }

		piApproximated *= 4;


		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + piApproximated);

	}
}
