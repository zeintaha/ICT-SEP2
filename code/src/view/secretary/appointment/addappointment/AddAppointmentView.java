	package view.secretary.appointment.addappointment;

import controller.appointment.addappointment.PatientAppoitmentController;

public interface AddAppointmentView {
	public void start(PatientAppoitmentController patientAppoitmentController);
	public String getSearchTxtValue();

	public  int getSelectedItemFromBox();
	public void setComboboxValue(int[] ides);

}
