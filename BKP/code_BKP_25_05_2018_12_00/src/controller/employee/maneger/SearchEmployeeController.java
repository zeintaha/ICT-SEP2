package controller.employee.maneger;

import java.io.IOException;
import java.util.ArrayList;


import domain.mediator.staff.StaffClinicModel;
import domain.mediator.staff.StaffClinicModelManeger;
import domain.model.staff.Employee;
import view.manager.searchemployee.SearchEmployeeGUI;

public class SearchEmployeeController
{
   private StaffClinicModel staffClinicModel;
   private SearchEmployeeGUI searchEmployee;

   public SearchEmployeeController(StaffClinicModel model)
         throws ClassNotFoundException, IOException
   {
      staffClinicModel = new StaffClinicModelManeger();
   }

   public void initializeVew(SearchEmployeeGUI view)
   {
      this.searchEmployee = view;
   }

   public void executes()
   {
      String name = searchEmployee.getName();
      ArrayList<Employee> employees = new ArrayList<Employee>();
      employees = staffClinicModel.getEmployeeByname(name);
      System.out.println(employees.toString());
      searchEmployee.showTable(employees);
   }

}
