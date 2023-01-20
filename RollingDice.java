// import java.util.Random;
// import java.awt.LayoutManager;
import java.awt.*;
// import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RollingDice {

    public RollingDice() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");

        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our Roll");
        frame.pack();
        frame.setVisible(true);
    }

public static void main(String[] args) {

    new RollingDice();

    // Random rand = new Random();
    // int x = rand.nextInt(6) + 1;

    // System.out.println("You rolled a: " + x);
   }
}