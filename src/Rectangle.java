import java.awt.*;

public class Rectangle extends Figure{

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    protected int length;

    protected int width;

    public void setBoundingBox(int heightBB, int widthBB){
        this.setLength(heightBB);
        this.setWidth(widthBB);
    }

    public Rectangle (){
        this.point=new Point();
        this.color=Color.white;
        this.length=0;
        this.width=0;
    }

    public Rectangle (int px, int py, Color c){
        this.point=new Point(px,py);
        this.color=c;
        this.length=0;
        this.width=0;
    }

    public void draw (Graphics g){
        g.setColor(this.getC());
        g.fillRect(this.getPoint().getX(),this.getPoint().getY(),this.getLength(),this.getWidth());
    }

    @Override
    public String toString() {
        return "Ce rectangle est de couleur " + this.getC() + " avec comme origine " + this.point + " de largeur " + this.width + " et de longueur " + this.length;
    }

    public static void main(String[] args){
        Rectangle a=null;
        a=new Rectangle(1,2,Color.white);
        System.out.println(a.toString());
        a.setBoundingBox(3,4);
        System.out.println(a.toString());

    }

}
