import java.awt.*;

public abstract class Figure {

    public Color getC() {
        return color;
    }

    protected Color color;

    public Point getPoint() {
        return point;
    }

    protected Point point;

    public Figure(){
        this.point= new Point();
        this.color= Color.white;
    }

    public Figure(Point point,Color color){
        this.point= point;
        this.color= color;
    }

    public abstract void setBoundingBox(int heightBB, int widthBB);

    public abstract void draw (Graphics g);

    @Override
    public String toString() {
        return "La figure est "+this.color+" avec comme origine : "+this.point;
    }
}

