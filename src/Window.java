import javax.swing.*;
import java.awt.*;

public class Window extends JFrame{

    public Window (String Title,int x, int y){
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel= this.getContentPane();
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1,2));
        JPanel southwestPanel = new JPanel();
        southwestPanel.setLayout(new GridLayout(2,4));
        JPanel southeastPanel = new JPanel();
        southeastPanel.setLayout(new GridLayout(2,2));

        JMenuBar m= new JMenuBar();

        JMenu menu1= new JMenu("File");
        JMenuItem open= new JMenuItem("Open");
        menu1.add(open);
        m.add(menu1);

        JButton Button1= new JButton("Noir");
        southwestPanel.add(Button1);
        JButton Button2= new JButton("Jaune");
        southwestPanel.add(Button2);
        JButton Button3= new JButton("Rouge");
        southwestPanel.add(Button3);
        JButton Button4= new JButton("Rose");
        southwestPanel.add(Button4);
        JButton Button5= new JButton("Vert");
        southwestPanel.add(Button5);
        JButton Button6= new JButton("Magenta");
        southwestPanel.add(Button6);
        JButton Button7= new JButton("Bleu");
        southwestPanel.add(Button7);
        JButton Button8= new JButton("Orange");
        southwestPanel.add(Button8);
        southPanel.add(southwestPanel);

        JButton Button9=new JButton("Ellipse");
        southeastPanel.add(Button9);
        JButton Button10=new JButton("Rectangle");
        southeastPanel.add(Button10);
        JButton Button11=new JButton("Cercle");
        southeastPanel.add(Button11);
        JButton Button12=new JButton("Carre");
        southeastPanel.add(Button12);
        southPanel.add(southeastPanel);

        contentPanel.add(southPanel,"South");

        this.setVisible(true);
    }

    public static void main (String args []){
        Window window = new Window("Paint",800,600);
    }

}
