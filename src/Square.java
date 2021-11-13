import java.awt.*;

public class Square extends Rectangle{

    @Override
    public void setBoundingBox(int heightBB,int widthBB) {
        this.setLength(heightBB);
        this.setWidth(heightBB);
    }

    public Square (){
        this.point=new Point();
        this.color=Color.white;
        this.length=0;
        this.width=0;
    }

    public Square (int px, int py, Color c){
        this.point=new Point(px,py);
        this.color=c;
        this.length=0;
        this.width=0;
    }

    public static void main(String[] args){
        Square a=null,b=null;
        a=new Square(1,2,Color.white);
        b=new Square();
        System.out.println(a.toString());
        System.out.println(b.toString());
        a.setBoundingBox(3,0);
        System.out.println(a.toString());
        a.setBoundingBox(4,3);
        System.out.println(a.toString());
    }
}
