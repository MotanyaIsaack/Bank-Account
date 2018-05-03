/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import static bankaccount.CreateAccount.accountMap;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EtchedBorder;
import javax.swing.event.MouseInputAdapter;

public class Menu extends JFrame{
//    static HashMap<Integer, Object> accountMap = new HashMap<>();
    String DB_URL = "jdbc:mysql://localhost/bankaccount";
      //  Database credentials
    static final String USER = "root" ;
    static final String PASS = "Isaamille2017";
    
        public static void main(String[] args) {
          showSplashScreen splashScreen = new showSplashScreen();

        }
    }
        class showSplashScreen extends JWindow{
            String DB_URL = "jdbc:mysql://localhost/bankaccount";
      //  Database credentials
            static final String USER = "root" ;
            static final String PASS = "Isaamille2017";
            String accountNumber;
            int balance;
            String user;
            String firstName;
            String lastName;
            int idNumber;
            String dob;
            
            Color welcomeColor =  new Color(23, 32, 42);
            Color welcomeText = new Color(236, 240, 241);
            Color welcomeTextO = new Color(52, 152, 219);
            Color buttobBlue = new Color(84, 153, 199);

            static JProgressBar progressBar = new JProgressBar();
            static int count = 1, TIMER_PAUSE = 30, PROGBAR_MAX = 300;
            static Timer progressBarTimer;
            ActionListener al = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    progressBar.setValue(count);
                    if (PROGBAR_MAX == count) {
                        progressBarTimer.stop();
                        showSplashScreen.this.setVisible(false);
                        Login();
                    } 
                    count++;
                }
            };
            public showSplashScreen() {
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

                JLabel bankLogo = new JLabel(new ImageIcon("C://Users/motan/Documents/NetBeansProjects/BankAccount/src/images/designer.jpg"));
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

                
                private void signup() {
                     String DB_URL = "jdbc:mysql://localhost/bankaccount";
                        //  Database credentials
                     String USER = "root" ;
                     String PASS = "Isaamille2017";

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
                    
                    JLabel password = new JLabel("Password");
                    password.setForeground(welcomeText);
                    password.setFont(new Font("Garamond", Font.BOLD,23));
                    panel.add(password);

                    JPasswordField txtPassword = new JPasswordField(25);
                    txtPassword.setForeground(Color.BLACK);
                    txtPassword.setFont(new Font("Garamond", Font.PLAIN,19));
                    panel.add(txtPassword);

                    JButton submit = new JButton("Create Account");
                    submit.setForeground(buttobBlue);
                    submit.setFont(new Font("Garamond", Font.PLAIN,19));
                    submit.setBorder(null);
                    panel.add(submit);
                    
                    int balance = 0;



                    label.setBounds(80, 0, 500, 70);
                    bankLogo.setBounds(130, 50, 150, 150);
                    lblCreateAccount.setBounds(250, 50, 200, 150);
                    FirstName.setBounds(50, 200, 150, 50);
                    txtFirstName.setBounds(200, 200, 100, 50);
                    LastName.setBounds(320, 200, 150, 50);
                    txtLastName.setBounds(440, 200, 100, 50);
                    idNumber.setBounds(55, 300, 150, 50);
                    txtIdNumber.setBounds(200, 300, 100, 50);
                    DOB.setBounds(320, 300, 150, 50);
                    txtDOB.setBounds(440, 300, 100, 50);
                    password.setBounds(130, 390, 200, 50);
                    txtPassword.setBounds(230, 390, 200, 50);
                    submit.setBounds(210, 480, 200, 50);

                    submit.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (txtFirstName.equals("") 
                                    && txtLastName.equals("")&& txtIdNumber.equals("") 
                                    && txtDOB.equals("")) {
                                  JOptionPane.showMessageDialog(null, "Please fill in all the required fields");
                                  
                                  txtFirstName.setText("");
                                  txtLastName.setText("");
                                  txtIdNumber.setText("");
                                  txtDOB.setText("");
                            } else {
                                try {
//                                    String accountNumber ="";
                                    Class.forName("com.mysql.jdbc.Driver");
                                    System.out.println("Connecting to a selected database...");
                                    //STEP 3: Open a connection
                                    Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
                                    System.out.println("Connected database successfully...");
                                    
                                    PreparedStatement statement = conn.prepareStatement("INSERT INTO "
                                            + "account (firstname,lastname,dob,idnumber,balance,password)VALUES('"+txtFirstName.getText()+"',"
                                                    + "'"+txtLastName.getText()+"','"+txtDOB.getText()+"',"
                                                            + "'"+txtIdNumber.getText()+"',"
                                                                    + "'"+balance+"','"+txtPassword.getText()+"')");
                                    statement.execute();
                                    System.out.println("Query Excecuted Succesfully");
                                    JOptionPane.showMessageDialog(null, "Registration Succesful");
                                    PreparedStatement pst = conn.prepareStatement("Select accountnumber from account where "
                                            + "firstname='"+txtFirstName.getText()+"'and lastname='"+txtLastName.getText()+"' and "
                                                    + "dob='"+txtDOB.getText()+"'");
                                    ResultSet rs = pst.executeQuery();
                                    while (rs.next()) {                                        
                                        accountNumber = rs.getString("accountnumber");
                                    }
                                    pst.execute();
                                    JOptionPane.showMessageDialog(null, "Your account number: "+accountNumber+"");
//                                    frame.dispose();
                                    frame.setVisible(false);
                                    Login();
                                } catch (ClassNotFoundException | SQLException ex) {
                                    Logger.getLogger(showSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            
                        }
                    });


            //        frame.setBackground(welcomeColor);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(600,600);
                    frame.setLocation(400,100);
                   
                    frame.setVisible(true);
              }
                
                
                private void Login(){
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

                    JLabel lblLoginAccount = new JLabel("Login to your Account");
                    lblLoginAccount.setFont(new Font("Garamond", Font.BOLD, 20));
                    lblLoginAccount.setForeground(welcomeText);
                    panel.add(lblLoginAccount);

                    JLabel accountNumber = new JLabel("Account Number:");
                    accountNumber.setForeground(welcomeText);
                    accountNumber.setFont(new Font("Garamond", Font.BOLD,23));
                    panel.add(accountNumber);

                    JTextField txtAccountNumber = new JTextField(25);
                    txtAccountNumber.setForeground(Color.BLACK);
                    txtAccountNumber.setFont(new Font("Garamond", Font.PLAIN,19));
                    panel.add(txtAccountNumber);


                    JLabel Password = new JLabel("Password:");
                    Password.setForeground(welcomeText);
                    Password.setFont(new Font("Garamond", Font.BOLD,23));
                    panel.add(Password);

                    JTextField txtPassword = new JTextField(25);
                    txtPassword.setForeground(Color.BLACK);
                    txtPassword.setFont(new Font("Garamond", Font.PLAIN,19));
                    panel.add(txtPassword);

                    JButton login = new JButton("Login");
                    login.setForeground(buttobBlue);
                    login.setFont(new Font("Garamond", Font.PLAIN,19));
                    login.setBorder(null);
                    panel.add(login);
                    
                    JLabel createAccount = new JLabel("Dont have an account? Create Account");
                    createAccount.setForeground(welcomeText);
                    createAccount.setFont(new Font("Garamond", Font.BOLD,23));
                    panel.add(createAccount);




                    label.setBounds(80, 0, 500, 70);
                    bankLogo.setBounds(130, 50, 150, 150);
                    lblLoginAccount.setBounds(250, 50, 200, 150);
                    accountNumber.setBounds(100, 200, 200, 50);
                    txtAccountNumber.setBounds(300, 200, 200, 50);
                    Password.setBounds(100, 300, 200, 50);
                    txtPassword.setBounds(300, 300, 200, 50);
                    login.setBounds(180, 400, 200, 50);
                    createAccount.setBounds(100, 450, 400, 50);
                    
                    createAccount.addMouseListener(new MouseInputAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                             frame.dispose();
                            frame.setVisible(false);
                            signup();
                            
                        }
                        
                    });

                    login.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if ("".equals(txtAccountNumber.getText()) && "".equals(txtPassword.getText())) {
                                JOptionPane.showMessageDialog(null, "Please fill in all the required fields");
                                txtAccountNumber.setText("");
                                txtPassword.setText("");
                            } else {
                                 user = txtAccountNumber.getText();   // Collecting the input
//                                char[] pass = txtPassword.get`; // Collecting the input
                                String pwd = txtPassword.getText();  // converting from array to string
                            if (validate_login(user, pwd)) {
                                JOptionPane.showMessageDialog(null, "Correct Login Credentials");
                                frame.dispose();
                                frame.setVisible(false);
                                Menu();
                            }else{
                                JOptionPane.showMessageDialog(null, "Incorrect Login Credentials"); 
                                 txtAccountNumber.setText("");
                                txtPassword.setText("");
                           }
                                
                               
                            }
                           
                        }
                    });


            //        frame.setBackground(welcomeColor);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(600,600);
                    frame.setLocation(400,100);
                   
                    frame.setVisible(true);
                }
                public void Menu(){
                JPanel main,createAccount,deposit,withdraw,statusCheck;
                JLabel message,thanks,lblCreateAccount,lblDeposit,lblWithdraw,lblStatusCheck;
                JTextField txtAccountNumber;
                Color background =  new Color(23, 32, 42);
                Color backgroundCreateAccount =  new Color(33, 97, 140);
                Color white = new Color(247, 249, 249);
                Color test = new Color(93, 109, 126);
                JFrame frame = new JFrame("Strathmore Bank");
                frame.setLayout(null);

                main = new JPanel();
                main.setSize(600, 600);
                main.setBackground(background);
                main.setLayout(null);
                frame.add(main);


                message = new JLabel("WELCOME TO THE STRATHMORE BANK");
                message.setForeground(white);
                message.setFont(new Font("Courier", Font.BOLD,25));
                main.add(message);

//                accountNumber = new JLabel("Please Enter Your Account Number");
//                accountNumber.setForeground(white);
//                accountNumber.setFont(new Font("SansSerif", Font.PLAIN,19));
//                main.add(accountNumber);
//
//                txtAccountNumber = new JTextField(20);
//                txtAccountNumber.setForeground(black);
//                txtAccountNumber.setFont(new Font("SansSerif", Font.PLAIN,19));
//                main.add(txtAccountNumber);
                deposit = new JPanel();
                deposit.setBackground(test);
        //        deposit.setSize(100, 100);
                main.add(deposit);

                withdraw = new JPanel();
                withdraw.setBackground(test);
        //        withdraw.setSize(100, 100);
                main.add(withdraw);

                statusCheck = new JPanel();
                statusCheck.setBackground(test);
        //        statusCheck.setSize(100, 100);
                main.add(statusCheck);

                
                lblDeposit = new JLabel("Deposit Cash");
                lblDeposit.setFont(new Font("SansSerif", Font.PLAIN,19));
                lblDeposit.setForeground(white);
                deposit.add(lblDeposit);

                lblWithdraw = new JLabel("Withdraw Cash");
                lblWithdraw.setFont(new Font("SansSerif", Font.PLAIN,19));
                lblWithdraw.setForeground(white);
                withdraw.add(lblWithdraw);

                lblStatusCheck = new JLabel("Staus Check");
                lblStatusCheck.setFont(new Font("SansSerif", Font.PLAIN,19));
                lblStatusCheck.setForeground(white);
                statusCheck.add(lblStatusCheck);


                message.setBounds(70, 30, 500, 70);
                deposit.setBounds(70, 200, 200, 100);
                withdraw.setBounds(340, 200, 200, 100);
                statusCheck.setBounds(220, 350, 200, 100);
                
                

              
                
                deposit.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
//                        String sbalance = null;
//                        int balance = 10;
                        try {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(showSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("Connecting to a selected database...");
                            //STEP 3: Open a connection
                            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
                            System.out.println("Connected database successfully...");
                            PreparedStatement pst = conn.prepareStatement("Select balance from account where"
                                    + " accountnumber='"+user+"';");
                            System.out.println(pst);
                                    ResultSet rs = pst.executeQuery();
                                    while (rs.next()) {                                        
                                        balance = rs.getInt("balance");
                                    }
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Available Balance: "+balance+"");
                            String samount=JOptionPane.showInputDialog(null, "Amount: ");
                            int amount=Integer.parseInt(samount);
                            balance = balance + amount;
                             PreparedStatement statement = conn.prepareStatement("UPDATE "
                                            + "account set balance='"+balance+"' where accountnumber='"+user+"';");
                            statement.execute();
                            System.out.println("Query Excecuted Succesfully");
                            JOptionPane.showMessageDialog(null, "Deposit Succesful");
//                            JOptionPane.showMessageDialog(null, "Available Balance: "+balance+"");
                            
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(showSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                });

                withdraw.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                                 try {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(showSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println("Connecting to a selected database...");
                            //STEP 3: Open a connection
                            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
                            System.out.println("Connected database successfully...");
                            PreparedStatement pst = conn.prepareStatement("Select balance from account where"
                                    + " accountnumber='"+user+"';");
                            System.out.println(pst);
                                    ResultSet rs = pst.executeQuery();
                                    while (rs.next()) {                                        
                                        balance = rs.getInt("balance");
                                    }
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Available Balance: "+balance+"");
                            String samount=JOptionPane.showInputDialog(null, "Amount: ");
                            int amount=Integer.parseInt(samount);
                            if (amount<balance) {
                                balance = balance - amount;
                                PreparedStatement statement = conn.prepareStatement("UPDATE "
                                        + "account set balance='"+balance+"' where accountnumber='"+user+"';");
                                System.out.println(statement);
                                statement.execute();
                                System.out.println("Query Excecuted Succesfully");
                                JOptionPane.showMessageDialog(null, "Deposit Succesful");
                                JOptionPane.showMessageDialog(null, "Available Balance: "+balance+"");

                            } else {
                                JOptionPane.showMessageDialog(null, "Insufficient Balance. Please top up account.");
                            }
                           
                            
                        } catch (SQLException ex) {
                            Logger.getLogger(showSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                });

                statusCheck.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            System.out.println("Connecting to a selected database...");
                            //STEP 3: Open a connection
                            Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
                            System.out.println("Connected database successfully...");
                            PreparedStatement pst = conn.prepareStatement("Select * from account where"
                                    + " accountnumber='"+user+"';");
                            ResultSet rs = pst.executeQuery();
                            while (rs.next()) {                                
                                firstName = rs.getString("firstname");
                                lastName = rs.getString("lastname");
                                dob = rs.getString("dob");
                                idNumber = rs.getInt("idnumber");
                            }

                            JOptionPane.showMessageDialog(null, "Account Details: /n "
                                    + "Account Number: "+user+" \n "
                                            + "First Name: "+firstName+" \n "
                                                    + "Last Name: "+lastName+" \n "
                                                            + "Balance: "+balance+"");
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(showSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (SQLException ex) {
                            Logger.getLogger(showSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                });



                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocation(400, 100);
                frame.setSize(600,600);
                frame.setVisible(true);
            }
                private boolean validate_login(String username,String password) {
                    try{           
                    String DB_URL = "jdbc:mysql://localhost/bankaccount";
                      //  Database credentials
                   String USER = "root" ;
                   String PASS = "Isaamille2017";
                   Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
                   Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);  
                   System.out.println("Connected database successfully...");
                   com.mysql.jdbc.PreparedStatement pst = (com.mysql.jdbc.PreparedStatement) conn.prepareStatement("Select accountnumber,password from account where accountnumber=? and password=?");
                   pst.setString(1, username); 
                   pst.setString(2, password);
                   ResultSet rs = pst.executeQuery();                        
                   if(rs.next())            
                       return true;    
                   else
                       return false;            
               }
               catch(Exception e){
                   e.printStackTrace();
                   return false;
               }       
            }
                

        }
       
  

