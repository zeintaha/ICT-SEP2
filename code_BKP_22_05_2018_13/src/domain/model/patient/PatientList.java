package domain.model.patient;

import java.util.ArrayList;

public class PatientList {
	private ArrayList<Patient> patients;

	public PatientList() {
		patients = new ArrayList<Patient>();
	}
	
	public Patient getPatient(int index)
	   {
	      return patients.get(index);
	   }
	public void addPatient(Patient patient) {
		patients.add(patient);

	}

	public void removePatient(Patient patient) {
		patients.remove(patient);

	}

	public Patient getPatientByName(String name) {
		for (int i = 0; i < patients.size(); i++) {
			if (patients.get(i).getFirstName().equals(name)) {
				return patients.get(i);
			}
		}
		System.out.println(" we can not find the patient wiht the name : " + name + "!! ");
		return null;
	}

	public Patient editPatient(String oldName, String newName) {

		Patient patient=getPatientByName(oldName);
				patient.setFirstName(newName);
				return patient;
	}

	public Patient searchPatientByName(String name) {
		Patient patient=getPatientByName(name);
		return patient;
	}


	public int getNumberOfPatient() {
		// TODO Auto-generated method stub
		return patients.size();
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}

}
