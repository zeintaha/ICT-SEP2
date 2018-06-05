package main;

import java.io.IOException;

import controller.employee.manager.AddEmployeeController;
import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManager;
import view.manager.addemployee.AddEmployeeGUI;

public class MainAddEmployee
{

   public static void main(String args[])
         throws IOException, ClassNotFoundException
   {
      StaffClinicModel model = new StaffClinicModelManager();
      AddEmployeeGUI view = new AddEmployeeGUI();
      AddEmployeeController controller = new AddEmployeeController(model, view);
      view.start(controller);
   }

}
