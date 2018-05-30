package view.manager.addemployee;

import javax.swing.DefaultComboBoxModel;
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
import domain.model.staff.Type;

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
	public AddEmployeeGUI() {
		setTitle("Add Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSelectEmployeeType = new JLabel("Select Employee Type");
		lblSelectEmployeeType.setBounds(67, 5, 157, 14);
		contentPane.add(lblSelectEmployeeType);

		cmbEmployeeType = new JComboBox(domain.model.staff.Type.enumsToStringArray());
		cmbEmployeeType.setBounds(229, 5, 184, 20);
		contentPane.add(cmbEmployeeType);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(67, 30, 157, 14);
		contentPane.add(lblFirstName);

		txtFirstName = new JTextField();
		txtFirstName.setBounds(229, 30, 86, 20);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(67, 55, 157, 14);
		contentPane.add(lblLastName);

		txtLastName = new JTextField();
		txtLastName.setBounds(229, 55, 86, 20);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);

		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(67, 80, 157, 14);
		contentPane.add(lblDateOfBirth);

		txtDOB = new JTextField();
		txtDOB.setBounds(229, 80, 86, 20);
		contentPane.add(txtDOB);
		txtDOB.setColumns(10);

		JLabel lblTelephoneNo = new JLabel("Telephone no.");
		lblTelephoneNo.setBounds(67, 105, 157, 14);
		contentPane.add(lblTelephoneNo);

		txtTel = new JTextField();
		txtTel.setBounds(229, 106, 86, 20);
		contentPane.add(txtTel);
		txtTel.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(67, 131, 157, 14);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(229, 133, 86, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblGener = new JLabel("Gender");
		lblGener.setBounds(67, 158, 157, 14);
		contentPane.add(lblGener);

		txtGender = new JTextField();
		txtGender.setBounds(229, 161, 86, 20);
		contentPane.add(txtGender);
		txtGender.setColumns(10);

		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setBounds(67, 186, 157, 14);
		contentPane.add(lblStartDate);

		txtStartDate = new JTextField();
		txtStartDate.setBounds(229, 190, 86, 20);
		contentPane.add(txtStartDate);
		txtStartDate.setColumns(10);

		btnAdd = new JButton("Add");
		btnAdd.setBounds(300, 253, 61, 25);
		contentPane.add(btnAdd);
	}

	@Override
	public void start(AddEmployeeController controller) {

		this.addEmployeeController = controller;
		//cmbEmployeeType = new JComboBox<>();
		//cmbEmployeeType.setModel(new DefaultComboBoxModel<>());

		this.listener = new AddEmployeeButtonHandler(this, this.addEmployeeController);
		if (!(btnAdd == null)) {

			btnAdd.addActionListener(listener);
		}
		

		setVisible(true);

	}

@Override
public String[] get() {
	String firstName = txtFirstName.getText();
	String lastName = txtLastName.getText();
	
	String dob = txtDOB.getText();
	String tlf = txtTel.getText();
	String email = txtEmail.getText();
	String gender = txtGender.getText();
	String startDate = txtStartDate.getText();
	String type = null;
//			cmbEmployeeType.getSelectedItem().toString();
	
String[]  employeeData = {firstName,lastName,dob,tlf,email,gender,startDate,type};

	return employeeData;
}

}


