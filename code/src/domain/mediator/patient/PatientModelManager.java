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
		Date dob = null;
		try {
			dob = format.parse(patientData[2]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int id = 0;
		String firstName = patientData[0];
		String lastName = patientData[1];
		
		String telNumber = patientData[4];
		String email = patientData[5];
		String gender = patientData[6];
		System.out.println(" hi we are creating the object ");
		patient = new Patient(id, firstName, lastName, dob, telNumber, email, gender);
		System.out.println(" object has been created ");		
		System.out.println("we are here object details"  + patient);

		try {
			persistence.save(patient);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
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
