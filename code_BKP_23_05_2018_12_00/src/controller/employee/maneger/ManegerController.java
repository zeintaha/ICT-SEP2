package controller.employee.maneger;
import java.io.IOException;

import javax.swing.JButton;



import com.sun.glass.ui.View;

import View.Maneger.SearchEmployeeGUI;
import domain.Facad;
import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;
import domain.model.staff.Employee;

public class ManegerController
{
   private StaffClinicModel staffClinicModel;
  
   private SearchEmployeeGUI addManeger;
   private Facad facad;
  
   
   public ManegerController(StaffClinicModel model, SearchEmployeeGUI view) throws ClassNotFoundException, IOException {
      staffClinicModel = new StaffClinicModelManeger();
      this.addManeger=view;
      
     
   }
   
   public void executes(String what) {
      
      Employee employee = staffClinicModel.getEmployeeByname(what);
      System.out.println(employee.toString());
     
   }

}
