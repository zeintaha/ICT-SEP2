package view.secretary.patient.removepatient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import controller.patient.RemovePatientController;

public class RemovePatientButtonHandler implements ActionListener {

private RemovePatientController removePatientController;
	

public RemovePatientButtonHandler(RemovePatientController removePatientController) {

	this.removePatientController = removePatientController;
}


@Override
	public void actionPerformed(ActionEvent e) {
	 if (!(e.getSource() instanceof JButton))
         return;
      if (((JButton) e.getSource()).getText().startsWith("Search"))
	     {
    	  removePatientController.executes("Search");
	     }if (((JButton) e.getSource()).getText().startsWith("Remove"))
	     {
	    	 removePatientController.executes("Remove");
		     }
      
   }
}