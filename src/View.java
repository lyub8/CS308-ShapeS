import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class View {

    private JFrame frame;
    private Board board;

    public View() {
    }

    public void createAndShowGUI() {
        frame = new JFrame("CS308 Git Practical");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board = new Board(500, 500);
        Container cp = frame.getContentPane();
        cp.add(board, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}