
package View.Patient;

import controller.patient.PatientController;

public interface PatientView
{
   public void start(PatientController controller);

   public void show(String value);

   public String get();
}
