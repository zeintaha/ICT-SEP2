package main;

import java.io.IOException;

import controller.employee.maneger.ManegerController;
import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;
import view.manager.searchemployee.SearchEmployeeGUIOld;

public class MainManeger
{
   public static void main(String args[])
         throws IOException, ClassNotFoundException
   {
      StaffClinicModel model = new StaffClinicModelManeger();
      SearchEmployeeGUIOld view = new SearchEmployeeGUIOld();
      ManegerController controller = new ManegerController(model, view);
      view.start(controller);
   }
}