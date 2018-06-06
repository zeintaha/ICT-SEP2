package view.secretary.patient.addpatient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import controller.patient.AddPatientController;



public class AddPatientButtonHandler implements ActionListener
{
   private AddPatientGUI addPatientGUI;
   private AddPatientController addPatientController;



   public AddPatientButtonHandler(AddPatientGUI addPatientGUI,
         AddPatientController addPatientController)
   {

      this.addPatientGUI = addPatientGUI;
      this.addPatientController = addPatientController;
   }



   @Override
   public void actionPerformed(ActionEvent e)
   {
      if (!(e.getSource() instanceof JButton))
         return;
      try
      {
        
         addPatientController.executes();
      }
      catch (RemoteException e1)
      {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }
   }
}
