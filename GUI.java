import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class GUI implements ActionListener {
    int count = 0;
    JLabel label;
    // JLabel label2;
    JFrame frame;
    JPanel panel;

    public GUI() {
        frame = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("click me");
        label = new JLabel("Number of clicks : 0");
        // label2 = new JLabel("Login");

        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        // panel.add(label2);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("OUR GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        count++;
        label.setText("Number of clicks ;" + count);

    }
}
