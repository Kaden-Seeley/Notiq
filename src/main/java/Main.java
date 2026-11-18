import javax.swing.*;
import com.formdev.flatlaf.FlatDarkLaf;
import ui.MainWindow;

public class Main {

    public static void main(String[] args) {
        FlatDarkLaf.setup();

        SwingUtilities.invokeLater(MainWindow::new);
        

    }
}
