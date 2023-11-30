import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Western Adventure");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a new JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        // Create a new JButton
        JButton button = new JButton("Test InputHandler");
        
        // Add the button to the JPanel
        panel.add(button);
        
        // Add the JPanel to the JFrame
        frame.getContentPane().add(panel);
        
        // Set the size of the JFrame
        frame.setSize(300, 300);
        
        // Make the JFrame visible
        frame.setVisible(true);
        
        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle button click
                System.out.println("Button clicked!");
            }
        });
    }

}