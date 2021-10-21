import java.awt.*;

public class Ellipse extends Figure{


    protected int semiAxysX;

    public void setSemiAxysX(int semiAxysX) {
        this.semiAxysX = semiAxysX;
    }

    public void setSemiAxysY(int semiAxysY) {
        this.semiAxysY = semiAxysY;
    }

    protected int semiAxysY;

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

    @Override
    public String toString() {
        return "Cette ellipse est de couleur " + this.getC() + " avec comme origine " + this.point + " de demiaxeX " + this.semiAxysY + " et de demiaxeY " + this.semiAxysY;
    }

    public static void main(String[] args){
        Ellipse a=null;
        a=new Ellipse(4,3,Color.white);
        System.out.println(a.toString());
        a.setBoundingBox(2,1);
        System.out.println(a.toString());

    }
}
