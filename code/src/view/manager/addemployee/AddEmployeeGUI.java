package view.manager.addemployee;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.employee.manager.AddEmployeeController;

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
		setBackground(Color.RED);
		setTitle("Add Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSelectEmployeeType = new JLabel("Select Employee Type");
		lblSelectEmployeeType.setBounds(5, 5, 207, 45);
		contentPane.add(lblSelectEmployeeType);

		label = new JLabel("");
		label.setBounds(217, 5, 212, 45);
		contentPane.add(label);

		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(5, 55, 207, 45);
		contentPane.add(lblFirstName);

		txtFirstName = new JTextField();
		txtFirstName.setBounds(217, 55, 212, 45);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(5, 105, 207, 45);
		contentPane.add(lblLastName);

		txtLastName = new JTextField();
		txtLastName.setBounds(217, 105, 212, 45);
		contentPane.add(txtLastName);
		txtLastName.setColumns(10);

		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setBounds(5, 155, 207, 45);
		contentPane.add(lblDateOfBirth);

		txtDOB = new JTextField();
		txtDOB.setBounds(217, 155, 212, 45);
		contentPane.add(txtDOB);
		txtDOB.setColumns(10);

		JLabel lblTelephoneNo = new JLabel("Telephone no.");
		lblTelephoneNo.setBounds(5, 205, 207, 45);
		contentPane.add(lblTelephoneNo);

		txtTel = new JTextField();
		txtTel.setBounds(217, 205, 212, 45);
		contentPane.add(txtTel);
		txtTel.setColumns(10);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(5, 255, 207, 45);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(217, 255, 212, 45);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblGener = new JLabel("Gender");
		lblGener.setBounds(5, 305, 207, 45);
		contentPane.add(lblGener);

		txtGender = new JTextField();
		txtGender.setBounds(217, 305, 212, 45);
		contentPane.add(txtGender);
		txtGender.setColumns(10);

		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setBounds(5, 355, 207, 45);
		contentPane.add(lblStartDate);

		txtStartDate = new JTextField();
		txtStartDate.setBounds(217, 355, 212, 45);
		contentPane.add(txtStartDate);
		txtStartDate.setColumns(10);

		label_1 = new JLabel("  ");
		label_1.setBounds(5, 405, 207, 50);
		contentPane.add(label_1);

		btnAdd = new JButton("Add");
		btnAdd.setBounds(217, 405, 212, 50);
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
