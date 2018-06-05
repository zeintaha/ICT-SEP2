package main;

import java.io.IOException;

import controller.patient.SearchPatientController;

import view.secretary.patient.searchpatient.SearchPatientGUI;
import domain.mediator.patient.RemotePatientModel;
import domain.mediator.patient.ServerPatientModelManager;

public class MainSearchPatient {
	 public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
	      RemotePatientModel model = new ServerPatientModelManager();
	      SearchPatientGUI view = new SearchPatientGUI();
	      SearchPatientController controller = new SearchPatientController(model, view);
	      view.start(controller);
	   }

}
