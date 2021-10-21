import java.awt.*;

public class Rectangle extends Figure{

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int length;

    private int width;

    public void setBoundingBox(int heightBB, int widthBB){
        this.setLength(heightBB);
        this.setWidth(widthBB);
    }

    public Rectangle (int px, int py, Color c){
        this.point=new Point(px,py);
        this.color=c;
        this.length=0;
        this.width=0;
    }

    public void draw (Graphics g){
        
    }

}
