package domain.mediator.patient;

import java.io.IOException;
import java.util.ArrayList;

import domain.model.patient.Patient;

public interface PatientModel {
	public void addPatient(String[] patientData);
	   public void callLoad() throws IOException ;
	public ArrayList<Patient> getPatientByName(String name);
}
