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
      
      boolean error = false;
      
      for (int i = 0; i < data.length; i++)
      {
         if (data[i].isEmpty())
         {
            view.showError();
            error = true;
            break;
         }
      }
      
      if (error == false)
      {
         client.addPatient(data);
         view.showConfirmation();
         view.cleanInput();
      }

   }

}
