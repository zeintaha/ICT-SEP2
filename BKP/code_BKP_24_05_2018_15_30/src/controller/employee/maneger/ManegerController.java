package controller.employee.maneger;
import java.io.IOException;


import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;
import domain.model.staff.Employee;
import view.manager.searchemployee.SearchEmployeeGUIOld;

public class ManegerController
{
   private StaffClinicModel staffClinicModel;
  
   private SearchEmployeeGUIOld addManeger;

  
   
   public ManegerController(StaffClinicModel model, SearchEmployeeGUIOld view) throws ClassNotFoundException, IOException {
      staffClinicModel = new StaffClinicModelManeger();
      this.addManeger=view;
      
     
   }
   
   public void executes(String what) {
      
      Employee employee = staffClinicModel.getEmployeeByname(what);
      System.out.println(employee.toString());
     
   }

}
