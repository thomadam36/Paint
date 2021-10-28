import java.awt.*;

public class Carre extends Rectangle{

    @Override
    public void setBoundingBox(int heightBB,int widthBB) {
        this.setLength(heightBB);
        this.setWidth(heightBB);
    }

    public Carre (){
        this.point=new Point();
        this.color=Color.white;
        this.length=0;
        this.width=0;
    }

    public Carre (int px, int py, Color c){
        this.point=new Point(px,py);
        this.color=c;
        this.length=0;
        this.width=0;
    }

    public static void main(String[] args){
        Carre a=null;
        a=new Carre(1,2,Color.white);
        System.out.println(a.toString());
        a.setBoundingBox(3,0);
        System.out.println(a.toString());
        a.setBoundingBox(3,4);
        System.out.println(a.toString());
    }
}
