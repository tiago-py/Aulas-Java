import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a base", "Retangulo",
                JOptionPane.INFORMATION_MESSAGE
        ));
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a altura", "Retangulo",
                JOptionPane.INFORMATION_MESSAGE
        ));

        double area = b * a;
        double perimetro = b + a + b + a;

        JOptionPane.showMessageDialog(null,
                    "Area: " + area + "\n" + "Perimetro: " + perimetro,
                "Retangulo",JOptionPane.INFORMATION_MESSAGE
                );
    }

}