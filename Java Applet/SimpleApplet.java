import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
     */
     public class SimpleApplet extends Applet {
       public void paint(Graphics g) {
         g.drawString("A Simple Applet", 20, 20);
       }
}
