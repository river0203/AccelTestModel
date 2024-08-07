import javax.swing.*;
import java.awt.*;

public class SuddenAccelView extends JPanel{
    private JPanel       presserBarPanel, speedBarPanel;
    private JProgressBar presserBar, speedBar;

    public SuddenAccelView()
    {
        setBackground(Color.white);
        setPreferredSize(new Dimension(600, 800));
        setLayout(null);
    }
}
