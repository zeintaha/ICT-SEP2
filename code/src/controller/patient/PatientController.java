package controller.patient;
import java.io.IOException;

import View.patient.searchpatient.*;
import domain.Facad;
import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;
import domain.model.patient.Patient;
import domain.model.patient.PatientList;
public class PatientController {

	   private PatientModel patientModel;
	  
	   private SearchPatientGUI addpatient;
	   private Facad facad;
	  
	   
	   public PatientController(PatientModel patientModel, SearchPatientGUI view) throws ClassNotFoundException, IOException {
		   this.patientModel = patientModel;
	      this.addpatient=view;
	      
	     
	   }
	   
	   public void executes(String what) {
		   Patient patient = patientModel.getPatientByName(what);
		   System.out.println(patient.toString());

	}
}