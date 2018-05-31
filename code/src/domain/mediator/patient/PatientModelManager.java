package domain.mediator.patient;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import domain.model.patient.Patient;
import domain.model.patient.PatientList;
import domain.model.staff.EmployeeFactory;

public class PatientModelManager implements PatientModel {
	private PatientList list;
	private PatientDatabase persistence;
	private Patient patient;

	public PatientModelManager() throws IOException, ClassNotFoundException{

		
			this.persistence = new PatientDatabase();
			this.list = persistence.load();
	}
	
	@Override
	public void callLoad() throws IOException {
		this.list = persistence.load();
	}
//	@Override
//	public PatientList getAll() {
//		return list;
//	}
//
	@Override
	public void addPatient(String[] patientData) {
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		format.parseObject(patientData[2]);
		
		
		
			Date dob =format.parseObject(patientData[2]);
	
			
		Date startDate = null;
		if (startDate != null) {
			startDate = patientData[2].toString();
			 }
		
		int id = 0;
		String firstName = patientData[0];
		String lastName = patientData[1];
		
		String telNumber = patientData[4];
		String email = patientData[5];
		String gender = patientData[6];
		String employeeType = patientData[7];
		
		patient = EmployeeFactory.create(id, firstName, lastName, dob, startDate, telNumber, email, gender, employeeType, username, password);
			}

//	@Override
//	public void removePatient(Patient patient) throws IOException {
//		list.removePatient(patient);
////		persistence.remove(patient);
//	}
//
//	@Override
//	public int getNumberOfPatients() {
//		return list.getNumberOfPatient();
//	}

	@Override
	public ArrayList<Patient> getPatientByName(String name) {
		Patient patient=  list.getPatientByName(name);
		ArrayList<Patient> patients= new ArrayList<Patient>();
		if(patient != null) {
			patients.add(patient);
		}
		
		return patients;
		
	}
}
