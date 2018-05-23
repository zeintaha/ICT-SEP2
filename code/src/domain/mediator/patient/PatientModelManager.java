package domain.mediator.patient;

import java.io.IOException;
import domain.model.patient.Patient;
import domain.model.patient.PatientList;

public class PatientModelManager implements PatientModel {
	private PatientList list;
	private PatientPersistence persistence;

	public PatientModelManager() {

		try {
			this.persistence = new PatientDatabase();
			this.list = persistence.load();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public PatientList getAll() {
		return list;
	}

	@Override
	public void addPatient(Patient patient) {
		list.addPatient(patient);
//		try {
//			persistence.save(patient);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Override
	public void removePatient(Patient patient) throws IOException {
		list.removePatient(patient);
//		persistence.remove(patient);
	}

	@Override
	public int getNumberOfPatients() {
		return list.getNumberOfPatient();
	}

	@Override
	public PatientList getPatientByName(String name) {
		PatientList patient=  list.getPatientByName(name);
		return patient;
		
	}

	@Override
	public Patient getPatient(int index) {
		// TODO Auto-generated method stub
		return list.getPatient(index);
	}

}
