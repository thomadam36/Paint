import java.awt.*;

public class Circle extends Ellipse {

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.setSemiAxysX(heightBB);
        this.setSemiAxysY(heightBB);
    }

    public Circle (){
        this.point=new Point();
        this.color=Color.white;
        this.semiAxysX=0;
        this.semiAxysY=0;
    }

    public Circle (int px, int py, Color c){
        this.point=new Point(px,py);
        this.color=c;
        this.semiAxysX=0;
        this.semiAxysY=0;
    }

    public static void main(String[] args){
        Circle a=null,b=null;
        a=new Circle(1,2,Color.white);
        b=new Circle();
        System.out.println(a.toString());
        System.out.println(b.toString());
        a.setBoundingBox(3,0);
        System.out.println(a.toString());
        a.setBoundingBox(4,3);
        System.out.println(a.toString());
    }
}
