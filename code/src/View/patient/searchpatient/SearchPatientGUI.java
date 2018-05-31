package view.patient.searchpatient;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.patient.PatientController;
import domain.model.patient.Patient;

public class SearchPatientGUI extends JFrame implements SearchPatientView {
	private PatientController patientController;
	private JPanel contentPane;
	private JTextField textName;
	private JButton buttonSearch;
	private JTable table;
	private JScrollPane scrollPane;
	private SearchPatientButtonHandler listener;
	private JPanel panel;

	public SearchPatientGUI() {
		initializeComponents();
		addComponentsToFrame();
		createComponents();
	}

	private void initializeComponents() {
		setTitle("Search Patient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
	}

	private void addComponentsToFrame() {
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setBounds(28, 77, 396, 152);

		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);

		panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lbl = new JLabel("Patient Name");
		contentPane.add(lbl);

		textName = new JTextField();
		contentPane.add(textName);
		textName.setColumns(10);

	}

	private void createComponents() {
		buttonSearch = new JButton("Search");
		contentPane.add(buttonSearch);
	}

	@Override
	public void start(PatientController patientController) {

		this.patientController = patientController;
//		this.listener = new SearchPatientButtonHandler(this.patientController);
		if (!(buttonSearch == null)) {

			buttonSearch.addActionListener(listener);
		}
		this.setVisible(true);
	}

	@Override
	public void showTable(ArrayList<Patient> patients) {
		String[] columnNames = { "id", "First Name", "Last Name",  "dob", "Tel Number", "Eamil", "Gender"};

		String[][] tableArray = new String[patients.size()][10];

		for (int i = 0; i < patients.size(); i++) {

			String id = String.valueOf(patients.get(i).getId());

			Date dob = patients.get(i).getDob();
			String dateDob = null;
			if (!(dob == null)) {
				dateDob = dob.toString();
			}


			tableArray[i] = new String[] {id, patients.get(i).getFirstName(), patients.get(i).getLastName(), dateDob, patients.get(i).getTelNumber(), patients.get(i).getEmail(),
					patients.get(i).getGender()};

		}

		TableModel tableModel = new DefaultTableModel(tableArray, columnNames);

		table.setModel(tableModel);

	}

	@Override
	public String get() {
		String name = textName.getText();
		return name;
	}

}
