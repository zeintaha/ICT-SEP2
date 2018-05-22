package View.Maneger;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddEmployee extends JFrame
{

   private JPanel contentPane;
   private JTextField textField;

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
               AddEmployee frame = new AddEmployee();
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
   public AddEmployee()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lbl = new JLabel("Employee Name");
      lbl.setBounds(10, 20, 89, 20);
      contentPane.add(lbl);
      
      textField = new JTextField();
      textField.setBounds(179, 17, 86, 20);
      contentPane.add(textField);
      textField.setColumns(10);
      
      JButton btn = new JButton("Search");
      btn.setBounds(26, 210, 89, 23);
      contentPane.add(btn);
   }
}
