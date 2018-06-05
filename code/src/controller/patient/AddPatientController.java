package controller.patient;

import java.io.IOException;
import java.rmi.RemoteException;

import clients.Client;
import view.secretary.patient.addpatient.AddPatientView;

public class AddPatientController
{
   private Client client;
   private AddPatientView view;

   public AddPatientController(Client client, AddPatientView view)
         throws ClassNotFoundException, IOException
   {
      this.client = client;
      this.view = view;
   }

   public void executes() throws RemoteException
   {
      String[] data = view.getTextFieldValues();
      client.addPatient(data);
   }

}
