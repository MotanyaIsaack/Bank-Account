/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EtchedBorder;


/**
 *
 * @author Isaack
 */
public class Welcome {
    
    public static void main(String[] args) {
         SplashScreen splashScreen = new SplashScreen();
    }
}

class SplashScreen extends JWindow{
    Color welcomeColor =  new Color(23, 32, 42);
    Color welcomeText = new Color(236, 240, 241);
    Color welcomeTextO = new Color(52, 152, 219);
    Color buttobBlue = new Color(84, 153, 199);
    
    static JProgressBar progressBar = new JProgressBar();
    static int count = 1, TIMER_PAUSE = 30, PROGBAR_MAX = 100;
    static Timer progressBarTimer;
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            progressBar.setValue(count);
            if (PROGBAR_MAX == count) {
                progressBarTimer.stop();
                SplashScreen.this.setVisible(false);
                createAndShowFrame();
            } 
            count++;
        }
    };
    public SplashScreen() {
        Color welcomeColor =  new Color(23, 32, 42);
        Color welcomeText = new Color(236, 240, 241);
        Color welcomeTextO = new Color(211, 84, 0);
        
        
        
        Container container;
            container = getContentPane();

        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder());
        panel.setSize(500,500);
        panel.setBackground(welcomeColor);
        container.add(panel, BorderLayout.CENTER);

        JLabel label = new JLabel("Strathmore Bank");
        
        label.setFont(new Font("Garamond", Font.BOLD, 40));
        label.setForeground(welcomeText);
        panel.add(label);
        
        JLabel bankLogo = new JLabel(new ImageIcon("C://Users/motan/Documents/NetBeansProjects/BankAccount/src/images/cover.jpg"));
        panel.add(bankLogo);

        progressBar.setMaximum(PROGBAR_MAX);
        container.add(progressBar, BorderLayout.SOUTH);
        
        setLocation(400, 100);
        setSize(600,600);
//        container.setBackground(Color.BLACK);
        setVisible(true);
        startProgressBar();
  }
  private void startProgressBar() {
    progressBarTimer = new Timer(TIMER_PAUSE, al);
    progressBarTimer.start();
  }
  private void createAndShowFrame() {
        
        JFrame frame = new JFrame();
        frame.setLayout(null);
        JPanel panel = new Panel();
        panel.setLayout(null);
        panel.setBackground(welcomeColor);
        panel.setSize(600,600);
        frame.add(panel);
        
        JLabel label = new JLabel("Welcome to the Strathmore Bank");
        label.setFont(new Font("Garamond", Font.BOLD, 33));
        label.setForeground(welcomeText);
        panel.add(label);
        
//        JLabel labels = new JLabel("Step1: Create an Account");
//         labels.setFont(new Font("Garamond", Font.BOLD, 28));
//         labels.setForeground(Color.WHITE);
//         panel.add(labels);
         
        JLabel bankLogo = new JLabel(new ImageIcon("C://Users/motan/Documents/NetBeansProjects/BankAccount/src/images/perosnImage.png"));
        panel.add(bankLogo);
        
        JLabel lblCreateAccount = new JLabel("Create Account");
        lblCreateAccount.setFont(new Font("Garamond", Font.BOLD, 30));
        lblCreateAccount.setForeground(welcomeText);
        panel.add(lblCreateAccount);
        
        JLabel accountNumber = new JLabel("Account Number:");
        accountNumber.setForeground(welcomeText);
        accountNumber.setFont(new Font("Garamond", Font.BOLD,23));
        panel.add(accountNumber);

        JTextField txtAccountNumber = new JTextField(25);
        txtAccountNumber.setForeground(Color.BLACK);
        txtAccountNumber.setFont(new Font("Garamond", Font.PLAIN,19));
        panel.add(txtAccountNumber);
        
         
        JLabel FirstName = new JLabel("First Name:");
        FirstName.setForeground(welcomeText);
        FirstName.setFont(new Font("Garamond", Font.BOLD,23));
        panel.add(FirstName);

        JTextField txtFirstName = new JTextField(25);
        txtFirstName.setForeground(Color.BLACK);
        txtFirstName.setFont(new Font("Garamond", Font.PLAIN,19));
        panel.add(txtFirstName);
        
        JLabel LastName = new JLabel("Last Name:");
        LastName.setForeground(welcomeText);
        LastName.setFont(new Font("Garamond", Font.BOLD,23));
        panel.add(LastName);

        JTextField txtLastName = new JTextField(25);
        txtLastName.setForeground(Color.BLACK);
        txtLastName.setFont(new Font("Garamond", Font.PLAIN,19));
        panel.add(txtLastName);
        
        JLabel idNumber = new JLabel("ID Number:");
        idNumber.setForeground(welcomeText);
        idNumber.setFont(new Font("Garamond", Font.BOLD,23));
        panel.add(idNumber);

        JTextField txtIdNumber = new JTextField(25);
        txtIdNumber.setForeground(Color.BLACK);
        txtIdNumber.setFont(new Font("Garamond", Font.PLAIN,19));
        panel.add(txtIdNumber);
        
        JLabel DOB = new JLabel("DOB");
        DOB.setForeground(welcomeText);
        DOB.setFont(new Font("Garamond", Font.BOLD,23));
        panel.add(DOB);
        
        JTextField txtDOB = new JTextField(25);
        txtDOB.setForeground(Color.BLACK);
        txtDOB.setFont(new Font("Garamond", Font.PLAIN,19));
        panel.add(txtDOB);
        
        JButton submit = new JButton("Create Account");
        submit.setForeground(buttobBlue);
        submit.setFont(new Font("Garamond", Font.PLAIN,19));
        submit.setBorder(null);
        panel.add(submit);
        
        
         
        label.setBounds(80, 0, 500, 70);
        bankLogo.setBounds(130, 50, 150, 150);
        lblCreateAccount.setBounds(250, 50, 200, 150);
        accountNumber.setBounds(100, 200, 200, 50);
        txtAccountNumber.setBounds(300, 200, 200, 50);
        FirstName.setBounds(50, 300, 150, 50);
        txtFirstName.setBounds(200, 300, 100, 50);
        LastName.setBounds(320, 300, 150, 50);
        txtLastName.setBounds(440, 300, 100, 50);
        idNumber.setBounds(55, 400, 150, 50);
        txtIdNumber.setBounds(200, 400, 100, 50);
        DOB.setBounds(320, 400, 150, 50);
        txtDOB.setBounds(440, 400, 100, 50);
        submit.setBounds(180, 490, 200, 50);
        
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
            }
        });

        
//        frame.setBackground(welcomeColor);
        frame.setSize(600,600);
        frame.setLocation(400,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
  }
}