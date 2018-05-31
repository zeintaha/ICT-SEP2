package domain.mediator.staff;


import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import domain.model.staff.*;


public interface StaffClinicModel
{

   public void addOneEmployee(String[] employeeData);

   public ArrayList<Employee> getEmployeeByname(String name);

   public String[] reachType();
   public void callLoad() throws IOException ;
   
 

}
