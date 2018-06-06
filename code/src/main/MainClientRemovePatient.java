package main;

import java.io.IOException;

import clients.Client;
import controller.patient.RemovePatientController;
import view.secretary.patient.removepatient.RemovePatientGUI;

public class MainClientRemovePatient {
	public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
	      Client model = new Client();
	      RemovePatientGUI view = new RemovePatientGUI();
	      RemovePatientController controller = new RemovePatientController(model, view);
	      view.start(controller);
	   }

}
