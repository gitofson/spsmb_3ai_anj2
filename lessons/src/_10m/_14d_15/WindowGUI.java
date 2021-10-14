package _10m._14d_15;
import java.awt.*;

public class WindowGUI {
    Button helloBT;
    Label lab;

    WindowGUI(Frame frame) {
        // Vytvoření anonymní instance třídy
        frame.setLayout(new FlowLayout());
        this.helloBT = new Button("Hello");
        this.lab = new Label("YAay");
        frame.add(this.helloBT);
        frame.add(this.lab);
        frame.setSize(170, 100);
    }

    public static void main(String[] args) {
        Frame bruh = new Frame("THIS");
        WindowGUI window = new WindowGUI(bruh);
        bruh.setVisible(true);
    }
}
