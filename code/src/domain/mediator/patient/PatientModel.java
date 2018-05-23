package domain.mediator.patient;

import java.io.IOException;

import domain.model.patient.Patient;
import domain.model.patient.PatientList;

public interface PatientModel {
	public PatientList getAll();
	public Patient getPatient(int index);
	 public void addPatient(Patient patient);
	 public void removePatient(Patient patient) throws IOException;
	 public PatientList getPatientByName(String name);
	 public int getNumberOfPatients();
}
