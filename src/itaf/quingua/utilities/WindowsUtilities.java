package itaf.quingua.utilities;

import itaf.quingua.runners.Kobe;
import javax.swing.*;
import java.awt.*;

public class WindowsUtilities {

    public static void setNativeLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }

    public static JFrame openInJFrame(Container content,
            int width,
            int height,
            String title,
            Color bgColor) {
        JFrame frame = new JFrame(title);
        frame.setBackground(bgColor);
        content.setBackground(bgColor);
        frame.setSize(width, height);
        frame.setContentPane(content);
        frame.addWindowListener(new ExitListener());
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        return (frame);
    }

    public static JFrame openInJFrame(Container content,
            int width,
            int height,
            String title) {
        return (openInJFrame(content, width, height, title, Color.white));
    }

    public static JFrame openInJFrame(Container content,
            int width,
            int height) {
        return (openInJFrame(content, width, height,
                content.getClass().getName(),
                Color.LIGHT_GRAY));
    }
}

