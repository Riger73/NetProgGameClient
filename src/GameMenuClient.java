import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameMenuClient {

    public static void main(String[] args) throws IOException {
        String menuInput = " ";
        // initialise selection variable to ascii null to keep compiler happy
        char selection = '0';

        // instantiate input stream
        BufferedReader mbr = new BufferedReader
                (new InputStreamReader(System.in));
        try {
            // establish the menu loop within which the app functions
            while (selection != 'X') {
                // print menu to screen
                System.out
                        .println("System Menu for Network Programming Guessing "
                        		+ "Game");
                System.out.println("-------------------");
                System.out.println();
                System.out.printf("%-28s%s\n", "Start Single Player Game", "A");
                System.out.printf("%-28s%s\n", "Start Multiplayer Game", "B");
                System.out.printf("%-28s%s\n", "Exit Game", "X");
                System.out.println();

                // prompt user to enter selection
                System.out.print("Enter selection: \'A\' to run Question 2a "
                        + "task or \'B\' to run Question 2b task or "
                        + "\'X\' to exit" + '\n');

                // set variable for menu input to input stream
                menuInput = mbr.readLine();

                System.out.println();

                /*
                 * validate selection input length and return a relevant 
                 * error message if invalid
                 */
                if (menuInput.length() != 1) {
                    System.out.println("Error - invalid selection!");
                } else {
                    // make selection "case insensitive"
                    selection = Character.toUpperCase(menuInput.charAt(0));
                    /*
                     * Begin system menu switch-case block
                     * process user's selection
                     */
                    switch (selection) {
                    case 'A':
                    	System.out.println("Welcome to the single player game");
                    	while(true) {
                   	        // generate random number
                    	
                            // establish threaded socket to server
                    	
                            // send number to server
                    		
                    		// userinput replies to server
                    	}                   		
                    case 'B':
                        System.out.println("Welcome to the multiplayer player game. "
								+ "please wait in the lobby for a game");
                    	while(true) {
                   	        
                           // generate random number
                    	
                           // establish threaded socket to server
                    	
                           // send number to server
                    		
                           // userinput replies to server
                    	}                 
                    /*
                     * Gracefully exists the menu and the app when the while
                     * condition stop is met.
                     */ 
                    case 'X':
                        System.out.println("Exiting the program ... Program"
                                + " closed");
                        break;

                    // Error message for default case as no valid presented
                    // options
                    // are selected
                    default:
                        System.out.println("Error - invalid selection!");
                    }
                }
                // Creates a line space after menu result.
                System.out.println();
            }
        }
        // close and flush the input stream
        finally {
            mbr.close();
        }

    }
}
