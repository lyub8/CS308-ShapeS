import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        try {
            // Use the platform look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Look and Feel error in Main");
        }

        View gui = new View();
        gui.createAndShowGUI();
    }
}