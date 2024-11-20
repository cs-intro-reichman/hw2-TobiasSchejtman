// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

                String name = args[0];
                int number = Integer.parseInt(args[1]);
                String nameUpperCase = name.toUpperCase();

                int length = nameUpperCase.length();
                String letters = "AEFHILMNORSX";

                for (int i = 0; i < length; i++) {

                        char currentChar = nameUpperCase.charAt(i);

                        if (letters.indexOf(currentChar) == -1) {
                                System.out.println("Give me a  " + currentChar + ": " + currentChar + "!");
                            } else {
                                System.out.println("Give me an " + currentChar + ": " + currentChar + "!");
                            }

                }

                System.out.println("What does that spell?");

                for (int i = 0; i < number; i++) {
                        
                        System.out.println(nameUpperCase + "!!!");
                }








                
                


        }
}
