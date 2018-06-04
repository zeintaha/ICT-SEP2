package view.secretary.patient.editpatient;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EditPatientGUI extends JFrame
{

   private JPanel contentPane;
   private JTextField txtSearchPatientName;
   private JTextField txtFirstName;
   private JTextField txtLastName;
   private JTextField txtDOB;
   private JTextField txtTel;
   private JTextField txtEmail;
   private JTextField txtGender;

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
               EditPatientGUI frame = new EditPatientGUI();
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
   public EditPatientGUI()
   {
      setTitle("Edit Patient");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 615);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      txtSearchPatientName = new JTextField();
      txtSearchPatientName.setBounds(220, 30, 116, 22);
      contentPane.add(txtSearchPatientName);
      txtSearchPatientName.setColumns(10);
      
      JComboBox cmbSelectPatient = new JComboBox();
      cmbSelectPatient.setBounds(220, 82, 117, 22);
      contentPane.add(cmbSelectPatient);
      
      txtFirstName = new JTextField();
      txtFirstName.setBounds(221, 149, 116, 22);
      contentPane.add(txtFirstName);
      txtFirstName.setColumns(10);
      
      txtLastName = new JTextField();
      txtLastName.setBounds(221, 201, 116, 22);
      contentPane.add(txtLastName);
      txtLastName.setColumns(10);
      
      txtDOB = new JTextField();
      txtDOB.setBounds(220, 253, 116, 22);
      contentPane.add(txtDOB);
      txtDOB.setColumns(10);
      
      txtTel = new JTextField();
      txtTel.setBounds(221, 305, 116, 22);
      contentPane.add(txtTel);
      txtTel.setColumns(10);
      
      txtEmail = new JTextField();
      txtEmail.setBounds(220, 357, 116, 22);
      contentPane.add(txtEmail);
      txtEmail.setColumns(10);
      
      txtGender = new JTextField();
      txtGender.setBounds(220, 409, 116, 22);
      contentPane.add(txtGender);
      txtGender.setColumns(10);
      
      JLabel lblSearchPatientName = new JLabel("Search Patient Name");
      lblSearchPatientName.setBounds(64, 35, 146, 16);
      contentPane.add(lblSearchPatientName);
      
      JLabel lblSelectPatient = new JLabel("Select Patient");
      lblSelectPatient.setBounds(64, 86, 146, 16);
      contentPane.add(lblSelectPatient);
      
      JLabel lblFirstName = new JLabel("First Name");
      lblFirstName.setBounds(64, 152, 146, 16);
      contentPane.add(lblFirstName);
      
      JLabel lblLastName = new JLabel("Last Name");
      lblLastName.setBounds(64, 203, 146, 16);
      contentPane.add(lblLastName);
      
      JLabel lblDateOfBirth = new JLabel("Date of Birth");
      lblDateOfBirth.setBounds(64, 254, 146, 16);
      contentPane.add(lblDateOfBirth);
      
      JLabel lblTelephoneNo = new JLabel("Telephone no.");
      lblTelephoneNo.setBounds(64, 305, 146, 16);
      contentPane.add(lblTelephoneNo);
      
      JLabel lblEmail = new JLabel("Email");
      lblEmail.setBounds(64, 356, 146, 16);
      contentPane.add(lblEmail);
      
      JLabel lblGender = new JLabel("Gender");
      lblGender.setBounds(64, 407, 146, 16);
      contentPane.add(lblGender);
      
      JButton btnSave = new JButton("Save");
      btnSave.setBounds(305, 517, 97, 25);
      contentPane.add(btnSave);
      
      JSeparator separator = new JSeparator();
      separator.setBounds(28, 128, 374, 2);
      contentPane.add(separator);
   }
}
