package br.com.alvarogabriel.gestao;

import lombok.Getter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Álvaro Gabriel
 */
public class Main {
    private JButton cliqueParaAdicionarOButton;
    private JPanel panelMain;

    private JTextArea textArea1;

    private JTextArea textArea2;

    @Getter
    private static Main instance;

    public Main() {
        instance = this;
        cliqueParaAdicionarOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        null,
                        String.format(
                                "Você deu o cargo %s para %s com sucesso.",
                                textArea2.getText(),
                                textArea1.getText()
                        )
                );
                System.out.println("CARGO ADICIONADO PARA -> " + textArea1.getText());
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gestão de Terceiros");
        frame.setContentPane(new Main().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
