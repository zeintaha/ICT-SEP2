package controller.patient;
import java.io.IOException;
import java.util.ArrayList;

import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;
import domain.model.patient.Patient;
import view.manager.searchemployee.SearchEmployeeGUI;
import view.secretary.patient.searchpatient.SearchPatientGUI;
import view.secretary.patient.searchpatient.SearchPatientView;
public class SearchPatientController {

	   private PatientModel patientModel;
	   private SearchPatientView searchPatient;
	     
	   public SearchPatientController(PatientModel patientModel, SearchPatientView searchPatient) 
			   throws ClassNotFoundException, IOException 
	   {
		   this.patientModel = new PatientModelManager();
	      this.searchPatient=searchPatient;
	      
	     
	   }
	   
	   public void executes() {
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