package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class Game extends JFrame {
    private JTextField textField;
    int num = 3;
    int counter=0;
    public Game() {
        super("Test frame");
        setSize(250, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton button1 = new JButton("try");
        panel.add(button1);
        ActionListener actionListener = new TestActionListener();
        button1.addActionListener(actionListener);
        textField = new JTextField(5);
        panel.add(textField);
        textField.setToolTipText("введите число");

        add(panel);
    }

    public class TestActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (counter>=2){
                setEnabled(false);
            }
            JFrame jf = new JFrame();
            jf.setSize(0, 0);
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setVisible(true);
            String str = textField.getText();
            if (counter<=1) {
                if (num == Integer.parseInt(str)) {
                    JOptionPane.showMessageDialog(jf, "вы выиграли!");
                } else if (num > Integer.parseInt(str)) {
                    JOptionPane.showMessageDialog(jf,"искомое число больше введенного\n","warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(jf,"искомое число меньше введенного\n","warning",
                            JOptionPane.WARNING_MESSAGE);
                }
            } else {
                if (num == Integer.parseInt(str)) {
                    JOptionPane.showMessageDialog(jf,"вы выиграли!\n");
                } else{
                    JOptionPane.showMessageDialog(jf,"вы проиграли","error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            ++counter;
        }
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Game frame = new Game();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}

