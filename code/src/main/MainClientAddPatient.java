package main;

import java.io.IOException;

import clients.Client;
import controller.patient.AddPatientController;
import domain.mediator.patient.RemotePatientModel;
import domain.mediator.patient.ServerPatientModelManager;
import view.secretary.patient.addpatient.AddPatientGUI;

public class MainClientAddPatient {
	public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
	      Client model = new Client();
	      AddPatientGUI view = new AddPatientGUI();
	      AddPatientController controller = new AddPatientController(model, view);
	      view.start(controller);
	   }
}
