package domain.mediator.staff;


import java.io.IOException;

import domain.model.staff.*;


public interface StaffClinicModel
{
   public EmployeeList getAll();
   public void addOneEmployee(Employee employee);
   public void removeEmployee(Employee employee) throws IOException;
   public Employee getEmployeeByname(String name);
   public int getNumberOfEmployees();
   
 

}
