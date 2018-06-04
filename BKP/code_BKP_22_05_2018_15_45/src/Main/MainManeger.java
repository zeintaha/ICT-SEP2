package Main;

import java.io.IOException;

import View.Maneger.SearchEmployeeGUI;
import controller.employee.maneger.ManegerController;
import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;

public class MainManeger
{
   public static void main(String args[])
         throws IOException, ClassNotFoundException
   {
      StaffClinicModel model = new StaffClinicModelManeger();
      SearchEmployeeGUI view = new SearchEmployeeGUI();
      ManegerController controller = new ManegerController(model, view);
      view.start(controller);
   }
}