package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel loginPanel;
    private JTextField txtEmail;
    private JPasswordField txtPassword;
    private JButton btnCancel;
    private JButton btnLogin;
    private JButton btnAddUser;



    public Login() {
        setTitle("LOGIN");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(12, 2));
        setResizable(false);
        // Components
        // Input Email
        add(new JLabel("Email:"));
        txtEmail = new JTextField();
        txtEmail.setPreferredSize(new Dimension(200, 25));
        add(txtEmail);

        // Input Password
        add(new JLabel("Password"));
        txtPassword = new JPasswordField();
        add(txtPassword);

        //Login Button
        btnLogin = new JButton("LOGIN");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(btnLogin);

        //Cancel Button
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(btnCancel);

        //Cancel Button
        btnAddUser = new JButton("Create new User");
        btnAddUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  Signup signup = new Signup();
                signup.setVisible(true);
            }
        });
        add(btnAddUser);


    }
}