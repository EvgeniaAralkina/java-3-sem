package pr21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class Frame extends JFrame {

    Random rand = new Random();
    Student_0 students[] = new Student[5]; //интерфейсная ссылка
    int iDNumber[] = new int[10];
    int id;
    SortingStudentsByGPA sort = new SortingStudentsByGPA();

    String names[] = {"John", "Mike", "Lisa", "Kate", "Nick"};
    String names2[] = {"Williams", "Miller", "Martinez", "Moore", "Hall"};

    JPanel panel, panel1, panel2, panel3, panel4,panel5;
    JTextField panelText;
    JLabel panelL1,panelL2,panelL3,panelL4,panelL5;

    public Frame() {

        super("window");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        createGUI();
        for (int i = 0; i < 5; ++i) {
            id = rand.nextInt(1000) + 1000 + rand.nextInt(1000) + 1000;
            iDNumber[i] = id;
            students[i] = new Student(id, names[rand.nextInt(5)] + " " + names2[rand.nextInt(5)], rand.nextInt(5) + 1, rand.nextInt(5) + 1, rand.nextInt(5) + 1);
        }
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel(new GridLayout(0, 1, 5, 12));
        JPanel panelB = new JPanel(new FlowLayout());
        JButton button1 = new JButton("show students");
        JButton button2 = new JButton("sort by GPA");
        JButton button3 = new JButton("sort by id");
        JButton button4 = new JButton("search name");
        panelB.add(button1);
        panelB.add(button2);
        panelB.add(button3);
        panelB.add(button4);
        panel.add(panelB);
        ActionListener A = new Frame.TestActionListenerA();
        ActionListener B = new Frame.TestActionListenerB();
        ActionListener C = new Frame.TestActionListenerC();
        ActionListener D = new Frame.TestActionListenerD();
        button1.addActionListener(A);
        button2.addActionListener(B);
        button3.addActionListener(C);
        button4.addActionListener(D);


        String word2="";
        panel1 = new JPanel(new GridLayout(0, 1, 5, 12));
        panelL1 = new JLabel(word2);
        panel1.add(panelL1);
        panelL2 = new JLabel(word2);
        panel1.add(panelL2);
        panelL3 = new JLabel(word2);
        panel1.add(panelL3);
        panelL4 = new JLabel(word2);
        panel1.add(panelL4);
        panelL5 = new JLabel(word2);
        panel1.add(panelL5);
        panel.add(panel1);

        panelText = new JTextField(20);
        panel.add(panelText);
        add(panel);
        setVisible(true);

    }
    public class TestActionListenerA implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            panel1.remove(panelL1);
            panel1.remove(panelL2);
            panel1.remove(panelL3);
            panel1.remove(panelL4);
            panel1.remove(panelL5);
            panel.remove(panel1);
            panelL1 = new JLabel(students[0].toString());
            panelL2 = new JLabel(students[1].toString());
            panelL3 = new JLabel(students[2].toString());
            panelL4 = new JLabel(students[3].toString());
            panelL5 = new JLabel(students[4].toString());
            panel1.add(panelL1);
            panel1.add(panelL2);
            panel1.add(panelL3);
            panel1.add(panelL4);
            panel1.add(panelL5);
            panel.add(panel1);
            revalidate();
            repaint();
        }
    }
    public class TestActionListenerB implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sort.mergeSort(students, 0, 4);
        }
    }
    public class TestActionListenerC implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            sort.quickSort(students, 0, 4);
        }
    }
    public class TestActionListenerD implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String str = panelText.getText();
            int i = sort.linearSearch(students, str);
            if (i>=0){
                JFrame jf = new JFrame();
                jf.setSize(10, 10);
                jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(jf,students[i].toString());
            }
        }
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Frame frame = new Frame();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
