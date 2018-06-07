package view.manager.editemployee;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

import controller.employee.manager.EditEmployeeController;
import controller.employee.manager.SearchEmployeeController;
import domain.model.staff.Employee;

public interface EditEmployeeView
{
  public String getSearchTxtValue();

  public void start(EditEmployeeController controller);

}