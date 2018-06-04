package main;

import java.io.IOException;

import controller.appointment.addappointment.PatientAppoitmentController;
import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;
import view.secretary.appointment.addappointment.AddAppointmentGUI;

public class MainAddAppointment {
	
	 public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
		 PatientModel model = new PatientModelManager();
		 AddAppointmentGUI view = new AddAppointmentGUI();
		 PatientAppoitmentController controller = new PatientAppoitmentController(model, view);
	      view.start(controller);
	   }
	

}
