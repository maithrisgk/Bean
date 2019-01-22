package colours;
import java.awt.*;
import java.awt.event.*;
public final class colors extends Canvas{
    transient private Color color;
    private boolean rectangular;
    public colors()
    {
        addMouseListener(new MouseAdapter()
        {
            public void mousePressed(MouseEvent me)
            {
                change();
            } });
        rectangular=false;
        setSize(200,100);
        change();
    }
    public boolean getRectangular(boolean flag)
    {
        this.rectangular=flag;
        repaint();
        return rectangular;    }
    public void change()
    {
        color=randomColor();
        repaint();
    }
    public Color randomColor()
    {
        int r=(int)(255*Math.random());
        int g=(int)(255*Math.random());
        int b=(int)(255*Math.random());
        return new Color(r,g,b);
    }
    public void paint(Graphics g)
    {
        Dimension d= getSize();
        int h=d.height;
        int w=d.width;
        g.setColor(color);
        if(rectangular)
        {
            g.fillRect(0, 0, w-1, h-1);    }
        else
        {
            g.fillOval(0,0,w-1,h-1);
        }  }  }
