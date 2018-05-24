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
	private static final String PASSWORD = "123456789";

	public PatientDatabase() throws ClassNotFoundException {
		this.db = new MyDatabase(DRIVER, URL, USER, PASSWORD);
		if (db != null) {
			System.out.println("database is connected");
		}
	}

	@Override
	public PatientList load() throws IOException {
		String sql = "Select * from \"Clinic\".patient";

		ArrayList<Object[]> results;
		PatientList patients = new PatientList();
		String firstName = "?", lastName = "?", patientid = "?";
		String telNumber = "?", email = "?";
		String dob = "?";
		try {
			results = db.query(sql);
			for (int i = 0; i < results.size(); i++) {
				Object[] row = results.get(i);

				firstName = row[0].toString();
				lastName = row[1].toString();
				patientid = row[2].toString();
				dob = row[3].toString();
				telNumber = row[4].toString();
				email = row[5].toString();

				 Patient patient = new Patient(firstName, lastName, patientid,date,telNumber,email);
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

			try {
				String sql = "SELECT * from \"Clinic\".patient;";
				ArrayList<Object[]> results = db.query(sql, patient.getFirstName(), patient.getLastName(),
						patient.getId(), patient.getDob(), patient.getTelNumber(), patient.getEmail());

				if (results.size() > 0) {
					return;
				}

				sql = "INSERT INTO \"Clinic\".patient (firstname, lastname, patientid, dob, telnumber,email)"
						+ "VALUES (? , ? , ? , ? , ? , ?);";
				db.update(sql, patient.getFirstName(), patient.getLastName(), patient.getId(), patient.getDob(),
						patient.getTelNumber(), patient.getEmail());

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// @Override
		// public synchronized void remove(Patient patient) throws IOException {
		// {
		// try {
		//
		// sql = "DELETE FROM \"Clinic\".patient WHERE \"Clinic\".patient.firstname = ?
		// AND \"Clinic\".patient.lastname ="
		// ?;
		// db.update(sql, patient.getFirstName(), patient.getLastName(),
		// patient.getId(), patient.getDob(), patient.getTelNumber(),
		// patient.getEmail());
		//
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
	}
}
