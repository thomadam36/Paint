import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// Cette classe va gérer l'affichage de la fenêtre du paint et l'intéraction avec Drawing pour les boutons

public class Window extends JFrame implements ActionListener {

    // Variables

    JButton ButtonNoir,ButtonJaune,ButtonRouge,ButtonRose,ButtonVert,ButtonMagenta,ButtonBleu,ButtonOrange;
    JButton ButtonEllipse,ButtonRectangle,ButtonSquare,ButtonCircle;
    JMenuBar m;
    JMenu menu;
    JMenuItem new1,open,save,quit,about;
    JOptionPane info;
    Drawing d=new Drawing();

    // Affichage de la fenêtre

    public Window (String Title,int x, int y){

        // Nom, taille et intégration de Drawing pour rendre visible la fenêtre et pour pouvoir la fermer

        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(d);

        // Division de la barre en bas de la fenêtre

        Container contentPanel= this.getContentPane();
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(1,2));
        JPanel southwestPanel = new JPanel();
        southwestPanel.setLayout(new GridLayout(2,4));
        JPanel southeastPanel = new JPanel();
        southeastPanel.setLayout(new GridLayout(2,2));

        // Affichage de la barre de menu

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

        // Affichage des boutons en bas

        // Les couleurs

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

        // Les formes

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

    // Définition des interruptions avec l'appui sur le bouton

    @Override
    public void actionPerformed (ActionEvent e){
        String cmd=e.getActionCommand();

        switch (cmd){

            // Appui des couleurs sur les boutons définit la couleur de la figure sur Drawing

            case "Noir":
                System.out.println("Color is black");
                d.setC(Color.black);
                break;
            case "Jaune":
                System.out.println("Color is yellow");
                d.setC(Color.yellow);
                break;
            case "Rouge":
                System.out.println("Color is red");
                d.setC(Color.red);
                break;
            case "Rose":
                System.out.println("Color is pink");
                d.setC(Color.pink);
                break;
            case "Vert":
                System.out.println("Color is green");
                d.setC(Color.green);
                break;
            case "Magenta":
                System.out.println("Color is magenta");
                d.setC(Color.magenta);
                break;
            case "Bleu":
                System.out.println("Color is blue");
                d.setC(Color.blue);
                break;
            case "Orange":
                System.out.println("Color is orange");
                d.setC(Color.orange);
                break;

            // Appui des formes sur les boutons définit la fomre de la figure sur Drawing

            case "Ellipse":
                System.out.println("Select ellipse");
                d.setNameFigure("Ellipse");
                break;
            case "Rectangle":
                System.out.println("Select rectangle");
                d.setNameFigure("Rectangle");
                break;
            case "Circle":
                System.out.println("Select circle");
                d.setNameFigure("Circle");
                break;
            case "Square":
                System.out.println("Select Square");
                d.setNameFigure("Square");
                break;

            // New permet de reset la liste de figure dans drawing

            case "New":
                System.out.println("Nouvelle fenêtre");
                d.reset();
                break;

            // Save permet de sauvegarder la liste de figure dans un fichier

            case "Save":
                d.saveDrawing();
                System.out.println("Fichier enregisté");
                break;

            // Quit permet aussi de quitter le paint

            case "Quit":
                System.exit(1);
                break;

            // About donne des infos sur le paint

            case "About":
                info.showInternalMessageDialog(info,"Author: Thomas ADAM","Information",JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    public static void main (String args []){
        Window window = new Window("Paint",800,600);
    }

}
