import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener {

    private static Color c;
    private static ArrayList<Figure> list;
    private static String nameFigure;
    private int x;
    private int y;



    public ArrayList<Figure> getList() {
        return list;
    }

    public static void setC(Color color) {
        c = color;
    }

    public static void setNameFigure(String n) {
        nameFigure = n;
    }

    public Drawing() {
        this.setBackground(Color.white);
        this.setC(Color.black);
        this.setNameFigure("Rectangle");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
