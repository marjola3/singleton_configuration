package view;

import configuration.Configuration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * User: Mariola
 * Date: 17.10.13
 */
public class Frame2 extends JFrame {

    public Frame2(){
        Configuration configuration = Configuration.getConfiguration();
        setSize(configuration.getWidth(), configuration.getHeight());
        setLocationRelativeTo(null);
        setTitle("Wprowadzanie ścieżki");

        JTextField pathJTextField = new JTextField(50);
        pathJTextField.setEditable(false);
        pathJTextField.setText(configuration.getPath());

        JPanel gornyPanel = new JPanel();
        gornyPanel.add(pathJTextField);
        add(gornyPanel, BorderLayout.CENTER);

        JButton jButton = new JButton(" Return to Frame1 ");
        JPanel dolnyPanel = new JPanel();
        dolnyPanel.add(jButton);
        add(dolnyPanel, BorderLayout.SOUTH);

        jButton.addActionListener(new SaveButtonListener());
    }

    class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();

            Frame1 frame1 = new Frame1();
            frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame1.setVisible(true);
        }
    }

}
