package view.patient.searchpatient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

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
	   if (!(e.getSource() instanceof JButton))
	         return;
	      System.out.println("I´m here");
	      String name = searchPatientGUI.getName();
	      patientController.executes(name);
   }

}