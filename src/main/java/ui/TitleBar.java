package ui;

import utils.AppTheme;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TitleBar extends JPanel {
    public TitleBar(JFrame frame) {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(0, 35));
        setBackground(AppTheme.SECONDARY);
        setBorder(BorderFactory.createMatteBorder(
           0, 0, 1, 0,
           AppTheme.PANEL_BORDER
        ));


        initComponents();
        initDrag(frame);
    }

    private void initComponents() {
        JLabel titleLabel = new JLabel(AppTheme.APP_NAME);
        titleLabel.setForeground(AppTheme.TITLE_COLOR);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));

        JLabel modeLabel = new JLabel("Dark Mode");
        modeLabel.setForeground(new Color(80, 80, 80));
        modeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JButton closeButton = new JButton("X");
        closeButton.setFont(new Font("Arial", Font.BOLD, 14));
        closeButton.setForeground(AppTheme.TITLE_COLOR);
        closeButton.setBackground(AppTheme.SECONDARY);
        closeButton.setPreferredSize(new Dimension(35, 35));
        closeButton.setBorder(BorderFactory.createEmptyBorder());
        closeButton.addActionListener(e -> System.exit(0));

        add(titleLabel, BorderLayout.WEST);
        add(closeButton, BorderLayout.EAST);
        add(modeLabel, BorderLayout.CENTER);
    }

    private void initDrag(JFrame frame) {
        final Point[] mouseDownCompCoords = new Point[1];
        final Point[] frameLocation = new Point[1];

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseDownCompCoords[0] = e.getLocationOnScreen();
                frameLocation[0] = frame.getLocation();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point currentMouseLocation = e.getLocationOnScreen();

                int x = frameLocation[0].x
                        + currentMouseLocation.x - mouseDownCompCoords[0].x;

                int y = frameLocation[0].y
                        + currentMouseLocation.y - mouseDownCompCoords[0].y;

                frame.setLocation(x, y);
            }
        });
    }
}
