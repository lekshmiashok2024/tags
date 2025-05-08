import java.applet.Applet;
import java.awt.*;
public class ShapeApplet extends Applet
{
  public void paint(Graphics g)
  {
    g.setColor(Color.red);
    g.drawRect(50, 50, 100, 60);
    g.setColor(Color.red);
    g.drawOval(200, 50, 60, 60);
    g.setColor(Color.red);
    g.drawLine(50, 150, 200, 150);
  }
}
