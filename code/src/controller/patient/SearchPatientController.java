package controller.patient;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import clients.Client;
import domain.mediator.patient.RemotePatientModel;
import domain.mediator.patient.ServerPatientModelManager;
import domain.model.patient.Patient;
import view.manager.searchemployee.SearchEmployeeGUI;
import view.secretary.patient.searchpatient.SearchPatientGUI;
import view.secretary.patient.searchpatient.SearchPatientView;
public class SearchPatientController {

	   private Client client;
	   private SearchPatientView searchPatient;
	     
	   public SearchPatientController(Client client, SearchPatientView searchPatient) 
			   throws ClassNotFoundException, IOException 
	   {
		   this.client = new Client();
	      this.searchPatient=searchPatient;
	      
	     
	   }
	   
	   public void executes() throws RemoteException {
		   String name = ((SearchPatientGUI) searchPatient).get().substring(0, 1)
		           .toUpperCase()
		           + ((SearchPatientGUI) searchPatient).get().substring(1)
		                 .toLowerCase();
		      
		   try {
		      client.callLoad(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		      searchPatient.showTable(client.getAllPatientsFromTheList());

	}
}