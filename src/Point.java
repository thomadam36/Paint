public class Point {
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x;
    private int y;

    public Point(){
        this.setX(0);
        this.setY(0);
    }

    public Point(int a, int b){
        this.setX(a);
        this.setY(b);
    }

    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }

    public static void main(String[] args){
        Point a=null;
        Point b=null;
        a=new Point();
        System.out.println(a.toString());
        a=new Point(2,3);
        System.out.println(a.toString());
        b=new Point(1,2);
        System.out.println(b.getX());
        System.out.println(b.getY());
    }
}
