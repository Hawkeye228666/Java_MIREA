import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MatchView extends JFrame {
    private JLabel lblResult = new JLabel("Result: 0 X 0");
    private JLabel lblLastScorer = new JLabel("Last Scorer: N/A");
    private JLabel lblWinner = new JLabel("Winner: DRAW");
    private JButton btnMilan = new JButton("AC Milan");
    private JButton btnMadrid = new JButton("Real Madrid");
    private JPanel panel = new JPanel();

    public MatchView() {
        panel.setLayout(new GridLayout(3, 1));
        panel.add(lblResult);
        panel.add(lblLastScorer);
        panel.add(lblWinner);

        this.getContentPane().add(panel, BorderLayout.CENTER);
        this.getContentPane().add(btnMilan, BorderLayout.WEST);
        this.getContentPane().add(btnMadrid, BorderLayout.EAST);
        this.pack();
        this.setTitle("Milan vs Madrid");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setResult(int milanScore, int madridScore) {
        lblResult.setText("Result: " + milanScore + " X " + madridScore);
    }

    public void setLastScorer(String team) {
        lblLastScorer.setText("Last Scorer: " + team);
    }

    public void setWinner(String team) {
        lblWinner.setText("Winner: " + team);
    }

    public void addMilanListener(ActionListener listener) {
        btnMilan.addActionListener(listener);
    }

    public void addMadridListener(ActionListener listener) {
        btnMadrid.addActionListener(listener);
    }
}
