package domain.mediator.staff;


import java.io.IOException;
import java.util.ArrayList;

import domain.model.staff.Employee;


public interface StaffClinicModel
{

   public void addOneEmployee(String[] employeeData);

   public ArrayList<Employee> getEmployeeByname(String name);
public void remove(int id);
   public String[] reachType();
   public void callLoad(String name) throws IOException ;
   public ArrayList<Employee> getAllEmployeesFromTheList();
   
 

}
