package view.secretary.appointment.removeappointment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.appointment.removeappointment.RemoveAppointmentController;
import controller.appointment.removeappointment.SearchApointmnentController;


public class RemoveAppointmentButtonHandler implements ActionListener {
	private SearchApointmnentController searchApointmnentController;
	public RemoveAppointmentButtonHandler(RemoveAppointmentController removeAppointmentController) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		searchApointmnentController.executes();
		
	}

}
