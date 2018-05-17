import java.util.Random;
/*
 * This class is responsible for handling game logic
 * tasks such as generating random numbers and
 * handling guesses to send to the server
 */
public class GameEngineClient {
    
    public static int clientRandom() {
        Random r = new Random();
        int Low = 3;
        int High = 8;
        int result = r.nextInt(High-Low) + Low;
        if(result == 3) {
            return result = 100;       	
        } else if (result == 4) {
            return result = 1000;  	
        } else if (result == 5) {
            return result = 10000;  	
        } else if (result == 6) {
            return result = 100000;  	
        } else if (result == 7) {
            return result = 1000000;  	
        } else {
            return result = 10000000;      	
        }
    } 	
}


