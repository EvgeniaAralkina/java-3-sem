package pr18;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Game {

    public static class Frame extends JFrame {
        int n = 2;
        char[] word = {'H', 'E', 'A', 'D'};
        int kolWord = 4;
        char[] word1 = {'_', '_', '_', '_'};
        JPanel panel;
        JPanel p;
        JLabel t5;

        public Frame() {
            super("gallows");
            setSize(500, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            createGUI();
        }

        public void createGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            panel = new JPanel(new GridLayout(0, 1, 5, 12));

            JPanel panelText = new JPanel(new FlowLayout());

            JLabel t = new JLabel("Выберите букву, чтобы угадать слово. Если буква есть в слове, то она");
            JLabel t1 = new JLabel("появится на своём месте в слове (если таких букв несколько — то");
            JLabel t2 = new JLabel("вписываются все), а если нет — то он появится один элемент виселицы.");
            JLabel t3 = new JLabel("Если вы не успели угадать слово раньше, чем виселица ");
            JLabel t4 = new JLabel("нарисована полностью, то вы считаетесь  «повешенным»");
            panelText.add(t);
            panelText.add(t1);
            panelText.add(t2);
            panelText.add(t3);
            panelText.add(t4);

            panel.add(panelText);

            JPanel panelB = new JPanel(new FlowLayout());
            JButton[] buttons = new JButton[26];
            char ch = 65;
            for (int i = 0; i < 26; i++) {
                buttons[i] = new JButton(Character.toString(ch + i));
                panelB.add(buttons[i]);
            }
            panel.add(panelB);

            {
                ActionListener A = new Frame.TestActionListenerA();
                ActionListener B = new Frame.TestActionListenerB();
                ActionListener C = new Frame.TestActionListenerC();
                ActionListener D = new Frame.TestActionListenerD();
                ActionListener E = new Frame.TestActionListenerE();
                ActionListener F = new Frame.TestActionListenerF();
                ActionListener G = new Frame.TestActionListenerG();
                ActionListener H = new Frame.TestActionListenerH();
                ActionListener I = new Frame.TestActionListenerI();
                ActionListener J = new Frame.TestActionListenerJ();
                ActionListener K = new Frame.TestActionListenerK();
                ActionListener L = new Frame.TestActionListenerL();
                ActionListener M = new Frame.TestActionListenerM();
                ActionListener N = new Frame.TestActionListenerN();
                ActionListener O = new Frame.TestActionListenerO();
                ActionListener P = new Frame.TestActionListenerP();
                ActionListener Q = new Frame.TestActionListenerQ();
                ActionListener R = new Frame.TestActionListenerR();
                ActionListener S = new Frame.TestActionListenerS();
                ActionListener T = new Frame.TestActionListenerT();
                ActionListener U = new Frame.TestActionListenerU();
                ActionListener V = new Frame.TestActionListenerV();
                ActionListener W = new Frame.TestActionListenerW();
                ActionListener X = new Frame.TestActionListenerX();
                ActionListener Y = new Frame.TestActionListenerY();
                ActionListener Z = new Frame.TestActionListenerZ();

                buttons[0].addActionListener(A);
                buttons[1].addActionListener(B);
                buttons[2].addActionListener(C);
                buttons[3].addActionListener(D);
                buttons[4].addActionListener(E);
                buttons[5].addActionListener(F);
                buttons[6].addActionListener(G);
                buttons[7].addActionListener(H);
                buttons[8].addActionListener(I);
                buttons[9].addActionListener(J);
                buttons[10].addActionListener(K);
                buttons[11].addActionListener(L);
                buttons[12].addActionListener(M);
                buttons[13].addActionListener(N);
                buttons[14].addActionListener(O);
                buttons[15].addActionListener(P);
                buttons[16].addActionListener(Q);
                buttons[17].addActionListener(R);
                buttons[18].addActionListener(S);
                buttons[19].addActionListener(T);
                buttons[20].addActionListener(U);
                buttons[21].addActionListener(V);
                buttons[22].addActionListener(W);
                buttons[23].addActionListener(X);
                buttons[24].addActionListener(Y);
                buttons[25].addActionListener(Z);
            }

            String word2 = "";
            for (char i : word1) {
                word2 += Character.toString(i) + " ";
            }

            p = new JPanel(new FlowLayout());
            t5 = new JLabel(word2);
            p.add(t5);
            panel.add(p);
            add(panel);
            setVisible(true);
        }

        public void BotAction(char ch) {
            int kol = 0;
            for (int i = 0; i < word.length; i++) {
                if (word[i] == ch) {
                    kol++;
                    p.remove(t5);
                    panel.remove(p);
                    word1[i] = ch;
                    word[i] = '_';
                    kolWord--;
                    String word2 = "";
                    for (char j : word1) {
                        word2 += Character.toString(j) + " ";
                    }
                    t5 = new JLabel(word2);
                    p.add(t5);
                    panel.add(p);
                    revalidate();
                    repaint();
                }
            }
            if (kolWord == 0)
                JOptionPane.showMessageDialog(getContentPane(), "Вы выиграли!");
            if (kol == 0) {
                Graphics g = new Graphics() {
                    @Override
                    public Graphics create() {
                        return null;
                    }

                    @Override
                    public void translate(int x, int y) {

                    }

                    @Override
                    public Color getColor() {
                        return null;
                    }

                    @Override
                    public void setColor(Color c) {

                    }

                    @Override
                    public void setPaintMode() {

                    }

                    @Override
                    public void setXORMode(Color c1) {

                    }

                    @Override
                    public Font getFont() {
                        return null;
                    }

                    @Override
                    public void setFont(Font font) {

                    }

                    @Override
                    public FontMetrics getFontMetrics(Font f) {
                        return null;
                    }

                    @Override
                    public Rectangle getClipBounds() {
                        return null;
                    }

                    @Override
                    public void clipRect(int x, int y, int width, int height) {

                    }

                    @Override
                    public void setClip(int x, int y, int width, int height) {

                    }

                    @Override
                    public Shape getClip() {
                        return null;
                    }

                    @Override
                    public void setClip(Shape clip) {

                    }

                    @Override
                    public void copyArea(int x, int y, int width, int height, int dx, int dy) {

                    }

                    @Override
                    public void drawLine(int x1, int y1, int x2, int y2) {

                    }

                    @Override
                    public void fillRect(int x, int y, int width, int height) {

                    }

                    @Override
                    public void clearRect(int x, int y, int width, int height) {

                    }

                    @Override
                    public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

                    }

                    @Override
                    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

                    }

                    @Override
                    public void drawOval(int x, int y, int width, int height) {

                    }

                    @Override
                    public void fillOval(int x, int y, int width, int height) {

                    }

                    @Override
                    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

                    }

                    @Override
                    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

                    }

                    @Override
                    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

                    }

                    @Override
                    public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {

                    }

                    @Override
                    public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {

                    }

                    @Override
                    public void drawString(String str, int x, int y) {

                    }

                    @Override
                    public void drawString(AttributedCharacterIterator iterator, int x, int y) {

                    }

                    @Override
                    public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
                        return false;
                    }

                    @Override
                    public void dispose() {

                    }
                };
                JFrame pic = new Pic(n);
                n++;
            }
            if (n > 10)
                JOptionPane.showMessageDialog(getContentPane(), "Вас повесили...");
        }

            public class TestActionListenerA implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('A');
                }
            }
            public class TestActionListenerB implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('B');
                }
            }
            public class TestActionListenerC implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('C');
                }
            }
            public class TestActionListenerD implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('D');
                }
            }
            public class TestActionListenerE implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('E');
                }
            }
            public class TestActionListenerF implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('F');
                }
            }
            public class TestActionListenerG implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('G');
                }
            }
            public class TestActionListenerH implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('H');
                }
            }
            public class TestActionListenerI implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('I');
                }
            }
            public class TestActionListenerJ implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('J');
                }
            }
            public class TestActionListenerK implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('K');
                }
            }
            public class TestActionListenerL implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('L');
                }
            }
            public class TestActionListenerM implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('M');
                }
            }
            public class TestActionListenerN implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('N');
                }
            }
            public class TestActionListenerO implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('O');
                }
            }
            public class TestActionListenerP implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('P');
                }
            }
            public class TestActionListenerQ implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('Q');
                }
            }
            public class TestActionListenerR implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('R');
                }
            }
            public class TestActionListenerS implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('S');
                }
            }
            public class TestActionListenerT implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('T');
                }
            }
            public class TestActionListenerU implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('U');
                }
            }
            public class TestActionListenerV implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('V');
                }
            }
            public class TestActionListenerW implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('W');
                }
            }
            public class TestActionListenerX implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('X');
                }
            }
            public class TestActionListenerY implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('Y');
                }
            }
            public class TestActionListenerZ implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    BotAction('Z');
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
