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
public class Frame1 extends JFrame{
    private JTextField pathJTextField;
    private Configuration configuration;

    public Frame1(){
        configuration = Configuration.getConfiguration();
        setSize(configuration.getWidth(), configuration.getHeight());
        setLocationRelativeTo(null);
        setTitle("Wprowadzanie ścieżki");

        pathJTextField = new JTextField(50);
        pathJTextField.setText(configuration.getPath());
        JPanel gornyPanel = new JPanel();
        gornyPanel.add(pathJTextField);
        add(gornyPanel, BorderLayout.CENTER);

        JButton jButton = new JButton(" Save ");
        JPanel dolnyPanel = new JPanel();
        dolnyPanel.add(jButton);
        add(dolnyPanel, BorderLayout.SOUTH);

        jButton.addActionListener(new SaveButtonListener());
    }

    class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String path = pathJTextField.getText();
            configuration.setPath(path);
            dispose();

            Frame2 frame2 = new Frame2();
            frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame2.setVisible(true);
        }
    }
}
