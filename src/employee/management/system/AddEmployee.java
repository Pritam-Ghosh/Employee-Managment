package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class AddEmployee extends JFrame {
    JTextField tname,tfname,taddress,tphone,taadhar,temail,tsalary,tdesignation;
    AddEmployee(){

        getContentPane().setBackground(new Color(165, 255, 188));
    //Lebal
        JLabel heading = new JLabel("Add Employee");
        heading.setForeground(new Color(0,0,0));
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        heading.setBounds(320,30,500,50);
        add(heading);

        JLabel name = new JLabel("Name:");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("Arial", Font.BOLD, 30));
        add(name);

        tname = new JTextField();
        tname.setBounds(200,150,150,30);
        tname.setFont(new Font("Arial", Font.BOLD, 20));
        tname.setBackground(new Color(177,252,197));
        add(tname);

        JLabel fname = new JLabel("Father Name:");
        fname.setBounds(400,150,150,30);
        fname.setFont(new Font("Arial", Font.BOLD, 20));
        add(fname);

        tfname = new JTextField();
        tfname.setBounds(600,150,150,30);
        tfname.setFont(new Font("Arial", Font.BOLD, 20));
        tfname.setBackground(new Color(177,252,197));
        add(tfname);

        

        setSize(900,500);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AddEmployee();
    }
}
