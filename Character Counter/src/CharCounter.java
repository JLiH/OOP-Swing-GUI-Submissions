import javax.swing.*;
import java.awt.*;

public class CharCounter extends JFrame{
    private JPanel pnlMain;
    private JTextArea messageTextArea;
    private JButton btnCount;
    private JTextField messageTextField;
    private JLabel lblCount;

    private int counter;

    public CharCounter() {
        messageTextArea.setName("messageTextArea");
        messageTextField.setName("messageTextField");
        btnCount.setName("countButton");
        lblCount.setName("countLabel");

        pnlMain.setPreferredSize(new Dimension(400, 300));
        messageTextField.setPreferredSize(new Dimension(50, -1));
        messageTextField.setMaximumSize(new Dimension(100, -1));

        btnCount.addActionListener(e -> {
            for (int i = 0; i < messageTextArea.getText().length(); i++) {
                if (messageTextArea.getText().charAt(i) == messageTextField.getText().charAt(0)) {
                    counter++;
                }
            }

            lblCount.setText(String.valueOf(counter));
            counter = 0;
        });

    }

    static void main() {
        JFrame frame = new JFrame("Character Counter");

        CharCounter charCount = new CharCounter();

        frame.setContentPane(charCount.pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
