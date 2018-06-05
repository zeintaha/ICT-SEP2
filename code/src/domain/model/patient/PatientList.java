package domain.model.patient;

import java.io.Serializable;
import java.util.ArrayList;


public class PatientList implements Serializable{
	ArrayList<Patient> patients;

	public PatientList() {
		patients = new ArrayList<Patient>();
	}

	public void addPatient(Patient patient) {
		patients.add(patient);

	}

	public void removePatient(Patient patient) {
		patients.remove(patient);

	}

	public Patient getPatientByName(String name) {
		for (int i = 0; i < patients.size(); i++) {
			if (patients.get(i).getFirstName().equalsIgnoreCase(name)) {
				return patients.get(i);
			}
		}
		System.out.println(" we can not find the patient with the name : " + name + "!! ");
		return null;
	}
	
	public Patient getPatientById(int id ) {
		Patient patient = null;
		for (int i = 0; i < patients.size(); i++) {
			if (patients.get(i).getId()== id) {
				patient= patients.get(i);
			}
			
		}
		return patient;
		
	}

	public Patient editPatient(String oldName, String newName) {

		Patient patient = getPatientByName(oldName);
		patient.setFirstName(newName);
		return patient;
	}

	public Patient searchPatientByName(String name) {
		Patient patient = getPatientByName(name);
		return patient;
	}

	public int getNumberOfPatient() {
		return patients.size();
	}
	
	public ArrayList<Patient> getAll(){
		return patients;
	}
}
