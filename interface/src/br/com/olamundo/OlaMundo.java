package br.com.olamundo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundo {
    private JPanel panel1;
    private JButton btnClicar;
    private JLabel lblTexto;

public OlaMundo() {
    btnClicar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            lblTexto.setText("Olá Mundo");
        }
    });
}
}
