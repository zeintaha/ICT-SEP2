package View.Patient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.patient.PatientController;

public class ButtonHandler implements ActionListener
{
   private SearchPatientGUI searchPatientGUI;
   private PatientController patientController;

   public ButtonHandler(SearchPatientGUI searchPatientGUI,
		   PatientController patientController)
   {
      this.searchPatientGUI = searchPatientGUI;
      this.patientController = patientController;
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
     
      patientController.executes("Search");
   }

}