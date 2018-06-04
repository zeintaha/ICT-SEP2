package main;

import java.io.IOException;

import controller.patient.AddPatientController;
import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;
import view.secretary.patient.addpatient.AddPatientGUI;

public class MainAddPatient {
	public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
	      PatientModel model = new PatientModelManager();
	      AddPatientGUI view = new AddPatientGUI();
	      AddPatientController controller = new AddPatientController(model, view);
	      view.start(controller);
	   }
}
