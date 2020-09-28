package org.germain;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

public class Fen {
    static final ImageIcon icone = new ImageIcon(Fen.class.getResource("asset/unnamed.jpg"));
    private static Icon icon = icone;

    public static void afficheMessage(String message) {
//        JDialog jdiag = new JDialog();
//        JLabel label = new JLabel(message);
//        JPanel panel = new JPanel();
//        panel.add(label);
//        jdiag.add(panel);
//
//        jdiag.setSize(100,100);
//        jdiag.setVisible(true);

        JOptionPane.showMessageDialog(null, message);
    }

    public static String afficheTest(String question) throws MalformedURLException {
        JLabel label = new JLabel(icon);
        JPanel panel = new JPanel(new GridBagLayout());
        panel.add(label);
        JPanel textPanel = new JPanel();

        textPanel.add(new JLabel(question));

        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.add(textPanel);
        panel2.add(panel, BorderLayout.EAST);
        return JOptionPane.showInputDialog(null, panel2, "Course", JOptionPane.DEFAULT_OPTION);
    }

    public static String attendRéponse(String question) throws MalformedURLException {
        String reponse;

        reponse = JOptionPane.showInputDialog(question);

        return reponse;
    }
}
