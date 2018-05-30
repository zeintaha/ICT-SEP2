package view.manager.addemployee;

import controller.employee.manager.AddEmployeeController;
import domain.model.staff.Employee;

public interface AddEmployeeView
{
   public void start(AddEmployeeController controller);
   
   public String[] getTextFieldValues();
}
