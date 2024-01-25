package View;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    JMenuBar menuBar;

    JMenu fileMenu, optionsMenu, helpMenu; // File, Options, Help

    JMenu optionsSubMenu; // Options Sub-Menu
    JMenu usersSubMenu; // Users Sub-Menu

    JMenuItem menuItem;
    public Dashboard(){
        setTitle("Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        optionsMenu = new JMenu("Options");

        optionsSubMenu = new JMenu("SubOption");
        optionsSubMenu.add(menuItem = new JMenuItem("Gamma"));
        optionsSubMenu.add(menuItem = new JMenuItem("Delta"));
        optionsMenu.add(optionsSubMenu);

        usersSubMenu = new JMenu("Users");
        usersSubMenu.add(menuItem = new JMenuItem("Add User"));
        usersSubMenu.add(menuItem = new JMenuItem("Delete User"));
        optionsMenu.add(usersSubMenu);

        menuBar.add(optionsMenu);

        helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        pack();
    }
}
