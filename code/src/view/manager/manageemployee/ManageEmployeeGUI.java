package view.manager.manageemployee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class ManageEmployeeGUI extends JFrame
{

   private JPanel contentPane;

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
               ManageEmployeeGUI frame = new ManageEmployeeGUI();
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
   public ManageEmployeeGUI()
   {
      setTitle("Manage Employee");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JButton btnAddEmployee = new JButton("Add Employee");
      btnAddEmployee.setBounds(147, 30, 138, 25);
      contentPane.add(btnAddEmployee);
      
      JButton btnEditEmployee = new JButton("Edit Employee");
      btnEditEmployee.setBounds(147, 85, 138, 25);
      contentPane.add(btnEditEmployee);
      
      JButton btnRemoveEmployee = new JButton("Remove Employee");
      btnRemoveEmployee.setBounds(147, 140, 138, 25);
      contentPane.add(btnRemoveEmployee);
      
      JButton btnSearchEmployee = new JButton("Search Employee");
      btnSearchEmployee.setBounds(147, 195, 138, 25);
      contentPane.add(btnSearchEmployee);
   }

}
