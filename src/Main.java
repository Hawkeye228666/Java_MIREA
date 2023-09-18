import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MatchView view = new MatchView();
        MatchModel model = new MatchModel();
        MatchController controller = new MatchController(view, model);
        view.setVisible(true);
    }
}