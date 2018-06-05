package view.secretary.appointment.addappointment;

import java.util.ArrayList;

import controller.appointment.addappointment.SearchPatientController;
import domain.model.patient.Patient;

public interface AddAppointmentView {
	public void start(SearchPatientController searchPatientController);

	public String getSearchTxtValue();

	public void showTable(ArrayList<Patient> patients);

	public int getSelectedItemFromBox();

	public void setComboboxValue(int[] ides);

}
