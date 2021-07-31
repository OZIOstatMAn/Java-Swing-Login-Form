import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeWindow extends App {

    //private static JComboBox comboBox;
    private static JLabel WelcomeLabel;
    private static JPanel panel;
    private static JFrame frame;

    
    

    WelcomeWindow() {
        
        //String[] animals = {"dog", "cat", "bird"};
        //comboBox = new JComboBox(animals);
        /*comboBox.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()==comboBox) {
                        System.out.println(comboBox.getSelectedItem());
                    }
                    
                }
            }
        );
        comboBox.setBounds(10,50,100,25);

        panel.add(comboBox);*/

        panel = new JPanel();
        panel.setLayout(null);

        frame = new JFrame("Welcome Page");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        WelcomeLabel = new JLabel("HELLO, " + UsernamePane.toUpperCase() + ". \nTHANK YOU FOR USING MY GUI", JLabel.CENTER);
        WelcomeLabel.setSize(80, 25);
        WelcomeLabel.setForeground(Color.YELLOW.darker());
        WelcomeLabel.setAlignmentX(Component.TOP_ALIGNMENT);
        WelcomeLabel.setAlignmentY(Component.CENTER_ALIGNMENT);
        WelcomeLabel.setFont(new Font(null, Font.ITALIC, 20));
        frame.add(WelcomeLabel);

        /*button = new JButton("Return");
        button.setBounds(135, 130, 80, 20);
        button.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        button.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        button.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("***Return button initiated***");
                    frame.dispose();
                    new App();
                }
            }
        );
        frame.add(button);

        button = new JButton("Exit");
        button.setSize(80, 20);
        button.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        button.setAlignmentY(Component.CENTER_ALIGNMENT);
        //button.setBackground(Color.RED);
        button.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("***User Exited***");
                    frame.dispose();
                    new ExitWindow();
                }
            }
        );
        frame.add(button);*/

    }
}
