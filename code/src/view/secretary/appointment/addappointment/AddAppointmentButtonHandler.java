package view.secretary.appointment.addappointment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.appointment.addappointment.SearchPatientController;



public class AddAppointmentButtonHandler implements ActionListener {
	private SearchPatientController searchPatientController;

	public AddAppointmentButtonHandler(SearchPatientController searchPatientController) {
		this.searchPatientController = searchPatientController;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		searchPatientController.executes();

	}

}
