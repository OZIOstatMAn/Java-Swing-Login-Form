import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class App {

    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JTextField userTextField;
    private static JPasswordField passwordField;
    private static JButton button;
    private static JFrame frame;
    private static JPanel panel;
    private static String User;
    public static String UsernamePane;

    public static void main(String[] args) {

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLUE.darker());

        frame = new JFrame("iKEN GUI😎");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
        
        userLabel = new JLabel("USERNAME", JLabel.LEFT);
        userLabel.setFont(new Font("Times New Roman", Font.ITALIC, 17));
        userLabel.setForeground(Color.RED.brighter());
        userLabel.setBounds(10, 25, 100, 25);
        panel.add(userLabel);

        userTextField = new JTextField(JTextField.RIGHT);
        userTextField.setForeground(Color.WHITE);
        userTextField.setBackground(Color.BLACK.darker());
        userTextField.setBounds(100, 25, 165, 25);
        panel.add(userTextField);

        passwordLabel = new JLabel("PASSWORD", JLabel.LEFT);
        passwordLabel.setFont(new Font("Times New Roman", Font.ITALIC, 17));
        passwordLabel.setForeground(Color.RED.brighter());
        passwordLabel.setBounds(10, 55, 100, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(JPasswordField.CENTER);
        passwordField.setForeground(Color.WHITE);
        passwordField.setBackground(Color.BLACK.darker());
        passwordField.setBounds(100, 55, 165, 25);
        panel.add(passwordField);

        button = new JButton("Login");
        button.setBounds(135, 100, 80, 25);
        button.setBackground(Color.GREEN);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentY(Component.CENTER_ALIGNMENT);
        button.setMnemonic(KeyEvent.VK_ENTER);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println("***User Tried Login*** \n");
                    User = userTextField.getText();
                    char Password[] = passwordField.getPassword();
                    String PassStr = new String(Password);
                    System.out.println("User Login Input: " + User + " and " + PassStr);

                    String name = "Ozioma";
                    String pass = "iken";
                    char[] passtochar = pass.toCharArray();

                        if (User.equals(name.toLowerCase()) && Arrays.equals(Password, passtochar)) {
                            System.out.println("***User Login Successful***");
                            UsernamePane = JOptionPane.showInputDialog(frame, "Please Enter Your Name");
                            UsernamePane.equals(new JOptionPane(JOptionPane.CLOSED_OPTION));
                            switch (UsernamePane) {
                                case "":
                                JOptionPane.showMessageDialog(frame, "Please Enter Your Name", "ERROR", JOptionPane.ERROR);
                            }
                        new WelcomeWindow();
                        frame.dispose();
                        }
                        else if (User.isEmpty() || PassStr.isEmpty()) {
                            JOptionPane.showMessageDialog(frame, "Please fill in the empty field(s)😡", "ERROR", JOptionPane.ERROR_MESSAGE);
                        } 
                        else {
                            JOptionPane.showMessageDialog(frame, "Incorrect Password/Username \n\nHands off, you 🤬 imposter!!!", "WARNING", JOptionPane.ERROR_MESSAGE);
                        }
                } catch (Exception exception) {
                    System.out.println(exception + ", Shit! the if condition's fucked!!");
                }
            }

        }
    );
        panel.add(button);

        button = new JButton("Reset");
        button.setBounds(135, 130, 80, 20);
        button.setBackground(Color.RED);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setAlignmentY(Component.CENTER_ALIGNMENT);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("***User Reset Entry Fields***");
                passwordField.setText("");
                userTextField.setText("");
            }
        });
        panel.add(button);

    }
}
