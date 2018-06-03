package domain.mediator.patient;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import domain.model.patient.Patient;
import domain.model.patient.PatientList;
import domain.model.staff.Employee;
import domain.model.staff.EmployeeFactory;

public class PatientModelManager implements PatientModel {
	private PatientList list;
	private PatientDatabase persistence;
	private Patient patient;

	public PatientModelManager() throws IOException, ClassNotFoundException{

		
			this.persistence = new PatientDatabase();
	}
	
	@Override
	public void callLoad(String name) throws IOException {
		this.list = persistence.load(name);
	}
	
	@Override
	public void addPatient(String[] patientData) {
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Date dob = null;
		try {
			dob = format.parse(patientData[2]);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int id = 0;
		String firstName = patientData[0];
		String lastName = patientData[1];
		
		String telNumber = patientData[3];
		String email = patientData[4];
		String gender = patientData[5];
		patient = new Patient(id, firstName, lastName, dob, telNumber, email, gender);
		try {
			persistence.save(patient);
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	}
	@Override
	public ArrayList<Patient> getPatientByName(String name) {
		Patient patient=  list.getPatientByName(name);
		ArrayList<Patient> patients= new ArrayList<Patient>();
		if(patient != null) {
			patients.add(patient);
		}
		
		return patients;
		
	}


	@Override
	public ArrayList<Patient> getAllPatientsFromTheList() {
		return list.getAll();
	}
	
	@Override
	public void remove(int id) {
		Patient patient = list.getPatientById(id);
		if(patient != null) {
		list.removePatient(patient);
		try {
			persistence.remove(patient);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
}
}
