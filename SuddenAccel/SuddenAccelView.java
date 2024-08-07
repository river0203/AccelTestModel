import javax.swing.*;
import java.awt.*;

public class SuddenAccelView extends JPanel{
    private JPanel       presserBarPanel, speedBarPanel, clockPanel, speedPanel;
    private JProgressBar presserBar, speedBar;
    private Controller controller;
    private Thread threadTimer;

    public SuddenAccelView()
    {
        setBackground(Color.white);
        setPreferredSize(new Dimension(600, 800));
        setLayout(null);

        controller = new Controller();
        threadTimer = new Thread(controller);
        threadTimer.start();

        presserBarPanel = new JPanel();
        presserBarPanel.setBounds(80, 160, 200, 600);
        presserBarPanel.setBackground(Color.white);
        presserBarPanel.setBorder(BorderFactory.createTitledBorder("Press Bar Panel"));
        add(presserBarPanel);

        speedBarPanel = new JPanel();
        speedBarPanel.setBounds(330, 160, 200, 600);
        speedBarPanel.setBackground(Color.white);
        speedBarPanel.setBorder(BorderFactory.createTitledBorder("Speed Bar Panel"));
        add(speedBarPanel);

        clockPanel = new JPanel();
        clockPanel.setBounds(80, 20, 220, 100);
        clockPanel.setBackground(Color.white);
        clockPanel.setBorder(BorderFactory.createTitledBorder("Speed Bar Panel"));
        add(clockPanel);

        speedPanel = new JPanel();
        speedPanel.setBounds(350, 20, 220, 100);
        speedPanel.setBackground(Color.white);
        speedPanel.setBorder(BorderFactory.createTitledBorder("Speed"));
        add(speedPanel);
    }
}
