import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MatchController {
    private MatchView view;
    private MatchModel model;

    public MatchController(MatchView view, MatchModel model) {
        this.view = view;
        this.model = model;

        view.addMilanListener(new MilanListener());
        view.addMadridListener(new MadridListener());
    }

    class MilanListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.milanScores();
            view.setResult(model.getMilanScore(), model.getMadridScore());
            view.setLastScorer("AC Milan");
            view.setWinner(model.getWinner());
        }
    }

    class MadridListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.madridScores();
            view.setResult(model.getMilanScore(), model.getMadridScore());
            view.setLastScorer("Real Madrid");
            view.setWinner(model.getWinner());
        }
    }
}
