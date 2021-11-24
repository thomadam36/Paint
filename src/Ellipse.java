import java.awt.*;

public class Ellipse extends Figure{

    // Variables et setter

    protected int semiAxysX;

    public void setSemiAxysX(int semiAxysX) {
        this.semiAxysX = semiAxysX;
    }

    public void setSemiAxysY(int semiAxysY) {
        this.semiAxysY = semiAxysY;
    }

    protected int semiAxysY;

    // Définition des dimensions de l'ellipse

    public void setBoundingBox(int heightBB, int widthBB){
        this.setSemiAxysX(heightBB);
        this.setSemiAxysY(widthBB);
    }

    // Constructeurs de Ellipse

    public Ellipse (int px, int py, Color c){
        this.point=new Point(px,py);
        this.color=c;
        this.semiAxysX=0;
        this.semiAxysY=0;
    }

    public Ellipse (){
        this.point=new Point();
        this.color=Color.white;
        this.semiAxysX=0;
        this.semiAxysY=0;
    }

    // Définition de Draw pour Ellipse

    public void draw (Graphics g){
        g.setColor(this.getC());
        g.fillOval(this.getPoint().getX(),this.getPoint().getY(),this.semiAxysX,this.semiAxysY);
    }

    // Affichage

    @Override
    public String toString() {
        return "Cette ellipse est de couleur " + this.getC() + " avec comme origine " + this.point + " de demiaxeX " + this.semiAxysY + " et de demiaxeY " + this.semiAxysY;
    }

    // Définition du périmètre et de la surface

    public float getPerimeter(){
        return (float) (2*Math.PI*Math.pow((Math.pow(this.semiAxysX,2)+Math.pow(this.semiAxysY,2))/2,1/2));
    }

    public float getSurface(){
        return (float) (Math.PI*this.semiAxysX*this.semiAxysY);
    }

    public static void main(String[] args){
        Ellipse a=null;
        a=new Ellipse(4,3,Color.white);
        System.out.println(a.toString());
        a.setBoundingBox(2,1);
        System.out.println(a.toString());

    }
}
