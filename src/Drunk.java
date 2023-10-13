import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Drunk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> player1 = new LinkedList<>();
        Queue<Integer> player2 = new LinkedList<>();
        String first, second;
        first = in.nextLine();
        second = in.nextLine();
        for (int i = 0; i < 5; i++) {
                player1.add(i);
        }
        for (int i = 0; i < 5; i++) {
            player2.add(i);
        }
        int round = 1;
        while (!player1.isEmpty() && !player2.isEmpty()) {
            if (player1.peek() > player2.peek() || (player1.peek() == 0 && player2.peek() == 9)) {

                player1.add(player1.remove());
                player1.add(player2.remove());
            } else if (player2.peek() > player1.peek() || (player2.peek() == 0 && player1.peek() == 9)) {
                player2.add(player1.remove());
                player2.add(player2.remove());
            } else {
                player1.remove();
                player2.remove();
            }
            round++;
        }
        if (player1.isEmpty()) { System.out.println("Player 2 wins the game at the end of " + round + "th round!");
        } else { System.out.println("Player 1 wins the game at the end of " + round + "th round!" );
        }
    }
}

