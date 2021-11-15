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
        addMouseListener(this);
        this.setBackground(Color.white);
        this.setC(Color.black);
        this.setNameFigure("Rectangle");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.x=e.getX();
        this.y=e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (this.nameFigure=="Ellipse"){
            Ellipse f=new Ellipse(this.x,this.y,this.c);
            f.setBoundingBox(e.getX()-this.x,e.getY()-this.y);
            Graphics g=getGraphics();
            f.draw(g);}
        if (this.nameFigure=="Rectangle"){
            Rectangle f=new Rectangle(this.x,this.y,this.c);
            f.setBoundingBox(e.getX()-this.x,e.getY()-this.y);
            Graphics g=getGraphics();
            f.draw(g);}
        if (this.nameFigure=="Circle"){
            Circle f=new Circle(this.x,this.y,this.c);
            f.setBoundingBox(e.getX()-this.x,e.getY()-this.y);
            Graphics g=getGraphics();
            f.draw(g);}
        if (this.nameFigure=="Square"){
            Square f=new Square(this.x,this.y,this.c);
            f.setBoundingBox(e.getX()-this.x,e.getY()-this.y);
            Graphics g=getGraphics();
            f.draw(g);}
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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void reset(){
        this.list=null;
    }
}
