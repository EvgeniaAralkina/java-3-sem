package lab12;

import lab11.Game;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Frame extends JFrame {
    private JTextField textField;
    private Planet planet;

    public Frame() {
        super("Planets");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu planets = new JMenu("Planets");
        JMenuItem mer = new JMenuItem("Mercury");
        planets.add(mer);
        JMenuItem ven = new JMenuItem("Venus");
        planets.add(ven);
        JMenuItem ear = new JMenuItem("Earth");
        planets.add(ear);
        JMenuItem mar = new JMenuItem("Mars");
        planets.add(mar);
        JMenuItem jup = new JMenuItem("Jupiter");
        planets.add(jup);
        JMenuItem sat = new JMenuItem("Saturn");
        planets.add(sat);
        JMenuItem ur = new JMenuItem("Uranus");
        planets.add(ur);
        JMenuItem nep = new JMenuItem("Neptune");
        planets.add(nep);
        menuBar.add(planets);
        setJMenuBar(menuBar);

        mer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                planet = Planet.MERCURY;
            }
        });

        ven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                planet = Planet.VENUS;
            }
        });

        ear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                planet = Planet.EARTH;
            }
        });

        mar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                planet = Planet.MARS;
            }
        });

        jup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                planet = Planet.JUPITER;
            }
        });

        sat.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                planet = Planet.SATURN;
            }
        });

        ur.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                planet = Planet.URANUS;
            }
        });

        nep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                planet = Planet.NEPTUNE;
            }
        });

        JLabel centerLabel = new JLabel("Выберите планету и введите свою массу");
        centerLabel.setVerticalAlignment(JLabel.CENTER);
        centerLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(centerLabel);
        JButton button1 = new JButton("ok");
        panel.add(button1);

        textField = new JTextField(10);
        panel.add(textField);

        add(panel);
        ActionListener actionListener = new Frame.TestActionListener();
        button1.addActionListener(actionListener);



        /*Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Test Connection");
        alert.setHeaderText("Results:");
        alert.setContentText("Connect to the database successfully!");

        alert.showAndWait();*/

    }



    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame jf = new JFrame();
            jf.setSize(10, 10);
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
            jf.setVisible(true);
            String str = textField.getText();
            double dd = ((6.67*Math.pow(10,-11) * (planet.getM()) )/Math.pow(planet.getR()*1000,2))*(Double.parseDouble(str));
            JOptionPane.showMessageDialog(jf,"Ваш вес на планете "+planet.getName()+": "+Math.round(dd)+" H");
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
