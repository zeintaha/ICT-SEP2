package domain.mediator.staff;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import domain.model.staff.*;
import utility.persistence.MyDatabase;

public class StaffDatabase {

	private Date date = new Date();

	private MyDatabase db;
	private final String DRIVER = "org.postgresql.Driver";
	private final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final String USER = "postgres";
	private final String PASSWORD = "123456";

	public StaffDatabase() throws ClassNotFoundException {
		this.db = new MyDatabase(DRIVER, URL, USER, PASSWORD);
	}
	
/*//
 * public EmployeeList load() throws IOException {
		String sql = "SELECT * FROM \"Clinic\".employee;";
		ArrayList<Object[]> results;
		EmployeeList employees = new EmployeeList();

		String firstName = " ", lastName = " ";
		String telNumber = " ", email = " ";
		String gender = " ";
		String id = "";
		Date startDate;
		Date dob;

		try {
			results = db.query(sql);

			for (int i = 0; i < results.size(); i++) {
				Object[] row = results.get(i);

				firstName = row[0].toString();
				lastName = row[1].toString();
				id = row[2].toString();
				dob = (Date) row[3];
				startDate = (Date) row[7];
				telNumber = row[4].toString();
				email = row[5].toString();
				gender = row[6].toString();

				Employee employee = new Secretary(firstName, lastName, id, dob, startDate, telNumber,email,gender);
				employees.addEmployee(employee);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return employees;
	}

 */

	public EmployeeList load() throws IOException {
		String sql = "SELECT * FROM \"Clinic\".employee;";
		ArrayList<Object[]> results;
		EmployeeList employees = new EmployeeList();

		String firstName = " ", lastName = " ";
		String telNumber = " ", email = " ";
		String gender = " ";
		String id = "";
		Date startDate;
		Date dob;

		try {
			results = db.query(sql);

			for (int i = 0; i < results.size(); i++) {
				Object[] row = results.get(i);

				firstName = row[0].toString();
				lastName = row[1].toString();
				id = row[2].toString();
				dob = (Date) row[3];
				startDate = (Date) row[7];
				telNumber = row[4].toString();
				email = row[5].toString();
				if(row[6]!= null) {
					gender = row[6].toString();
				}
				String type= null;
				if(row[7]!= null) {
					 type = row[7].toString();
				}
				

				Employee employee = new Secretary(firstName, lastName, id, dob, startDate, telNumber,email,gender);
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
				
				
//				Employee selectedEmployee = EmployeeFactory.create(employee.getFirstName(), employee.getLastName(), employee.getId(),
//						null, null, employee.getTelNumber(),employee.getEamil(),employee.getGender(), null);
//				
				
				
				db.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId(), employee.getDob(),
						employee.getTelNumber(), employee.getEamil(), employee.getGender(), employee.getStartDate());

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}