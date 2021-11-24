import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener {

    // Variables et leur getter et setter

    private Color c;
    private ArrayList<Figure> list;
    private String nameFigure;
    private int x;
    private int y;

    public ArrayList<Figure> getList() {
        return list;
    }

    public void setC(Color color) {
        this.c = color;
    }

    public void setNameFigure(String n) {
        this.nameFigure = n;
    }

    // Constructeur de Drawing

    public Drawing() {
        addMouseListener(this);
        addMouseMotionListener(this);
        this.setBackground(Color.white);
        this.setC(Color.black);
        this.setNameFigure("Rectangle");
        this.list=new ArrayList<>();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    // Création d'une figure en appuyant sur l'écran en fixant son origine

    @Override
    public void mousePressed(MouseEvent e) {
        this.x=e.getX();
        this.y=e.getY();
        if (this.nameFigure=="Ellipse"){
            Ellipse f=new Ellipse(this.x,this.y,this.c);
            list.add(f);
        }
        if (this.nameFigure=="Rectangle"){
            Rectangle f=new Rectangle(this.x,this.y,this.c);
            list.add(f);
        }
        if (this.nameFigure=="Circle"){
            Circle f=new Circle(this.x,this.y,this.c);
            list.add(f);
        }
        if (this.nameFigure=="Square"){
            Square f=new Square(this.x,this.y,this.c);
            list.add(f);
        }
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

    //  Le fait de garder la souris enfoncée permet d'étirer la figure en la réactualisant à chaque fois

    @Override
    public void mouseDragged(MouseEvent e) {
        if (this.nameFigure=="Square"||this.nameFigure=="Circle") {
            if (e.getX() > this.x && e.getY() > this.y) {
                this.list.get(list.size() - 1).setBoundingBox(e.getX() - this.x, e.getY() - this.y);
            }
            if (e.getX() < this.x && e.getY() > this.y) {
                this.list.get(list.size() - 1).point.setX(this.x - Math.min(this.x - e.getX(), e.getY() - this.y));
                this.list.get(list.size() - 1).setBoundingBox(this.x - e.getX(), e.getY() - this.y);
            }
            if (e.getX() > this.x && e.getY() < this.y) {
                this.list.get(list.size() - 1).point.setY(this.y - Math.min(e.getX() - this.x, this.y - e.getY()));
                this.list.get(list.size() - 1).setBoundingBox(e.getX() - this.x, this.y - e.getY());
            }
            if (e.getX() < this.x && e.getY() < this.y) {
                this.list.get(list.size() - 1).point.setX(this.x - Math.min(this.x - e.getX(), this.y - e.getY()));
                this.list.get(list.size() - 1).point.setY(this.y - Math.min(this.x - e.getX(), this.y - e.getY()));
                this.list.get(list.size() - 1).setBoundingBox(this.x - e.getX(), this.y - e.getY());
            }
        }
        else {
            if (e.getX() > this.x && e.getY() > this.y) {
                this.list.get(list.size() - 1).setBoundingBox(e.getX() - this.x, e.getY() - this.y);
            }
            if (e.getX() < this.x && e.getY() > this.y) {
                this.list.get(list.size() - 1).point.setX(e.getX());
                this.list.get(list.size() - 1).setBoundingBox(this.x - e.getX(), e.getY() - this.y);
            }
            if (e.getX() > this.x && e.getY() < this.y) {
                this.list.get(list.size() - 1).point.setY(e.getY());
                this.list.get(list.size() - 1).setBoundingBox(e.getX() - this.x, this.y - e.getY());
            }
            if (e.getX() < this.x && e.getY() < this.y) {
                this.list.get(list.size() - 1).point.setX(e.getX());
                this.list.get(list.size() - 1).point.setY(e.getY());
                this.list.get(list.size() - 1).setBoundingBox(this.x - e.getX(), this.y - e.getY());
            }
        }
        this.repaint();
    }





    @Override
    public void mouseMoved(MouseEvent e) {

    }

    // Parcours la liste de figure pour les redessiner

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(Figure f : this.list){
            f.draw(g);
        }
    }

    // Permet de reset le dessin

    public void reset(){
        this.list=new ArrayList<>();
        this.repaint();
    }

    // Enregistre la liste de figures

    public void saveDrawing(){
        try{
            FileOutputStream fos = new FileOutputStream("monDessin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(this.list.size());
            for(Figure f : this.list){
                oos.writeObject(f);
            }
            oos.close();
        }
        catch (Exception e){
            System.out.println("Erreur");
        }
    }
}
