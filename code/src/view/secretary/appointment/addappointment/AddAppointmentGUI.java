package view.secretary.appointment.addappointment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class AddAppointmentGUI extends JFrame
{

   private JPanel contentPane;
   private JTextField txtSearchPatientName;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_3;
   private JTextField textField_4;

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
               AddAppointmentGUI frame = new AddAppointmentGUI();
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
   public AddAppointmentGUI()
   {
      setTitle("Add Appointment");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 596, 346);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      txtSearchPatientName = new JTextField();
      txtSearchPatientName.setBounds(146, 11, 86, 20);
      contentPane.add(txtSearchPatientName);
      txtSearchPatientName.setColumns(10);
      
      JLabel lblNewLabel = new JLabel("Search Patient Name");
      lblNewLabel.setBounds(10, 14, 131, 14);
      contentPane.add(lblNewLabel);
      
      JButton btnSearch = new JButton("Search");
      btnSearch.setBounds(242, 10, 86, 23);
      contentPane.add(btnSearch);
      
      JComboBox cmbSelectPatientId = new JComboBox();
      cmbSelectPatientId.setBounds(469, 11, 86, 20);
      contentPane.add(cmbSelectPatientId);
      
      JLabel lblSelectPatientId = new JLabel("Select Patient ID");
      lblSelectPatientId.setBounds(364, 14, 106, 14);
      contentPane.add(lblSelectPatientId);
      
      textField = new JTextField();
      textField.setBounds(20, 69, 86, 20);
      contentPane.add(textField);
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setBounds(131, 69, 86, 20);
      contentPane.add(textField_1);
      textField_1.setColumns(10);
      
      textField_2 = new JTextField();
      textField_2.setBounds(242, 69, 86, 20);
      contentPane.add(textField_2);
      textField_2.setColumns(10);
      
      textField_3 = new JTextField();
      textField_3.setBounds(353, 69, 86, 20);
      contentPane.add(textField_3);
      textField_3.setColumns(10);
      
      textField_4 = new JTextField();
      textField_4.setBounds(464, 69, 86, 20);
      contentPane.add(textField_4);
      textField_4.setColumns(10);
      
      JLabel lblFirstName = new JLabel("First Name");
      lblFirstName.setBounds(20, 49, 73, 14);
      contentPane.add(lblFirstName);
      
      JLabel lblLastName = new JLabel("Last Name");
      lblLastName.setBounds(131, 49, 73, 14);
      contentPane.add(lblLastName);
      
      JLabel lblDateOfBirth = new JLabel("Date of Birth");
      lblDateOfBirth.setBounds(242, 49, 73, 14);
      contentPane.add(lblDateOfBirth);
      
      JLabel lblGende = new JLabel("Gender");
      lblGende.setBounds(357, 49, 73, 14);
      contentPane.add(lblGende);
      
      JLabel lblTelphoneNo = new JLabel("Telephone no.");
      lblTelphoneNo.setBounds(464, 49, 91, 14);
      contentPane.add(lblTelphoneNo);
      
      JComboBox comboBox = new JComboBox();
      comboBox.setBounds(99, 119, 96, 20);
      contentPane.add(comboBox);
      
      JLabel lblSelectAppointmentDay = new JLabel("Select day");
      lblSelectAppointmentDay.setBounds(10, 122, 120, 14);
      contentPane.add(lblSelectAppointmentDay);
      
      JComboBox comboBox_1 = new JComboBox();
      comboBox_1.setBounds(360, 119, 96, 20);
      contentPane.add(comboBox_1);
      
      JLabel lblSelectTime = new JLabel("Select time");
      lblSelectTime.setBounds(271, 119, 79, 14);
      contentPane.add(lblSelectTime);
      
      JTextArea textArea = new JTextArea();
      textArea.setBounds(20, 182, 535, 67);
      contentPane.add(textArea);
      
      JLabel lblBrif = new JLabel("Brief");
      lblBrif.setBounds(20, 163, 535, 14);
      contentPane.add(lblBrif);
      
      JButton btnAdd = new JButton("Add");
      btnAdd.setBounds(466, 273, 89, 23);
      contentPane.add(btnAdd);
   }
}
