package view.secretary.patient.addpatient;

import controller.patient.AddPatientController;

public interface AddPatientView
{
   public void start(AddPatientController controller);
   public String[] getTextFieldValues();
}
