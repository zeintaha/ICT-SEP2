package main;

import java.io.IOException;

import controller.appointment.addappointment.SearchPatientController;
import domain.mediator.patient.RemotePatientModel;
import domain.mediator.patient.ServerPatientModelManager;
import view.secretary.appointment.addappointment.AddAppointmentGUI;

public class MainAddAppointment {
	
	 public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
		 RemotePatientModel model = new ServerPatientModelManager();
		 AddAppointmentGUI view = new AddAppointmentGUI();
		 SearchPatientController controller = new SearchPatientController(model, view);
	      view.start(controller);
	   }
	

}
