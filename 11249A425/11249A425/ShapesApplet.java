

import java.applet.Applet;
import java.awt.*;

public class ShapesApplet {
    public void paint(Graphics g) {
        g.drawRect(30, 50, 100, 60);       
        g.drawOval(160, 50, 80, 80);       
        g.drawLine(280, 50, 380, 120);     

        int x[] = {100, 50, 150};
        int y[] = {180, 260, 260};

        g.drawPolygon(x, y, 3);
    }
}
