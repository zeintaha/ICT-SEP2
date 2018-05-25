package view.manager.searchemployee;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.employee.maneger.ManegerController;
import domain.model.staff.Employee;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class SearchEmployeeGUI extends JFrame
{
   private ManegerController manegerController;
   private JPanel contentPane;
   private JTextField txtName;
   private JTable table;
   private ButtonHandler listener;

   /**
    * Launch the application.
    */
//   public static void main(String[] args)
//   {
//      EventQueue.invokeLater(new Runnable()
//      {
//         public void run()
//         {
//            try
//            {
//               Search frame = new Search();
//               frame.setVisible(true);
//            }
//            catch (Exception e)
//            {
//               e.printStackTrace();
//            }
//         }
//      });
//   }

   /**
    * Create the frame.
    */
   public SearchEmployeeGUI(ManegerController manegerController)
   {
      
      
      
      setTitle("Search Employee");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblEmployeeName = new JLabel("Employee Name");
      lblEmployeeName.setBounds(28, 22, 76, 14);
      contentPane.add(lblEmployeeName);
      
      txtName = new JTextField();
      txtName.setBounds(149, 19, 135, 17);
      contentPane.add(txtName);
      txtName.setColumns(10);
      
      JButton btnSearch = new JButton("Search");
      btnSearch.setBounds(335, 18, 89, 23);
      contentPane.add(btnSearch);
      
      table = new JTable();
      table.setBounds(28, 77, 396, 152);
      contentPane.add(table);
      
      
      this.manegerController= manegerController;
      this.listener = new ButtonHandler(this,this.manegerController);
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
 
 public void showTable(ArrayList<Employee> employees) {
    
    String[] columnNames = {"First Name",
          "Last Name",
          "id",
          "dob",
          "startDate","telNumber","eamil","gender"};
    
    String[][] tableArray = new String[employees.size()][7];    
    
    

    for (int i = 0; i < employees.size(); i++)
   {
       
       String firstName = employees.get(i).getFirstName();
      
       if(!(firstName==null) ) {
          String firstNameTable = null;
          firstNameTable = firstName.toString();
       }
       
       String lastName = employees.get(i).getLastName();
       String id = String.valueOf(employees.get(i).getId());
       
       
       Date dob = employees.get(i).getDob();
       String dateDob = null;
       if(!(dob==null) ) {
          dateDob = dob.toString();
       }
       
       Date startDate = employees.get(i).getStartDate();
       String dateStartDate = null;
       if(!(startDate==null) ) {
          dateStartDate = startDate.toString();
       }
       
       
             
             
       tableArray[i] = new String[] {firstName,lastName,id,dateDob,dateStartDate,employees.get(i).getTelNumber(),employees.get(i).getEamil(),String.valueOf(employees.get(i).getGender())}; 
       
      
   }
   
      
   
   
    TableModel tableModel = new DefaultTableModel(tableArray, columnNames);

    table.setModel(tableModel);

 }

}
