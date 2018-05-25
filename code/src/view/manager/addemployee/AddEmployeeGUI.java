package view.manager.addemployee;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.employee.maneger.AddEmployeeController;
import domain.model.staff.Doctor;
import domain.model.staff.Employee;
import domain.model.staff.Maneger;

public class AddEmployeeGUI extends JFrame implements AddEmployeeView

{

   private JPanel contentPane;
   private JTextField txtFirstName;
   private JTextField txtLastName;
   private JTextField txtDOB;
   private JTextField txtTel;
   private JTextField txtEmail;
   private JTextField txtGender;
   private JTextField txtStartDate;
   private JButton btnAdd;
   private JComboBox cmbEmployeeType;
   
   private AddEmployeeController addEmployeeController;
   private AddEmployeeButtonHandler listener;
   /**
    * Launch the application.
    */

   /**
    * Create the frame.
    */
   public AddEmployeeGUI()
   {
      setTitle("Add Employee");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 500);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      cmbEmployeeType = new JComboBox();
      cmbEmployeeType.setBounds(236, 26, 116, 22);
      contentPane.add(cmbEmployeeType);
      
      JLabel lblSelectEmployeeType = new JLabel("Select Employee Type");
      lblSelectEmployeeType.setBounds(62, 26, 162, 16);
      contentPane.add(lblSelectEmployeeType);
      
      txtFirstName = new JTextField();
      txtFirstName.setBounds(236, 73, 116, 22);
      contentPane.add(txtFirstName);
      txtFirstName.setColumns(10);
      
      txtLastName = new JTextField();
      txtLastName.setBounds(236, 120, 116, 22);
      contentPane.add(txtLastName);
      txtLastName.setColumns(10);
      
      txtDOB = new JTextField();
      txtDOB.setBounds(236, 167, 116, 22);
      contentPane.add(txtDOB);
      txtDOB.setColumns(10);
      
      txtTel = new JTextField();
      txtTel.setBounds(236, 214, 116, 22);
      contentPane.add(txtTel);
      txtTel.setColumns(10);
      
      txtEmail = new JTextField();
      txtEmail.setBounds(236, 261, 116, 22);
      contentPane.add(txtEmail);
      txtEmail.setColumns(10);
      
      txtGender = new JTextField();
      txtGender.setBounds(236, 308, 116, 22);
      contentPane.add(txtGender);
      txtGender.setColumns(10);
      
      txtStartDate = new JTextField();
      txtStartDate.setBounds(236, 355, 116, 22);
      contentPane.add(txtStartDate);
      txtStartDate.setColumns(10);
      
      JLabel lblFirstName = new JLabel("First Name");
      lblFirstName.setBounds(62, 72, 162, 16);
      contentPane.add(lblFirstName);
      
      JLabel lblLastName = new JLabel("Last Name");
      lblLastName.setBounds(62, 118, 162, 16);
      contentPane.add(lblLastName);
      
      JLabel lblDateOfBirth = new JLabel("Date of Birth");
      lblDateOfBirth.setBounds(62, 164, 162, 16);
      contentPane.add(lblDateOfBirth);
      
      JLabel lblTelephoneNo = new JLabel("Telephone no.");
      lblTelephoneNo.setBounds(62, 210, 162, 16);
      contentPane.add(lblTelephoneNo);
      
      JLabel lblEmail = new JLabel("Email");
      lblEmail.setBounds(62, 256, 162, 16);
      contentPane.add(lblEmail);
      
      JLabel lblGener = new JLabel("Gender");
      lblGener.setBounds(62, 302, 162, 16);
      contentPane.add(lblGener);
      
      JLabel lblStartDate = new JLabel("Start Date");
      lblStartDate.setBounds(62, 348, 162, 16);
      contentPane.add(lblStartDate);
      
      btnAdd = new JButton("Add");
      btnAdd.setBounds(323, 415, 97, 25);
      contentPane.add(btnAdd);
   }

   @Override
   public void start(AddEmployeeController controller)
   {
      
     this.addEmployeeController= controller;
     this.listener = new AddEmployeeButtonHandler(this,this.addEmployeeController);
     if (!(btnAdd == null))
     {

        btnAdd.addActionListener(listener);
     }
        
     setVisible(true);
      
   }

   @Override
   public void show(String value)
   {
    
      
   }

   @Override
   public void getEmployee()
   {
//      if (cmbEmployeeType.getSelectedItem().toString().equals("Doctor"))
//      {
//         Employee employee= new Doctor(txtFirstName.getText(),txtLastName.getText(),txtDOB.getColumns());    
//      }
     
   }



}
