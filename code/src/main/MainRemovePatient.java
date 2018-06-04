package main;

import java.io.IOException;

import controller.patient.RemovePatientController;
import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;
import view.secretary.patient.removepatient.RemovePatientGUI;

public class MainRemovePatient {
	public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
	      PatientModel model = new PatientModelManager();
	      RemovePatientGUI view = new RemovePatientGUI();
	      RemovePatientController controller = new RemovePatientController(model, view);
	      view.start(controller);
	   }

}
