import javax.swing.*;
import java.awt.*;

public class SuddenAccel {

    public static void main(String[] args) {
        JFrame frame = new JFrame("SIMPLE PAINTER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        SuddenAccelView view = new SuddenAccelView();
        frame.getContentPane().add(view);

        frame.pack();
        frame.setVisible(true);
    }
}
