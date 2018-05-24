package view.manager.searchemployee;

import java.awt.BorderLayout;
import java.awt.EventQueue;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Date;
=======
>>>>>>> 90ecc797ccbe4f3f05982b488a98ac9f760655ec

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
<<<<<<< HEAD
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.employee.maneger.SearchEmployeeController;
import domain.model.staff.Employee;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
=======
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
>>>>>>> 90ecc797ccbe4f3f05982b488a98ac9f760655ec
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchEmployeeGUI extends JFrame
{
   private SearchEmployeeController manegerController;
   private JPanel contentPane;
<<<<<<< HEAD
   private JTextField txtName;
   private JTable table;
   private ButtonHandler listener;
=======
   private JTextField txtSearchEmployeeName;
   private JTable tblSearch;
>>>>>>> 90ecc797ccbe4f3f05982b488a98ac9f760655ec

   /**
    * Launch the application.
    */
<<<<<<< HEAD
   // public static void main(String[] args)
   // {
   // EventQueue.invokeLater(new Runnable()
   // {
   // public void run()
   // {
   // try
   // {
   // Search frame = new Search();
   // frame.setVisible(true);
   // }
   // catch (Exception e)
   // {
   // e.printStackTrace();
   // }
   // }
   // });
   // }

   /**
    * Create the frame.
    */
   public SearchEmployeeGUI(SearchEmployeeController manegerController)
   {

=======
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
>>>>>>> 90ecc797ccbe4f3f05982b488a98ac9f760655ec
      setTitle("Search Employee");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 688, 321);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
<<<<<<< HEAD

      JLabel lblEmployeeName = new JLabel("Employee Name");
      lblEmployeeName.setBounds(28, 22, 111, 14);
      contentPane.add(lblEmployeeName);

      txtName = new JTextField();
      txtName.setBounds(149, 19, 135, 17);
      contentPane.add(txtName);
      txtName.setColumns(10);

      JButton btnSearch = new JButton("Search");
=======
      
      txtSearchEmployeeName = new JTextField();
      txtSearchEmployeeName.setBounds(250, 31, 127, 22);
      contentPane.add(txtSearchEmployeeName);
      txtSearchEmployeeName.setColumns(10);
      
      JButton btnSearch = new JButton("Search");
      btnSearch.setBounds(406, 30, 97, 25);
>>>>>>> 90ecc797ccbe4f3f05982b488a98ac9f760655ec
      btnSearch.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
<<<<<<< HEAD
      btnSearch.setBounds(335, 18, 89, 23);
      contentPane.add(btnSearch);

      table = new JTable();
      table.setBounds(28, 77, 396, 152);
      contentPane.add(table);

      this.manegerController = manegerController;
      this.listener = new ButtonHandler(this, this.manegerController);
      if (!(btnSearch == null))
      {

         btnSearch.addActionListener(listener);
      }

      this.setVisible(true);
   }

   public String getName()
   {
      String name = txtName.getText();
      return name;
   }

   public void showTable(ArrayList<Employee> employees)
   {

      String[] columnNames = { "First Name", "Last Name", "id", "dob",
            "startDate", "telNumber", "eamil", "gender" };

      String[][] tableArray = new String[employees.size()][7];

      for (int i = 0; i < employees.size(); i++)
      {
         if(employees.get(i) != null)
//       
         {
         String firstName = employees.get(i).getFirstName();
         String lastName = employees.get(i).getLastName();
         String id = String.valueOf(employees.get(i).getId());

         Date dob = employees.get(i).getDob();
         String dateDob = null;
         if (!(dob == null))
         {
            dateDob = dob.toString();
         }

         Date startDate = employees.get(i).getStartDate();
         String dateStartDate = null;
         if (!(startDate == null))
         {
            dateStartDate = startDate.toString();
         }

         tableArray[i] = new String[] { firstName, lastName, id, dateDob,
               dateStartDate, employees.get(i).getTelNumber(),
               employees.get(i).getEamil(),
               String.valueOf(employees.get(i).getGender()) };
         }
      }
if(!(tableArray == null)&& employees.size()>0) {
      TableModel tableModel = new DefaultTableModel(tableArray, columnNames);

      table.setModel(tableModel);
}
   }

=======
      contentPane.add(btnSearch);
      
      JLabel lblSearchEmployeeName = new JLabel("Search Employee Name");
      lblSearchEmployeeName.setBounds(85, 34, 155, 16);
      contentPane.add(lblSearchEmployeeName);
      
      tblSearch = new JTable();
      tblSearch.setBounds(24, 81, 622, 180);
      contentPane.add(tblSearch);
   }
>>>>>>> 90ecc797ccbe4f3f05982b488a98ac9f760655ec
}
