package view.manager.addemployee;

import controller.employee.maneger.AddEmployeeController;
import domain.model.staff.Employee;

public interface AddEmployeeView
{
   public void start(AddEmployeeController controller);
   public void show(String value);
   public void getEmployee();
}
