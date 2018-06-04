package main;

import java.io.IOException;

import controller.employee.manager.AddEmployeeController;
import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;
import view.manager.addemployee.AddEmployeeGUI;

public class MainAddEmployee
{

   public static void main(String args[])
         throws IOException, ClassNotFoundException
   {
      StaffClinicModel model = new StaffClinicModelManeger();
      AddEmployeeGUI view = new AddEmployeeGUI();
      AddEmployeeController controller = new AddEmployeeController(model, view);
      view.start(controller);
   }

}
