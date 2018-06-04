package view.manager.searchemployee;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchEmployeeGUI extends JFrame
{

   private JPanel contentPane;
   private JTextField txtSearchEmployeeName;
   private JTable tblSearch;

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
               SearchEmployeeGUI frame = new SearchEmployeeGUI();
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
   public SearchEmployeeGUI()
   {
      setTitle("Search Employee");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 688, 321);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      txtSearchEmployeeName = new JTextField();
      txtSearchEmployeeName.setBounds(250, 31, 127, 22);
      contentPane.add(txtSearchEmployeeName);
      txtSearchEmployeeName.setColumns(10);
      
      JButton btnSearch = new JButton("Search");
      btnSearch.setBounds(406, 30, 97, 25);
      btnSearch.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      contentPane.add(btnSearch);
      
      JLabel lblSearchEmployeeName = new JLabel("Search Employee Name");
      lblSearchEmployeeName.setBounds(85, 34, 155, 16);
      contentPane.add(lblSearchEmployeeName);
      
      tblSearch = new JTable();
      tblSearch.setBounds(24, 81, 622, 180);
      contentPane.add(tblSearch);
   }
}
