import java.applet.Applet;
import java.awt.*;


/*
<APPLET
CODE=AppletDemo.class
WIDTH="200"
HEIGTH="200">
</APPLET>
*/

public class AppletDemo extends JApplet
{
	public void paint(Graphics g){
	g.drawString("Java Applet Demo!!!!!",60,100);
	}
}