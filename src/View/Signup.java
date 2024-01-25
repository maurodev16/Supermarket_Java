package View;

import Controller.UserController;
import Model.UserModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame {

    private JButton btnCancel;
    private JButton btnSignup;
    private JCheckBox cbxRules;
    private JPasswordField txtPassword;
    private JPasswordField txtConfPassword;
    private JTextField txtUsername;
    private JTextField txtEmail;
    private JPanel signupPanel;
    private UserController userController;

    public Signup() {
        setTitle("SIGNUP");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 2));
        setResizable(false);

        /******************** Components ************************/
        // Inicializando UserController
        userController = new UserController();

        //User name
        add(new JLabel("User Name:"));
        txtUsername = new JTextField();
        add(txtUsername);

        //Email
        add(new JLabel("Email"));
        txtEmail = new JTextField();
        add(txtEmail);

        //Password
        add(new JLabel("Password:"));
        txtPassword = new JPasswordField();
        add(txtPassword);

        //Confirm Password
        add(new JLabel("Check Password:"));
        txtConfPassword = new JPasswordField();
        add(txtConfPassword);

        ///Create New User
        add(new JLabel("Check Password:"));

        //SIGNUP
        btnSignup = new JButton("SIGNUP");
        btnSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String email = txtEmail.getText();
                String password = new String(txtPassword.getPassword());
                UserModel newUser = new UserModel(0, username, email, password, null, null, false);
                userController.insertUser(newUser);

                JOptionPane.showMessageDialog(Signup.this, "User added successfully!");
                dispose();

                //Login Open
                 Login login = new Login();

                login.setVisible(true);

            }
        });
        add(btnSignup);

        //CANCEL
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(btnCancel);


    }
}
