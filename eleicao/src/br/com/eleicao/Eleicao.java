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
    private JLabel lblPorcentagemCandidato1;
    private JLabel lblPorcentagemCandidato2;

    int totalVotos = 0;
    int candidato01 = 0;
    int candidato02 = 0;

    public Eleicao() {
        votarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rb1.isSelected()) {
                    candidato02++;
                } else if (rb2.isSelected()) {
                    candidato01++;
                }

                totalVotos++;

            }
        });

        apurarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Calcular as porcentagens
                double porcentagemCandidato1 = (double) candidato01 / totalVotos * 100;
                double porcentagemCandidato2 = (double) candidato02 / totalVotos * 100;

                // Atualizar as JLabels com as porcentagens
                lblPorcentagemCandidato1.setText("Porcentagem Mickey: " + String.format("%.0f", porcentagemCandidato2) + "%");
                lblPorcentagemCandidato2.setText("\n Porcentagem Donald: " + String.format("%.0f", porcentagemCandidato1) + "%");

                JOptionPane.showMessageDialog(null, "Votos Mickey: " + candidato02 + "\n Votos Donald: " + candidato01);


            }
        });
    }

    private void createUIComponents() {
        lblCandidato1 = new JLabel(new ImageIcon("mickey.png"));
        lblCandidato2 = new JLabel(new ImageIcon("donald.png"));
        lblPorcentagemCandidato1 = new JLabel();
        lblPorcentagemCandidato2 = new JLabel();
    }

}
