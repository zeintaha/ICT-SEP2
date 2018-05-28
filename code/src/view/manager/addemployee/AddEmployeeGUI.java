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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
      GridBagLayout gbl_contentPane = new GridBagLayout();
      gbl_contentPane.columnWidths = new int[]{62, 162, 184, 0};
      gbl_contentPane.rowHeights = new int[]{22, 23, 24, 25, 26, 27, 28, 29, 38, 25, 0};
      gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
      gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
      contentPane.setLayout(gbl_contentPane);
      
      JLabel lblSelectEmployeeType = new JLabel("Select Employee Type");
      GridBagConstraints gbc_lblSelectEmployeeType = new GridBagConstraints();
      gbc_lblSelectEmployeeType.anchor = GridBagConstraints.NORTH;
      gbc_lblSelectEmployeeType.fill = GridBagConstraints.HORIZONTAL;
      gbc_lblSelectEmployeeType.insets = new Insets(0, 0, 5, 5);
      gbc_lblSelectEmployeeType.gridx = 1;
      gbc_lblSelectEmployeeType.gridy = 0;
      contentPane.add(lblSelectEmployeeType, gbc_lblSelectEmployeeType);
      
      cmbEmployeeType = new JComboBox();
      GridBagConstraints gbc_cmbEmployeeType = new GridBagConstraints();
      gbc_cmbEmployeeType.fill = GridBagConstraints.BOTH;
      gbc_cmbEmployeeType.insets = new Insets(0, 0, 5, 0);
      gbc_cmbEmployeeType.gridx = 2;
      gbc_cmbEmployeeType.gridy = 0;
      contentPane.add(cmbEmployeeType, gbc_cmbEmployeeType);
      
      JLabel lblFirstName = new JLabel("First Name");
      GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
      gbc_lblFirstName.anchor = GridBagConstraints.NORTH;
      gbc_lblFirstName.fill = GridBagConstraints.HORIZONTAL;
      gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
      gbc_lblFirstName.gridx = 1;
      gbc_lblFirstName.gridy = 1;
      contentPane.add(lblFirstName, gbc_lblFirstName);
      
      txtFirstName = new JTextField();
      GridBagConstraints gbc_txtFirstName = new GridBagConstraints();
      gbc_txtFirstName.anchor = GridBagConstraints.WEST;
      gbc_txtFirstName.fill = GridBagConstraints.VERTICAL;
      gbc_txtFirstName.insets = new Insets(0, 0, 5, 0);
      gbc_txtFirstName.gridx = 2;
      gbc_txtFirstName.gridy = 1;
      contentPane.add(txtFirstName, gbc_txtFirstName);
      txtFirstName.setColumns(10);
      
      JLabel lblLastName = new JLabel("Last Name");
      GridBagConstraints gbc_lblLastName = new GridBagConstraints();
      gbc_lblLastName.anchor = GridBagConstraints.NORTH;
      gbc_lblLastName.fill = GridBagConstraints.HORIZONTAL;
      gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
      gbc_lblLastName.gridx = 1;
      gbc_lblLastName.gridy = 2;
      contentPane.add(lblLastName, gbc_lblLastName);
      
      txtLastName = new JTextField();
      GridBagConstraints gbc_txtLastName = new GridBagConstraints();
      gbc_txtLastName.anchor = GridBagConstraints.WEST;
      gbc_txtLastName.insets = new Insets(0, 0, 5, 0);
      gbc_txtLastName.gridx = 2;
      gbc_txtLastName.gridy = 2;
      contentPane.add(txtLastName, gbc_txtLastName);
      txtLastName.setColumns(10);
      
      JLabel lblDateOfBirth = new JLabel("Date of Birth");
      GridBagConstraints gbc_lblDateOfBirth = new GridBagConstraints();
      gbc_lblDateOfBirth.anchor = GridBagConstraints.NORTH;
      gbc_lblDateOfBirth.fill = GridBagConstraints.HORIZONTAL;
      gbc_lblDateOfBirth.insets = new Insets(0, 0, 5, 5);
      gbc_lblDateOfBirth.gridx = 1;
      gbc_lblDateOfBirth.gridy = 3;
      contentPane.add(lblDateOfBirth, gbc_lblDateOfBirth);
      
      txtDOB = new JTextField();
      GridBagConstraints gbc_txtDOB = new GridBagConstraints();
      gbc_txtDOB.anchor = GridBagConstraints.SOUTHWEST;
      gbc_txtDOB.insets = new Insets(0, 0, 5, 0);
      gbc_txtDOB.gridx = 2;
      gbc_txtDOB.gridy = 3;
      contentPane.add(txtDOB, gbc_txtDOB);
      txtDOB.setColumns(10);
      
      JLabel lblTelephoneNo = new JLabel("Telephone no.");
      GridBagConstraints gbc_lblTelephoneNo = new GridBagConstraints();
      gbc_lblTelephoneNo.anchor = GridBagConstraints.NORTH;
      gbc_lblTelephoneNo.fill = GridBagConstraints.HORIZONTAL;
      gbc_lblTelephoneNo.insets = new Insets(0, 0, 5, 5);
      gbc_lblTelephoneNo.gridx = 1;
      gbc_lblTelephoneNo.gridy = 4;
      contentPane.add(lblTelephoneNo, gbc_lblTelephoneNo);
      
      txtTel = new JTextField();
      GridBagConstraints gbc_txtTel = new GridBagConstraints();
      gbc_txtTel.anchor = GridBagConstraints.SOUTHWEST;
      gbc_txtTel.insets = new Insets(0, 0, 5, 0);
      gbc_txtTel.gridx = 2;
      gbc_txtTel.gridy = 4;
      contentPane.add(txtTel, gbc_txtTel);
      txtTel.setColumns(10);
      
      JLabel lblEmail = new JLabel("Email");
      GridBagConstraints gbc_lblEmail = new GridBagConstraints();
      gbc_lblEmail.anchor = GridBagConstraints.NORTH;
      gbc_lblEmail.fill = GridBagConstraints.HORIZONTAL;
      gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
      gbc_lblEmail.gridx = 1;
      gbc_lblEmail.gridy = 5;
      contentPane.add(lblEmail, gbc_lblEmail);
      
      txtEmail = new JTextField();
      GridBagConstraints gbc_txtEmail = new GridBagConstraints();
      gbc_txtEmail.anchor = GridBagConstraints.SOUTHWEST;
      gbc_txtEmail.insets = new Insets(0, 0, 5, 0);
      gbc_txtEmail.gridx = 2;
      gbc_txtEmail.gridy = 5;
      contentPane.add(txtEmail, gbc_txtEmail);
      txtEmail.setColumns(10);
      
      JLabel lblGener = new JLabel("Gender");
      GridBagConstraints gbc_lblGener = new GridBagConstraints();
      gbc_lblGener.anchor = GridBagConstraints.NORTH;
      gbc_lblGener.fill = GridBagConstraints.HORIZONTAL;
      gbc_lblGener.insets = new Insets(0, 0, 5, 5);
      gbc_lblGener.gridx = 1;
      gbc_lblGener.gridy = 6;
      contentPane.add(lblGener, gbc_lblGener);
      
      txtGender = new JTextField();
      GridBagConstraints gbc_txtGender = new GridBagConstraints();
      gbc_txtGender.anchor = GridBagConstraints.SOUTHWEST;
      gbc_txtGender.insets = new Insets(0, 0, 5, 0);
      gbc_txtGender.gridx = 2;
      gbc_txtGender.gridy = 6;
      contentPane.add(txtGender, gbc_txtGender);
      txtGender.setColumns(10);
      
      JLabel lblStartDate = new JLabel("Start Date");
      GridBagConstraints gbc_lblStartDate = new GridBagConstraints();
      gbc_lblStartDate.anchor = GridBagConstraints.NORTH;
      gbc_lblStartDate.fill = GridBagConstraints.HORIZONTAL;
      gbc_lblStartDate.insets = new Insets(0, 0, 5, 5);
      gbc_lblStartDate.gridx = 1;
      gbc_lblStartDate.gridy = 7;
      contentPane.add(lblStartDate, gbc_lblStartDate);
      
      txtStartDate = new JTextField();
      GridBagConstraints gbc_txtStartDate = new GridBagConstraints();
      gbc_txtStartDate.anchor = GridBagConstraints.SOUTHWEST;
      gbc_txtStartDate.insets = new Insets(0, 0, 5, 0);
      gbc_txtStartDate.gridx = 2;
      gbc_txtStartDate.gridy = 7;
      contentPane.add(txtStartDate, gbc_txtStartDate);
      txtStartDate.setColumns(10);
      
      btnAdd = new JButton("Add");
      GridBagConstraints gbc_btnAdd = new GridBagConstraints();
      gbc_btnAdd.anchor = GridBagConstraints.EAST;
      gbc_btnAdd.fill = GridBagConstraints.VERTICAL;
      gbc_btnAdd.gridx = 2;
      gbc_btnAdd.gridy = 9;
      contentPane.add(btnAdd, gbc_btnAdd);
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
