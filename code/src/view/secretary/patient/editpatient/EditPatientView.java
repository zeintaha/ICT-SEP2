package view.secretary.patient.editpatient;

import controller.employee.manager.EditEmployeeController;
import controller.patient.EditPatientController;

public interface EditPatientView
{
  public void start(EditPatientController controller);
  public String getSearchTxtValue();
}