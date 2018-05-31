//package controller.patient;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import domain.mediator.patient.PatientModel;
//import domain.model.patient.Patient;
//import domain.model.staff.Employee;
//import view.manager.searchemployee.SearchEmployeeGUI;
//import view.patient.searchpatient.SearchPatientGUI;
//import view.patient.searchpatient.SearchPatientView;
//public class PatientController {
//
//	   private PatientModel patientModel;
//	  
//	   private SearchPatientView searchPatient;
//	  
//	  
//	   
//	   public PatientController(PatientModel patientModel, SearchPatientView searchPatient) throws ClassNotFoundException, IOException {
//		   this.patientModel = patientModel;
//	      patientModel.callLoad();
//	      this.searchPatient=searchPatient;
//	      
//	     
//	   }
//	   
//	   public void executes() {
//		   String name = ((SearchPatientGUI) searchPatient).get();
//		      
//		      ArrayList<Patient> patients = new ArrayList<Patient>();
//		      patients = patientModel.getPatientByName(name);
//		      System.out.println(patients.toString());
//		      searchPatient.showTable(patients);
//
//	}
//}