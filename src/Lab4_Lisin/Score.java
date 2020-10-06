package Lab4_Lisin;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame {
    JButton firstTeam = new JButton("AC Millan");
    JButton secondTeam = new JButton("Real Madrid");
    JLabel score = new JLabel("");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel Goal_Score = new JLabel("Last Player scored a goal: N/A");
    JLabel Assist_to_Score = new JLabel("Assist to goal: N/A");
    Label winner = new Label("Winner: DRAW");

    private int scoreFirstTeam = 0;
    private int scoreSecondTeam = 0;

    public Score() {
        super("Football Manager 2020");
        setLayout(null);
        Font fontForScore = new Font("Impact", Font.PLAIN, 28);

        firstTeam.setBounds(20, 200, 150, 20);
        secondTeam.setBounds(310, 200, 150, 20);
        score.setBounds(200,50,100,40);
        score.setText(scoreFirstTeam + " : " + scoreSecondTeam);
        score.setFont(fontForScore);
        winner.setBounds(110,10,300,25);
        winner.setFont(fontForScore);
        lastScorer.setBounds(165,90,150,20);
        Goal_Score.setBounds(135,120, 500,20);
        Assist_to_Score.setBounds(165,150,500,20);

        add(firstTeam);
        add(secondTeam);
        add(score);
        add(lastScorer);
        add(Goal_Score);
        add(Assist_to_Score);
        add(winner);

        firstTeam.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                scoreFirstTeam++;
                score.setText(scoreFirstTeam + " : " + scoreSecondTeam);
                lastScorer.setText("Last Scorer: AC Millan");
                Goal_Score.setText("Last Player scored a goal: Andriy Shevchenko");
                Assist_to_Score.setText("Assist to goal: Filippo Inzaghi");
                winnerUpdate();

            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });

        secondTeam.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                scoreSecondTeam++;
                score.setText(scoreFirstTeam + " : " + scoreSecondTeam);
                lastScorer.setText("Last Scorer: Real Madrid");
                Goal_Score.setText("Last Player scored a goal: Zinedin Zidan");
                Assist_to_Score.setText("Assist to goal: David Beckham");
                winnerUpdate();
            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });

        setSize(500, 300);
    }

    private void winnerUpdate() {
        if (scoreFirstTeam > scoreSecondTeam) {
            winner.setText("Winner: AC Millan");
        } else if (scoreFirstTeam < scoreSecondTeam) {
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new Score().setVisible(true);
    }
}
