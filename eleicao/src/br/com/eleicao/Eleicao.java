package br.com.eleicao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eleicao {
    public JPanel panel1;
    private JRadioButton rb2;
    private JRadioButton rb1;
    private JButton apurarButton;
    private JButton votarButton;
    private JLabel lblCandidato1;
    private JLabel lblCandidato2;
    int candidato01 = 0;
    int candidato02 = 0;
    int nulo = 0;
public Eleicao() {
    votarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(rb1.isSelected()){
                candidato01++;
            }else if(rb2.isSelected()){
                candidato02++;
            }else{
                nulo++;
            }


        }
    });
    apurarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Donald" + candidato01 + "votos" + "Mickey" + candidato02 + "votos");
        }
    });
}

    private void createUIComponents() {
        lblCandidato1 = new JLabel(new ImageIcon("mickey.png"));
        lblCandidato2 = new JLabel(new ImageIcon("donald.png"));

    }
}
