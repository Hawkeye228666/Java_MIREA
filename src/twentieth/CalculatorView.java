package twentieth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField inputField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton equalsButton;
    private JButton clearButton;

    public CalculatorView() {
        initComponents();
        setLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        inputField = new JTextField(20);
        inputField.setEditable(false);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new NumberButtonListener());
        }

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");
        for (JButton button : operatorButtons) {
            button.addActionListener(new OperatorButtonListener());
        }

        equalsButton = new JButton("=");
        equalsButton.addActionListener(new EqualsButtonListener());

        clearButton = new JButton("C");
        clearButton.addActionListener(new ClearButtonListener());
    }

    private void setLayout() {
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
        buttonPanel.add(numberButtons[7]);
        buttonPanel.add(numberButtons[8]);
        buttonPanel.add(numberButtons[9]);
        buttonPanel.add(operatorButtons[0]);
        buttonPanel.add(numberButtons[4]);
        buttonPanel.add(numberButtons[5]);
        buttonPanel.add(numberButtons[6]);
        buttonPanel.add(operatorButtons[1]);
        buttonPanel.add(numberButtons[1]);
        buttonPanel.add(numberButtons[2]);
        buttonPanel.add(numberButtons[3]);
        buttonPanel.add(operatorButtons[2]);
        buttonPanel.add(numberButtons[0]);
        buttonPanel.add(clearButton);
        buttonPanel.add(equalsButton);
        buttonPanel.add(operatorButtons[3]);

        setLayout(new BorderLayout());
        add(inputField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private class NumberButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            inputField.setText(inputField.getText() + source.getText());
        }
    }

    private class OperatorButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            inputField.setText(inputField.getText() + " " + source.getText() + " ");
        }
    }

    private class EqualsButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String expression = inputField.getText();
            String[] tokens = expression.split(" ");
            double result = RPNCalculator.evaluateRPN(tokens);
            inputField.setText(String.valueOf(result));
        }
    }

    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputField.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorView());
    }
}