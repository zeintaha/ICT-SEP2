package domain.mediator.patient;

import java.io.IOException;
import java.util.ArrayList;

import domain.model.patient.Patient;
import domain.model.staff.Employee;

public interface PatientModel {
	public void addPatient(String[] patientData);
	public void remove(int id);
	public ArrayList<Patient> getPatientByName(String name);
	public void callLoad(String name) throws IOException ;
	public ArrayList<Patient> getAllPatientsFromTheList();
}
