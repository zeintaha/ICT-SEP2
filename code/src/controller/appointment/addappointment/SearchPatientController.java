package controller.appointment.addappointment;


import java.io.IOException;
import java.rmi.RemoteException;

import domain.mediator.patient.RemotePatientModel;
import domain.mediator.patient.ServerPatientModelManager;
import view.secretary.appointment.addappointment.AddAppointmentGUI;

public class SearchPatientController {

       private RemotePatientModel patientModel;
       private AddAppointmentGUI addAppointmentGUI;
        
       public SearchPatientController(RemotePatientModel patientModel,AddAppointmentGUI addAppointmentGUI) 
               throws ClassNotFoundException, IOException 
       {
           this.patientModel = new ServerPatientModelManager();
          this.addAppointmentGUI=addAppointmentGUI;
          
        
       }
      
       public void executes() throws RemoteException {
          
          
           String name = ((AddAppointmentGUI) addAppointmentGUI).getSearchTxtValue();
                   if ( name.length()>1) {
                  
                  
                       name= name.substring(0, 1)
                   .toUpperCase()
                   + ((AddAppointmentGUI) addAppointmentGUI).getSearchTxtValue().substring(1)
                         .toLowerCase();
                   }
                  
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