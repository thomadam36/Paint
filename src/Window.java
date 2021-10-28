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
        JMenuItem new1= new JMenuItem("New");
        menu1.add(new1);
        JMenuItem open= new JMenuItem("Open");
        menu1.add(open);
        JMenuItem save= new JMenuItem("Save");
        menu1.add(save);
        JMenuItem quit= new JMenuItem("Quit");
        menu1.add(quit);
        m.add(menu1);

        JButton Button1= new JButton("Noir");
        Button1.setBackground(Color.black);
        southwestPanel.add(Button1);
        JButton Button2= new JButton("Jaune");
        Button2.setBackground(Color.yellow);
        southwestPanel.add(Button2);
        JButton Button3= new JButton("Rouge");
        Button3.setBackground(Color.red);
        southwestPanel.add(Button3);
        JButton Button4= new JButton("Rose");
        Button4.setBackground(Color.pink);
        southwestPanel.add(Button4);
        JButton Button5= new JButton("Vert");
        Button5.setBackground(Color.green);
        southwestPanel.add(Button5);
        JButton Button6= new JButton("Magenta");
        Button6.setBackground(Color.magenta);
        southwestPanel.add(Button6);
        JButton Button7= new JButton("Bleu");
        Button7.setBackground(Color.blue);
        southwestPanel.add(Button7);
        JButton Button8= new JButton("Orange");
        Button8.setBackground(Color.orange);
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

        contentPanel.add(m,"North");

        this.setVisible(true);
    }

    public static void main (String args []){
        Window window = new Window("Paint",800,600);
    }

}
