package view.manager.removeemployee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class RemoveEmployeeGUI extends JFrame
{

   private JPanel contentPane;
   private JTextField txtSearchEmployeeName;
   private JTable tblRemove;

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
               RemoveEmployeeGUI frame = new RemoveEmployeeGUI();
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
   public RemoveEmployeeGUI()
   {
      setTitle("Remove Employee");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 622, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblNewLabel = new JLabel("Search Employee Name");
      lblNewLabel.setBounds(56, 45, 148, 16);
      contentPane.add(lblNewLabel);
      
      txtSearchEmployeeName = new JTextField();
      txtSearchEmployeeName.setBounds(221, 45, 116, 22);
      contentPane.add(txtSearchEmployeeName);
      txtSearchEmployeeName.setColumns(10);
      
      JButton btnSearch = new JButton("Search");
      btnSearch.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnSearch.setBounds(383, 41, 97, 25);
      contentPane.add(btnSearch);
      
      JLabel lblNewLabel_1 = new JLabel("Select Employee");
      lblNewLabel_1.setBounds(56, 94, 148, 16);
      contentPane.add(lblNewLabel_1);
      
      JComboBox cmbSelectEmployee = new JComboBox();
      cmbSelectEmployee.setBounds(221, 91, 116, 22);
      contentPane.add(cmbSelectEmployee);
      
      JButton btnRemoveEmployee = new JButton("Remove");
      btnRemoveEmployee.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnRemoveEmployee.setBounds(383, 90, 97, 25);
      contentPane.add(btnRemoveEmployee);
      
      tblRemove = new JTable();
      tblRemove.setBounds(29, 151, 546, 71);
      contentPane.add(tblRemove);
   }

}
