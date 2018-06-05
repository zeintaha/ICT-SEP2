package main;

import java.io.IOException;

import controller.patient.RemovePatientController;
import domain.mediator.patient.RemotePatientModel;
import domain.mediator.patient.ServerPatientModelManager;
import view.secretary.patient.removepatient.RemovePatientGUI;

public class MainRemovePatient {
	public static void main(String args[])
	         throws IOException, ClassNotFoundException
	   {
	      RemotePatientModel model = new ServerPatientModelManager();
	      RemovePatientGUI view = new RemovePatientGUI();
	      RemovePatientController controller = new RemovePatientController(model, view);
	      view.start(controller);
	   }

}
