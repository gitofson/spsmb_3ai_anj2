package _10m._14d_15;

import java.awt.*;
public class OkenkoGUI{
    Button helloBT;
    Label lab;

    OkenkoGUI(Frame frame) {
        frame.setLayout(new FlowLayout());
        this.helloBT = new Button("Hello");
        this.lab = new Label ("Nazdar");
        frame.add(this.helloBT);
        frame.add(this.lab);
        frame.setSize(170, 100);
    }
    public static void main(String[] args){
        Frame bruh = new Frame("THIS");
        OkenkoGUI okenko = new OkenkoGUI(bruh);
        bruh.setVisible(true);
    }
}