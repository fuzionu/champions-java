import javax.swing.*;
import java.awt.*;

public class WindowInterface
{
    public void GraphicUserInterface()
    {
        JFrame championsFrame = new JFrame("Champions");
        JLabel ButtonsLabel = new JLabel();
        JButton searchButton = new JButton();
        JButton clearButton = new JButton();
        JButton exitButton = new JButton();

        searchButton.setText("Search");
        clearButton.setText("Clear");
        exitButton.setText("Exit");

        ButtonsLabel.setLayout(new FlowLayout());
        ButtonsLabel.add(searchButton);
        ButtonsLabel.add(clearButton);
        ButtonsLabel.add(exitButton);

        championsFrame.add(ButtonsLabel);
        championsFrame.setSize(500, 700);
        championsFrame.setLocationRelativeTo(null);
        championsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        championsFrame.setVisible(true);
    }
}
