import java.awt.*;

public class Ellipse extends Figure{


    private int semiAxysX;

    public void setSemiAxysX(int semiAxysX) {
        this.semiAxysX = semiAxysX;
    }

    public void setSemiAxysY(int semiAxysY) {
        this.semiAxysY = semiAxysY;
    }

    private int semiAxysY;

    public void setBoundingBox(int heightBB, int widthBB){
        this.setSemiAxysX(heightBB);
        this.setSemiAxysY(widthBB);
    }

    public Ellipse (int px, int py, Color c){
        this.point=new Point(px,py);
        this.color=c;
        this.semiAxysX=0;
        this.semiAxysY=0;
    }

    public void draw (Graphics g){

    }
}
