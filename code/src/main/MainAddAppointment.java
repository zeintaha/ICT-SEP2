package main;

import java.io.IOException;

import controller.appointment.addappointment.SearchPatientController;
import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;
import view.secretary.appointment.addappointment.AddAppointmentGUI;

public class MainAddAppointment {
	
	 public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
		 PatientModel model = new PatientModelManager();
		 AddAppointmentGUI view = new AddAppointmentGUI();
		 SearchPatientController controller = new SearchPatientController(model, view);
	      view.start(controller);
	   }
	

}
