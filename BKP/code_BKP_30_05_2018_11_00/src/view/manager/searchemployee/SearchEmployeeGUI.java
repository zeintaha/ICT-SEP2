package view.manager.searchemployee;

import java.awt.BorderLayout;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.employee.maneger.SearchEmployeeController;
import domain.model.staff.Employee;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;

public class SearchEmployeeGUI extends JFrame implements SearchEmployeeView {
	private SearchEmployeeController searchEmployeeController;
	private JPanel contentPane;
	private JTextField txtName;
	private JTable table;
	private SearchEmployeeButtonHandler listener;

	private JScrollPane scrollPane;
	private JPanel panel;

	public SearchEmployeeGUI() {

		setTitle("Search Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

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

		JLabel lblEmployeeName = new JLabel("Employee Name");
		panel.add(lblEmployeeName);

		txtName = new JTextField();
		panel.add(txtName);
		txtName.setColumns(10);

	}

	public void start(SearchEmployeeController searchEmployeeController) {
		JButton btnSearch = new JButton("Search");
		panel.add(btnSearch);
		this.searchEmployeeController = searchEmployeeController;
		this.listener = new SearchEmployeeButtonHandler(this.searchEmployeeController);
		if (!(btnSearch == null)) {

			btnSearch.addActionListener(listener);
		}

		this.setVisible(true);
	}

	public String get() {
		String name = txtName.getText();
		return name;
	}

	public void showTable(ArrayList<Employee> employees) {

		String[] columnNames = { "First Name", "Last Name", "id", "dob", "startDate", "telNumber", "eamil", "gender" };

		String[][] tableArray = new String[employees.size()][7];

		for (int i = 0; i < employees.size(); i++) {

			String id = String.valueOf(employees.get(i).getId());

			Date dob = employees.get(i).getDob();
			String dateDob = null;
			if (!(dob == null)) {
				dateDob = dob.toString();
			}

			Date startDate = employees.get(i).getStartDate();
			String dateStartDate = null;
			if (!(startDate == null)) {
				dateStartDate = startDate.toString();
			}

			tableArray[i] = new String[] { employees.get(i).getFirstName(), employees.get(i).getLastName(), id, dateDob,
					dateStartDate, employees.get(i).getTelNumber(), employees.get(i).getEamil(),
					String.valueOf(employees.get(i).getGender()) };

		}

		TableModel tableModel = new DefaultTableModel(tableArray, columnNames);

		table.setModel(tableModel);

	}

}
