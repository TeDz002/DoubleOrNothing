import java.util.Scanner;

public class DoubleOrNothing {
    private int points = 10;
    private boolean playing = true;
    private final Scanner sc = new Scanner(System.in);

    public void playGame() {
        System.out.println("Welcome to Double or Nothing!");

        while (playing) {
            System.out.printf("Current points = %d\nPlay? (y/n) ", points);
            String input = sc.nextLine();

            if (input.equals("y") && Math.random() > 0.5) {
                points*=2;
            } else if (input.equals("y") && Math.random() < 0.5) {
                System.out.printf("\nYOU LOST!!!\n\nFinal points: %d", points);
                endGame();
            } else {
                System.out.printf("\nYou quit!\n\nFinal points: %d", points);
                endGame();
            }
        }
    }

    public void endGame() {
        playing = false;
    }
}