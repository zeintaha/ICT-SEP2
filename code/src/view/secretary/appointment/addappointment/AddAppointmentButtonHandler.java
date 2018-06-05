package view.secretary.appointment.addappointment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import controller.appointment.addappointment.SearchPatientController;



public class AddAppointmentButtonHandler implements ActionListener {
	private SearchPatientController searchPatientController;

	public AddAppointmentButtonHandler(SearchPatientController searchPatientController) {
		this.searchPatientController = searchPatientController;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		try
      {
         searchPatientController.executes();
      }
      catch (RemoteException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

	}

}
