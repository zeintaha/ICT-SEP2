
package view.patient.searchpatient;

import controller.patient.PatientController;

public interface PatientView
{
   public void start(PatientController controller);

   public void show(String value);

   public String getName();
}
