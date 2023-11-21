import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {

    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSomar;
    public JPanel panel;
    private JLabel lblResultado;
    private JButton btnMult;
    private JButton btnDiv;
    private JButton btnSub;

    public Calculadora() {
    btnSomar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            int n1 = Integer.parseInt(txtNum1.getText());
            int n2 = Integer.parseInt(txtNum2.getText());

            int resultado = n1 + n2;
            lblResultado.setText(String.valueOf(resultado));
        }

    });
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtNum1.getText());
                int n2 = Integer.parseInt(txtNum2.getText());
                int multiplicacao = n1 * n2;
                lblResultado.setText(String.valueOf(multiplicacao));
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtNum1.getText());
                int n2 = Integer.parseInt(txtNum2.getText());
                int divisao = n1 / n2;
                lblResultado.setText(String.valueOf(divisao));
            }
        });
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(txtNum1.getText());
                int n2 = Integer.parseInt(txtNum2.getText());
                int subtracao = n1 - n2;
                lblResultado.setText(String.valueOf(subtracao));
            }
        });
    }
}
