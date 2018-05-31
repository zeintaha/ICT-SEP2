package controller.employee.manager;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;


import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;
import domain.model.staff.Employee;
import view.manager.searchemployee.SearchEmployeeGUI;
import view.manager.searchemployee.SearchEmployeeView;

public class SearchEmployeeController
{
   private StaffClinicModel staffClinicModel;
   private SearchEmployeeView searchEmployee;

   public SearchEmployeeController(StaffClinicModel model,SearchEmployeeView searchEmployee)
         throws ClassNotFoundException, IOException
   {
	   
      staffClinicModel = new StaffClinicModelManeger();
      staffClinicModel.callLoad();
 
      this.searchEmployee = searchEmployee;
      
   }

  

   public void executes()
   {
      String name = ((SearchEmployeeGUI) searchEmployee).get();
      
      ArrayList<Employee> employees = new ArrayList<Employee>();
      employees = staffClinicModel.getEmployeeByname(name);
      System.out.println(employees.toString());
    searchEmployee.showTable(employees);
   }

}
