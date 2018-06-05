package view.secretary.appointment.addappointment;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.appointment.addappointment.SearchPatientController;
import domain.model.patient.Patient;

public class AddAppointmentGUI extends JFrame implements AddAppointmentView {
	private SearchPatientController searchPatientController;
	private JPanel contentPane;
	private JTextField txtSearchPatientName;
	private JLabel lblNewLabel;
	private JButton btnSearch;
	private JComboBox cmbSelectPatientId;
	private JLabel lblSelectPatientId;
	private JComboBox cmbSelectYear;
	private JComboBox cmbSelectMonth;
	private JTextArea textArea;
	private JButton btnAdd;
	private JComboBox cmbSelectDay;
	private JComboBox cmbSelectTime;
	private AddAppointmentButtonHandler listener;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public AddAppointmentGUI() {
		setTitle("Add Appointment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtSearchPatientName = new JTextField();
		txtSearchPatientName.setBounds(146, 11, 86, 20);
		contentPane.add(txtSearchPatientName);
		txtSearchPatientName.setColumns(10);

		this.lblNewLabel = new JLabel("Search Patient Name");
		lblNewLabel.setBounds(10, 14, 131, 14);
		contentPane.add(lblNewLabel);

		this.cmbSelectPatientId = new JComboBox();
		cmbSelectPatientId.setBounds(469, 11, 86, 20);
		contentPane.add(cmbSelectPatientId);

		this.lblSelectPatientId = new JLabel("Select Patient ID");
		lblSelectPatientId.setBounds(364, 14, 106, 14);
		contentPane.add(lblSelectPatientId);

		this.cmbSelectYear = new JComboBox();
		cmbSelectYear.setBounds(34, 173, 96, 20);
		contentPane.add(cmbSelectYear);

		JLabel lblSelectAppointmentDay = new JLabel("Select Year");
		lblSelectAppointmentDay.setBounds(34, 148, 79, 14);
		contentPane.add(lblSelectAppointmentDay);

		this.cmbSelectMonth = new JComboBox();
		cmbSelectMonth.setBounds(169, 173, 96, 20);
		contentPane.add(cmbSelectMonth);

		JLabel lblSelectTime = new JLabel("Select Month");
		lblSelectTime.setBounds(169, 148, 79, 14);
		contentPane.add(lblSelectTime);

		this.textArea = new JTextArea();
		textArea.setBounds(10, 229, 708, 67);
		contentPane.add(textArea);

		JLabel lblBrif = new JLabel("Brief");
		lblBrif.setBounds(23, 204, 33, 14);
		contentPane.add(lblBrif);

		this.cmbSelectDay = new JComboBox();
		cmbSelectDay.setBounds(304, 173, 96, 20);
		contentPane.add(cmbSelectDay);

		JLabel lblSelectDay = new JLabel("Select Day");
		lblSelectDay.setBounds(304, 148, 79, 14);
		contentPane.add(lblSelectDay);

		this.cmbSelectTime = new JComboBox();
		cmbSelectTime.setBounds(439, 173, 96, 20);
		contentPane.add(cmbSelectTime);

		JLabel lblSelectTime_1 = new JLabel("Select Available Time");
		lblSelectTime_1.setBounds(439, 148, 106, 14);
		contentPane.add(lblSelectTime_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 141, 555, -97);
		contentPane.add(scrollPane);

		table = new JTable();
		contentPane.add(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(2, 55, 716, 93);
		this.btnAdd = new JButton("Add");
		btnAdd.setBounds(596, 172, 89, 23);
		contentPane.add(btnAdd);
		this.btnAdd = new JButton("Add");
		btnAdd.setBounds(466, 273, 89, 23);
		contentPane.add(btnAdd);
	}

	public void start(SearchPatientController searchPatientController) {
		
		this.searchPatientController = searchPatientController;
		this.listener = new AddAppointmentButtonHandler(this.searchPatientController);
		
		if (this.btnSearch != null) {

			btnSearch.addActionListener(listener);
		}


		// now the next button

		this.btnSearch = new JButton("Search");
		btnSearch.setBounds(242, 10, 86, 23);
		contentPane.add(btnSearch);

			btnSearch.addActionListener(listener);
		

		this.setVisible(true);

	}
	// getting the value from the search txt field

	public String getSearchTxtValue() {
		String name = txtSearchPatientName.getText();
		return name;
	}
//  void method which takes integer array to set the ides for the selected patients in the Combobox. 
	@Override
	public void setComboboxValue(int[] ides) {
		for (int i = 0; i < ides.length; i++) {
			cmbSelectPatientId.addItem(ides[i]);
		}
	}

	public int getSelectedItemFromBox() {
		int id = 0;
		id = (int) cmbSelectPatientId.getSelectedItem();

		return id;
	}

	// show table details

	public void showTable(ArrayList<Patient> patients) {

		String[] columnNames = { "id", "First Name", "Last Name", "dob", "Tel Number", "Eamil", "Gender" };

		String[][] tableArray = new String[patients.size()][7];

		for (int i = 0; i < patients.size(); i++) {

			String id = String.valueOf(patients.get(i).getId());

			Date dob = patients.get(i).getDob();
			String dateDob = null;
			if (dob != null) {
				dateDob = dob.toString();
			}

			tableArray[i] = new String[] { id, patients.get(i).getFirstName(), patients.get(i).getLastName(), dateDob,
					patients.get(i).getTelNumber(), patients.get(i).getEmail(), patients.get(i).getGender() };

		}

		TableModel tableModel = new DefaultTableModel(tableArray, columnNames);

		table.setModel(tableModel);

	}
	

	
}
