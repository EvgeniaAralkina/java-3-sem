package pr18;
import javax.swing.*;
import java.awt.*;

public class Pic extends JFrame {
int n;
    Pic(int n) {
        super("window");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        this.n=n;
    }
    public void paint(Graphics g) {
        String str;
        str = "i" + n + ".jpg";
        Image img = new ImageIcon(str).getImage();
        g.drawImage(img, 0, 0, 300, 400, null);
    }

}
