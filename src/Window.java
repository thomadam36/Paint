import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame implements ActionListener {

    JButton ButtonNoir,ButtonJaune,ButtonRouge,ButtonRose,ButtonVert,ButtonMagenta,ButtonBleu,ButtonOrange;
    JButton ButtonEllipse,ButtonRectangle,ButtonSquare,ButtonCircle;
    JMenuBar m;
    JMenu menu;
    JMenuItem new1,open,save,quit,about;
    JOptionPane info;

    public Window (String Title,int x, int y){
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(new Drawing());

        Container contentPanel= this.getContentPane();
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1,2));
        JPanel southwestPanel = new JPanel();
        southwestPanel.setLayout(new GridLayout(2,4));
        JPanel southeastPanel = new JPanel();
        southeastPanel.setLayout(new GridLayout(2,2));

        m= new JMenuBar();

        menu= new JMenu("File");
        new1= new JMenuItem("New");
        menu.add(new1);
        new1.addActionListener(this);
        open= new JMenuItem("Open");
        menu.add(open);
        open.addActionListener(this);
        save= new JMenuItem("Save");
        menu.add(save);
        save.addActionListener(this);
        quit= new JMenuItem("Quit");
        menu.add(quit);
        quit.addActionListener(this);
        about=new JMenuItem("About");
        menu.add(about);
        about.addActionListener(this);
        m.add(menu);

        ButtonNoir= new JButton("Noir");
        ButtonNoir.setBackground(Color.black);
        southwestPanel.add(ButtonNoir);
        ButtonNoir.addActionListener(this);
        ButtonJaune= new JButton("Jaune");
        ButtonJaune.setBackground(Color.yellow);
        southwestPanel.add(ButtonJaune);
        ButtonJaune.addActionListener(this);
        ButtonRouge= new JButton("Rouge");
        ButtonRouge.setBackground(Color.red);
        southwestPanel.add(ButtonRouge);
        ButtonRouge.addActionListener(this);
        ButtonRose= new JButton("Rose");
        ButtonRose.setBackground(Color.pink);
        southwestPanel.add(ButtonRose);
        ButtonRose.addActionListener(this);
        ButtonVert= new JButton("Vert");
        ButtonVert.setBackground(Color.green);
        southwestPanel.add(ButtonVert);
        ButtonVert.addActionListener(this);
        ButtonMagenta= new JButton("Magenta");
        ButtonMagenta.setBackground(Color.magenta);
        southwestPanel.add(ButtonMagenta);
        ButtonMagenta.addActionListener(this);
        ButtonBleu= new JButton("Bleu");
        ButtonBleu.setBackground(Color.blue);
        southwestPanel.add(ButtonBleu);
        ButtonBleu.addActionListener(this);
        ButtonOrange= new JButton("Orange");
        ButtonOrange.setBackground(Color.orange);
        southwestPanel.add(ButtonOrange);
        ButtonOrange.addActionListener(this);
        southPanel.add(southwestPanel);


        ButtonEllipse=new JButton("Ellipse");
        southeastPanel.add(ButtonEllipse);
        ButtonEllipse.addActionListener(this);
        ButtonRectangle=new JButton("Rectangle");
        southeastPanel.add(ButtonRectangle);
        ButtonRectangle.addActionListener(this);
        ButtonCircle=new JButton("Circle");
        southeastPanel.add(ButtonCircle);
        ButtonCircle.addActionListener(this);
        ButtonSquare=new JButton("Square");
        southeastPanel.add(ButtonSquare);
        ButtonSquare.addActionListener(this);
        southPanel.add(southeastPanel);

        contentPanel.add(southPanel,"South");

        contentPanel.add(m,"North");

        info=new JOptionPane();

        this.setVisible(true);
    }

    @Override
    public void actionPerformed (ActionEvent e){
        String cmd=e.getActionCommand();

        switch (cmd){
            case "Noir":
                System.out.println("Color is black");
                Drawing.setC(Color.black);
                break;
            case "Jaune":
                System.out.println("Color is yellow");
                Drawing.setC(Color.yellow);
                break;
            case "Rouge":
                System.out.println("Color is red");
                Drawing.setC(Color.red);
                break;
            case "Rose":
                System.out.println("Color is pink");
                Drawing.setC(Color.pink);
                break;
            case "Vert":
                System.out.println("Color is green");
                Drawing.setC(Color.green);
                break;
            case "Magenta":
                System.out.println("Color is magenta");
                Drawing.setC(Color.magenta);
                break;
            case "Bleu":
                System.out.println("Color is blue");
                Drawing.setC(Color.blue);
                break;
            case "Orange":
                System.out.println("Color is orange");
                Drawing.setC(Color.orange);
                break;


            case "Ellipse":
                System.out.println("Select ellipse");
                Drawing.setNameFigure("Ellipse");
                break;
            case "Rectangle":
                System.out.println("Select rectangle");
                Drawing.setNameFigure("Rectangle");
                break;
            case "Circle":
                System.out.println("Select circle");
                Drawing.setNameFigure("Circle");
                break;
            case "Square":
                System.out.println("Select Square");
                Drawing.setNameFigure("Square");
                break;

            case "Quit":
                System.exit(1);
                break;
            case "About":
                info.showInternalMessageDialog(info,"Author: Thomas ADAM","Information",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main (String args []){
        Window window = new Window("Paint",800,600);
    }

}
