import java.awt.*;

public abstract class Figure {

    // Variables et leur getter

    public Color getC() {
        return color;
    }

    protected Color color;

    public Point getPoint() {
        return point;
    }

    protected Point point;

    // Constructeurs de Figure

    public Figure(){
        this.point= new Point();
        this.color= Color.white;
    }

    public Figure(Point point,Color color){
        this.point= point;
        this.color= color;
    }

    // Défintion des fonctions abstractes

    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void draw (Graphics g);

    public abstract float getPerimeter();

    public abstract float getSurface();

    // Affichage

    @Override
    public String toString() {
        return "La figure est "+color+" avec comme origine : "+this.point;
    }
}

