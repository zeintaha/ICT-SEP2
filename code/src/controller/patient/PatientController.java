package controller.patient;
import java.io.IOException;

import domain.mediator.patient.PatientModel;
import domain.model.patient.Patient;
import view.patient.searchpatient.SearchPatientGUI;
public class PatientController {

	   private PatientModel patientModel;
	  
	   private SearchPatientGUI addpatient;
	  
	  
	   
	   public PatientController(PatientModel patientModel, SearchPatientGUI view) throws ClassNotFoundException, IOException {
		   this.patientModel = patientModel;
	      this.addpatient=view;
	      
	     
	   }
	   
	   public void executes(String what) {
		   Patient patient = patientModel.getPatientByName(what);
		   System.out.println(patient.toString());

	}
}