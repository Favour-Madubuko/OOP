import java.util.Scanner;
public class TheStones{
    public static void main (String[] args){
        System.out.println("Welcome to the stones games");
        System.out.println("Please enter a starting number");
        System.out.println("The number of stones must be positive and odd");
        Scanner keyboard = new Scanner(System.in);
        int numOfStones = keyboard.nextInt();

        while (!
                ((numOfStones > 0)  &&
                (numOfStones % 2 == 1)
                )) {
                    System.out.println("You have entered an invalid number");
                    System.out.println("Please enter a number that is positive and odd");
                    numOfStones = keyboard.nextInt();

                }

                //Player names
                System.out.println("Player 1, please enter your name");
                String p1Name = keyboard.next();
                Player player1 = new Player(p1Name);

                System.out.println("Player 2, please enter your name");
                String p2Name = keyboard.next();
                Player player2 = new Player(p2Name);

                // Ask for stones
                int inputStones = 0;


    }
}