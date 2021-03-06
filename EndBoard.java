import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class EndBoard extends JPanel {
    private boolean restarted;
    private boolean ended;
    private JButton restartButton;
    private JButton endButton;
    private JTextField textField;
    private ScoreBoard scoreBoard;
    private double score;

    public EndBoard(ScoreBoard board, double score) {
        this.score = score;
        scoreBoard = board;
        setSize(BoardFrame.DIMENSION);
        restarted = false;
        restartButton = new JButton("Press Button to Restart!");
        endButton = new JButton("Press to End!");
        textField = new JTextField("Name", 20);
        add(restartButton);
        add(endButton);
        add(textField);
        restartButton.setActionCommand("restart");
        endButton.setActionCommand("end");
        textField.setActionCommand("text inputted");
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        scoreBoard.drawScores(g, 500, 250);
        g.drawString("Your Score: " + ((int)(score * 10) / 10.0), 300, 25);
    }

    public boolean isRestarted() {
        return restarted;
    }

    public boolean isEnded() {
        return ended;
    }

    public JButton getRestartButton() {
        return restartButton;
    }

    public JButton getEndButton() {
        return endButton;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void changeRestarted(boolean a) {
        restarted = a;
    }

    public void changeEnded(boolean a) {
        ended = a;
    }
}
