package Main;

import java.io.IOException;

import View.Patient.SearchPatientGUI;
import controller.patient.PatientController;
import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;

public class MainPatient {
	 public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
	      PatientModel model = new PatientModelManager();
	      SearchPatientGUI view = new SearchPatientGUI();
	      PatientController controller = new PatientController(model, view);
	      view.start(controller);
	   }

}
