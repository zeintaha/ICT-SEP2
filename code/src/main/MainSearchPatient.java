package main;

import java.io.IOException;

import controller.patient.SearchPatientController;

import view.secretary.patient.searchpatient.SearchPatientGUI;
import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;

public class MainSearchPatient {
	 public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
	      PatientModel model = new PatientModelManager();
	      SearchPatientGUI view = new SearchPatientGUI();
	      SearchPatientController controller = new SearchPatientController(model, view);
	      view.start(controller);
	   }

}
