import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculadora");
        f.setContentPane(new Calculadora().panel);
        f.setResizable(false);
        f.setSize(450,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}