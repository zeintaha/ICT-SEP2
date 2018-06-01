package view.manager.addemployee;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.employee.manager.AddEmployeeController;
import java.awt.GridLayout;

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
	private JLabel label;
	private JLabel label_1;

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
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblSelectEmployeeType = new JLabel("Select Employee Type");
		contentPane.add(lblSelectEmployeeType);
		
		label = new JLabel("");
		contentPane.add(label);

		JLabel lblFirstName = new JLabel("First Name");
		contentPane.add(lblFirstName);

		txtFirstName = new JTextField();
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name");
		contentPane.add(lblLastName);

		txtLastName = new JTextField();
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);

		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		contentPane.add(lblDateOfBirth);

		txtDOB = new JTextField();
		contentPane.add(txtDOB);
		txtDOB.setColumns(10);

		JLabel lblTelephoneNo = new JLabel("Telephone no.");
		contentPane.add(lblTelephoneNo);

		txtTel = new JTextField();
		contentPane.add(txtTel);
		txtTel.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblGener = new JLabel("Gender");
		contentPane.add(lblGener);

		txtGender = new JTextField();
		contentPane.add(txtGender);
		txtGender.setColumns(10);

		JLabel lblStartDate = new JLabel("Start Date");
		contentPane.add(lblStartDate);

		txtStartDate = new JTextField();
		contentPane.add(txtStartDate);
		txtStartDate.setColumns(10);
		
		label_1 = new JLabel("");
		contentPane.add(label_1);

		btnAdd = new JButton("Add");
		contentPane.add(btnAdd);
	}

	@Override
	public void start(AddEmployeeController controller) {
		this.addEmployeeController = controller;
		cmbEmployeeType = new JComboBox(controller.setComboboxValue());
		cmbEmployeeType.setBounds(229, 5, 184, 20);
		contentPane.add(cmbEmployeeType);

		this.listener = new AddEmployeeButtonHandler(this, this.addEmployeeController);
		if (!(btnAdd == null)) {

			btnAdd.addActionListener(listener);
		}

		setVisible(true);

	}

	@Override
	public String[] getTextFieldValues() {
		String firstName = txtFirstName.getText();
		String lastName = txtLastName.getText();
		String dob = txtDOB.getText();
		String tlf = txtTel.getText();
		String email = txtEmail.getText();
		String gender = txtGender.getText();
		String startDate = txtStartDate.getText();
		String employeeType = cmbEmployeeType.getSelectedItem().toString();
		
		
		
		 
		String[] employeeData = { firstName, lastName, dob, startDate, tlf, email, gender, employeeType };

		return employeeData;
	}

}
