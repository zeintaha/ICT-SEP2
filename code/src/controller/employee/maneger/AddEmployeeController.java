package controller.employee.maneger;

import java.io.IOException;

import domain.mediator.staff.StaffClinicModel;
import domain.model.staff.Employee;
import view.manager.addemployee.AddEmployeeGUI;
import view.manager.addemployee.AddEmployeeView;

public class AddEmployeeController
{
   private StaffClinicModel staffClinicModel;
   private AddEmployeeView view;

   public AddEmployeeController(StaffClinicModel staffClinicModel,
         AddEmployeeView view)
         throws ClassNotFoundException, IOException
   {
      super();
      this.staffClinicModel = staffClinicModel;
      this.view = view;
   }

   public void executes(Employee what)
   {
//      Employee employee = staffClinicModel.addOneEmployee(employee);
//      System.out.println(employee.toString());

   }
}
