import java.awt.*;

public class Carre extends Rectangle{

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        try {
            boolean b = heightBB == widthBB;
        } catch (Exception e) {
            System.out.println("Ce n'est pas un rectangle");
        }
        this.setLength(heightBB);
        this.setWidth(widthBB);
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
}
