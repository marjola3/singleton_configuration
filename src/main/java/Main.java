import configuration.Configuration;
import view.Frame1;

import javax.swing.*;
import java.util.Scanner;

/**
 * User: Mariola
 * Date: 17.10.13
 */
public class Main {
    public static void main(String[] args) {
        Configuration configuration = Configuration.getConfiguration();
        configuration.setWidth(600);
        configuration.setHeight(100);

        Frame1 frame1 = new Frame1();
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }
}
