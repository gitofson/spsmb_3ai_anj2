package _10m._14d_15;
//importuj všechny třídy balíčku awt
import java.awt.*;
import java.awt.event.*;

    public class OkenkoGUI {
        Button ahojBT;
        Label lab;

        OkenkoGUI(Frame ramecek) {
            //vytvoření anonymní instance třídy FlowLayout a její přidání
            //do ramecku (instance třídy Frame)
            ramecek.setLayout(new FlowLayout());
            //nová  instance třídy Button
            this.ahojBT = new Button("Ahoj");
            //nová instance třídy Label (Návěští)
            this.lab = new Label("Nazdar");
            //přidání tlačítka do rámečku
            ramecek.add(this.ahojBT);
            //přidání návěští do rámečku
            ramecek.add(this.lab);
            ramecek.setSize(170, 65);

            ramecek.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent we){
                    System.exit(0);
                }
            });

        }



        public static void main(String[] args) {
            Frame ramec = new Frame("Muj Ramec");
            OkenkoGUI o = new OkenkoGUI(ramec);
            ramec.setVisible(true);

        }
    }