import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberCounter extends JFrame {

    private JPanel pnlMain;
    private JButton decreaseButton;
    private JButton increaseButton;
    private JLabel countLabel;

    private int counter;

    public NumberCounter() {
        counter = 0;

        increaseButton.setPreferredSize(new Dimension(120, 40));
        decreaseButton.setPreferredSize(new Dimension(120, 40));

        pnlMain.setPreferredSize(new Dimension(400, 300));

        increaseButton.setName("increaseButton");
        decreaseButton.setName("decreaseButton");
        countLabel.setName("countLabel");

        countLabel.setText(String.valueOf(counter));

        increaseButton.addActionListener(e -> {
            counter++;
            countLabel.setText(String.valueOf(counter));
        });

        decreaseButton.addActionListener(e -> {
            counter--;
            countLabel.setText(String.valueOf(counter));
        });
    }

    static void main(String[] args) {
        JFrame frame = new JFrame("Number Counter");

        NumberCounter counter = new NumberCounter();

        frame.setContentPane(counter.pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
