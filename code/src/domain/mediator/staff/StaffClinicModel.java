package domain.mediator.staff;


import java.io.IOException;
import java.util.ArrayList;

import domain.model.staff.*;


public interface StaffClinicModel
{

   public void addOneEmployee(Employee employee);

   public ArrayList<Employee> getEmployeeByname(String name);

   public String[] reachType();
   public void callLoad() throws IOException;
   
 

}
