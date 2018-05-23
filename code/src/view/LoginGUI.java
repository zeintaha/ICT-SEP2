package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginGUI extends JFrame
{

   private JPanel contentPane;
   private JTextField txtUsername;
   private JPasswordField txtPassword;

   /**
    * Launch the application.
    */
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
      {
         public void run()
         {
            try
            {
               LoginGUI frame = new LoginGUI();
               frame.setVisible(true);
            }
            catch (Exception e)
            {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public LoginGUI()
   {
      setTitle("Login");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      txtUsername = new JTextField();
      txtUsername.setBounds(210, 48, 137, 22);
      contentPane.add(txtUsername);
      txtUsername.setColumns(10);
      
      JLabel lblUsername = new JLabel("Username");
      lblUsername.setBounds(82, 51, 83, 16);
      contentPane.add(lblUsername);
      
      JLabel lblPassword = new JLabel("Password");
      lblPassword.setBounds(82, 107, 83, 16);
      contentPane.add(lblPassword);
      
      txtPassword = new JPasswordField();
      txtPassword.setBounds(210, 104, 137, 22);
      contentPane.add(txtPassword);
      
      JButton btnLogin = new JButton("Login");
      btnLogin.setBounds(289, 201, 97, 25);
      contentPane.add(btnLogin);
   }
}
