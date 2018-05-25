package main;

import java.io.IOException;

import controller.employee.maneger.ManegerController;
import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;
import view.manager.searchemployee.SearchEmployeeGUI;


public class MainManeger
{
   public static void main(String args[])
         throws IOException, ClassNotFoundException
   {
      StaffClinicModel model = new StaffClinicModelManeger();
      
      ManegerController controller = new ManegerController(model);
      SearchEmployeeGUI view = new SearchEmployeeGUI(controller);
      controller.initializeVew(view);
      
    //  view.start(controller);
   }
}