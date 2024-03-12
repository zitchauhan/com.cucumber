package ThisJava;
import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click Me");
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button clicked"));

        frame.add(button);
        frame.setVisible(true);
    }
}
