import java.util.*;
public class numberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        boolean playagain = true ;
        while(playagain){
            int upperBound = 100;
            int lowerBound = 1;
            int randomNumber = random.nextInt(upperBound)+1;
            int maxAttemps = 10;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess the number between " + lowerBound + " and " + upperBound + " . Your attempts left are " + (maxAttemps-attempts));

            while(attempts < maxAttemps && !hasGuessedCorrectly){
                System.out.println("Enter your guess between " + lowerBound + " and " + upperBound+ ":");
                int userguess = sc.nextInt();
                attempts++;
                if(randomNumber == userguess){
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations you have guessed corectly. You won the game.");
                }
                else if(userguess < randomNumber){
                    System.out.println("Too low");
                }
                else if(userguess > randomNumber){
                    System.out.println("Too high");
                }
            }
            if(!hasGuessedCorrectly){
                System.out.println("You've used all your attempts. The correct number was " + randomNumber + ".");
            }
            System.out.println("Do you want to play again? (yes or no): ");
            String userResponse = sc.next();
            playagain = userResponse.equalsIgnoreCase("yes");
        }
        System.out.println("Thank you for playing! Goodbye.");
        sc.close();
    }
}
