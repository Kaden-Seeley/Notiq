package ui;

import utils.AppTheme;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle(AppTheme.APP_NAME);
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);

        initComponents();

        setVisible(true);
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(AppTheme.BACKGROUND);

        SideBar sideBar = new SideBar();

        TitleBar titleBar = new TitleBar(this);

        mainPanel.add(titleBar, BorderLayout.NORTH);
        mainPanel.add(sideBar, BorderLayout.WEST);

        add(mainPanel);
    }
}
