package ui;

import javax.swing.*;
import java.awt.*;
import utils.AppTheme;

public class SideBar extends JPanel {

    public SideBar() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(150, 0));
        setBackground(AppTheme.SECONDARY);
        setBorder(BorderFactory.createMatteBorder(
           0, 0, 0, 1,
           AppTheme.PANEL_BORDER
        ));

        initComponents();
    }

    private void initComponents() {
        JLabel label = new JLabel("SideBar Title");
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel contentPanel = new JPanel();
        contentPanel.setBackground(AppTheme.SECONDARY);

        //test border
        contentPanel.setBorder(BorderFactory.createMatteBorder(
           1, 0, 0, 0,
           AppTheme.PANEL_BORDER
        ));

    }
}
