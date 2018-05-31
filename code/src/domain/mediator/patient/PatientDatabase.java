package domain.mediator.patient;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.stream.Stream;

import domain.model.patient.Patient;
import domain.model.patient.PatientList;
import utility.persistence.MyDatabase;

public class PatientDatabase implements PatientPersistence {
	private Date date = new Date();

	private MyDatabase db;
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";

	private static final String USER = "postgres";
	private static final String PASSWORD = "123456";

	public PatientDatabase() throws ClassNotFoundException {
		this.db = new MyDatabase(DRIVER, URL, USER, PASSWORD);
		if (db != null) {
			System.out.println("database is connected");
		}
	}

	@Override
	public PatientList load(String name) throws IOException {
		String sql = "Select * from \"Clinic\".patient";

		ArrayList<Object[]> results;
		PatientList patients = new PatientList();
		int id=0;
		String firstName = " ", lastName = " ";
		Date dob;
		String telNumber = " ", email = " ";
		String gender = " ";
		try {
			results = db.query(sql);
			for (int i = 0; i < results.size(); i++) {
				Object[] row = results.get(i);
				id = Integer.parseInt(row[0].toString());
				firstName = row[1].toString();
				lastName = row[2].toString();
				dob = (Date)row[3];
				telNumber = row[4].toString();
				email = row[5].toString();
				gender = row[6].toString();

				 Patient patient = new Patient(id, firstName, lastName,dob, telNumber,email, gender);
				patients.addPatient(patient);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// Stream.of(patients.getPatients()).forEach(p ->
		// System.out.println(p.toString()));

		return patients;
	}

	//
	// @Override
	// public void save(CdList cdList) throws IOException {
	// for (int i = 0; i < cdList.getNumberOfCds(); i++) {
	// save(cdList.getCD(i));
	// }
	// }
	//
	@Override
	public synchronized void save(Patient patient) throws IOException {
		{
			java.sql.Date sqlDate = new java.sql.Date(patient.getDob().getTime());
			String firstName = patient.getFirstName().substring(0, 1).toUpperCase()
					+ patient.getFirstName().substring(1);

			try {
				String sql = "INSERT INTO \"Clinic\".patient (firstname, lastname, dob, telnumber,email, gender)"
						+ "VALUES (? , ? , ? , ? , ? , ?);";
				db.update(sql, patient.getFirstName(), patient.getLastName(),
						 patient.getDob(),patient.getTelNumber(),patient.getEmail(), patient.getGender());

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

//		 @Override
//		 public synchronized void remove(Patient patient) throws IOException {
//		 {
//		 try {
//		
//		 sql = "DELETE FROM \"Clinic\".patient WHERE \"Clinic\".patient.firstname = ?
//		 AND \"Clinic\".patient.lastname ="
//		 ?;
//		 db.update(sql, patient.getFirstName(), patient.getLastName(),
//		 patient.getDob(),patient.getTelNumber(),patient.getEmail(), patient.getGender());

//		 } catch (SQLException e) {
//		 e.printStackTrace();
//		 }
//	}
}
	}
