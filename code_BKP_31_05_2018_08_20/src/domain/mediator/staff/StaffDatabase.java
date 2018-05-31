package domain.mediator.staff;

import java.io.IOException;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import domain.model.staff.*;
import utility.persistence.MyDatabase;

public class StaffDatabase {

	private MyDatabase db;
	private final String DRIVER = "org.postgresql.Driver";
	private final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final String USER = "postgres";
	private final String PASSWORD = "0940";

	public StaffDatabase() throws ClassNotFoundException {
		this.db = new MyDatabase(DRIVER, URL, USER, PASSWORD);
	}

	public EmployeeList load() throws IOException {
		String sql = "SELECT * FROM \"Clinic\".employee;";
		ArrayList<Object[]> results;
		EmployeeList employees = new EmployeeList();
		int id = 0;
		String firstname = " ";
		String lastname = " ";
		Date dob;
		Date startdate;
		String telnumber = " ";
		String email = " ";
		String gender = " ";
		String employeetype = "";
		String username = "";
		String employeepassword = "";

		try {
			results = db.query(sql);

			for (int i = 0; i < results.size(); i++) {
				Object[] row = results.get(i);
				id = Integer.parseInt(row[0].toString());

				firstname = row[1].toString();
				lastname = row[2].toString();

				dob = (Date) row[3];
				startdate = (Date) row[4];

				telnumber = row[5].toString();
				email = row[6].toString();

				gender = row[7].toString();

				employeetype = row[8].toString();
				username = row[9].toString();
				employeepassword = row[10].toString();

				// if (row[7] != null) {
				// type = row[7].toString();
				// }
				Employee employee = new Secretary(id, firstname, lastname, dob, startdate, telnumber, email, gender,
						employeetype, username, employeepassword);

				employees.addEmployee(employee);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;
	}

	public synchronized void save(Employee employee) throws IOException {
		{

			try {

				String sql = "INSERT INTO \"Clinic\".employee (firstname, lastname, employeeid, dob, telnumber, email, gender, startdate)"
						+ "VALUES (? , ? , ? , ? , ? , ?, ? , ?);";

				db.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId(), employee.getDob(),
						employee.getTelNumber(), employee.getEamil(), employee.getGender(), employee.getStartDate());

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}