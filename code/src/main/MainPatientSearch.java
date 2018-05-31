package main;

import java.io.IOException;

import view.patient.searchpatient.*;
import controller.patient.SearchPatientController;
import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;

public class MainPatientSearch {
	 public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
	      PatientModel model = new PatientModelManager();
	      SearchPatientGUI view = new SearchPatientGUI();
	      SearchPatientController searchPatientController = new SearchPatientController(model, view);
	      view.start(searchPatientController);
	   }

}
