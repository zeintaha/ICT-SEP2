package view.secretary.appointment.addappointment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.appointment.addappointment.PatientAppoitmentController;

public class AddAppointmentButtonHandler implements ActionListener {
	private PatientAppoitmentController patientAppoitmentController;

	public AddAppointmentButtonHandler(PatientAppoitmentController patientAppoitmentController) {
		this.patientAppoitmentController = patientAppoitmentController;
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		patientAppoitmentController.executes();
		
	}

}
