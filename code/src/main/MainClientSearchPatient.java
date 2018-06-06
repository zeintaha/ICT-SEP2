package main;

import java.io.IOException;

import clients.Client;
import controller.patient.SearchPatientController;
import view.secretary.patient.searchpatient.SearchPatientGUI;

public class MainClientSearchPatient
{
   public static void main(String args[])
         throws IOException, ClassNotFoundException
   {
      Client client = new Client();
      SearchPatientGUI view = new SearchPatientGUI();
      SearchPatientController controller = new SearchPatientController(client,
            view);
      view.start(controller);
   }

}
