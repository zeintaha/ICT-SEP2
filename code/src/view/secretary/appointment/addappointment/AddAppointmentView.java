	package view.secretary.appointment.addappointment;

import controller.appointment.addappointment.AddApointmnentController;

public interface AddAppointmentView {
	public void start(AddApointmnentController addApointmnentController);
	public String getSearchTxtValue();

	public  int getSelectedItemFromBox();
	public void setComboboxValue(int[] ides);

}
