package controller.appointment.addappointment;


import java.io.IOException;

import domain.mediator.patient.PatientModel;
import domain.mediator.patient.PatientModelManager;
import view.secretary.appointment.addappointment.AddAppointmentGUI;

public class SearchPatientController {

	   private PatientModel patientModel;
	   private AddAppointmentGUI addAppointmentGUI;
	     
	   public SearchPatientController(PatientModel patientModel,AddAppointmentGUI addAppointmentGUI) 
			   throws ClassNotFoundException, IOException 
	   {
		   this.patientModel = new PatientModelManager();
	      this.addAppointmentGUI=addAppointmentGUI;
	      
	     
	   }
	   
	   public void executes() {
		   String name = ((AddAppointmentGUI) addAppointmentGUI).getSearchTxtValue().substring(0, 1)
		           .toUpperCase()
		           + ((AddAppointmentGUI) addAppointmentGUI).getSearchTxtValue().substring(1)
		                 .toLowerCase();
		      
		   try {
			patientModel.callLoad(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   addAppointmentGUI.showTable(patientModel.getAllPatientsFromTheList());
		   
		   
		   int[] ides =  new int[patientModel.getAllPatientsFromTheList().size()];
			for (int i = 0; i < ides.length; i++) {
				ides[i] = patientModel.getAllPatientsFromTheList().get(i).getId();
				
			}
			
			addAppointmentGUI.setComboboxValue(ides);

	}
}