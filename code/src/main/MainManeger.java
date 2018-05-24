package main;

import java.io.IOException;

import controller.employee.maneger.SearchEmployeeController;
import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;
import view.manager.searchemployee.SearchEmployeeGUIOld;

public class MainManeger
{
   public static void main(String args[])
         throws IOException, ClassNotFoundException
   {
      StaffClinicModel model = new StaffClinicModelManeger();
<<<<<<< HEAD
      
      SearchEmployeeController controller = new SearchEmployeeController(model);
      SearchEmployeeGUI view = new SearchEmployeeGUI(controller);
      controller.initializeVew(view);
      
    //  view.start(controller);
=======
      SearchEmployeeGUIOld view = new SearchEmployeeGUIOld();
      ManegerController controller = new ManegerController(model, view);
      view.start(controller);
>>>>>>> 90ecc797ccbe4f3f05982b488a98ac9f760655ec
   }
}