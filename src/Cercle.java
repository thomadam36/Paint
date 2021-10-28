import java.awt.*;

public class Cercle extends Ellipse {

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.setSemiAxysX(heightBB);
        this.setSemiAxysY(heightBB);
    }

    public Cercle (){
        this.point=new Point();
        this.color=Color.white;
        this.semiAxysX=0;
        this.semiAxysY=0;
    }

    public Cercle (int px, int py, Color c){
        this.point=new Point(px,py);
        this.color=c;
        this.semiAxysX=0;
        this.semiAxysY=0;
    }

    public static void main(String[] args){
        Cercle a=null;
        a=new Cercle(1,2,Color.white);
        System.out.println(a.toString());
        a.setBoundingBox(3,0);
        System.out.println(a.toString());
        a.setBoundingBox(3,4);
        System.out.println(a.toString());
    }
}
