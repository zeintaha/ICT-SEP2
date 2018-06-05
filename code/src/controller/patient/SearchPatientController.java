package controller.patient;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import domain.mediator.patient.RemotePatientModel;
import domain.mediator.patient.ServerPatientModelManager;
import domain.model.patient.Patient;
import view.manager.searchemployee.SearchEmployeeGUI;
import view.secretary.patient.searchpatient.SearchPatientGUI;
import view.secretary.patient.searchpatient.SearchPatientView;
public class SearchPatientController {

	   private RemotePatientModel patientModel;
	   private SearchPatientView searchPatient;
	     
	   public SearchPatientController(RemotePatientModel patientModel, SearchPatientView searchPatient) 
			   throws ClassNotFoundException, IOException 
	   {
		   this.patientModel = new ServerPatientModelManager();
	      this.searchPatient=searchPatient;
	      
	     
	   }
	   
	   public void executes() throws RemoteException {
		   String name = ((SearchPatientGUI) searchPatient).get().substring(0, 1)
		           .toUpperCase()
		           + ((SearchPatientGUI) searchPatient).get().substring(1)
		                 .toLowerCase();
		      
		   try {
			patientModel.callLoad(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		      searchPatient.showTable(patientModel.getAllPatientsFromTheList());

	}
}