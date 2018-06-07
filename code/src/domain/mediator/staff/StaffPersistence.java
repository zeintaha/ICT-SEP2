package domain.mediator.staff;

import java.io.IOException;
import java.util.ArrayList;

import domain.model.staff.Employee;
import domain.model.staff.EmployeeList;


public interface StaffPersistence
{
   public EmployeeList load(String name) throws IOException;
   public void save(Employee employee) throws IOException;
   public void remove(Employee employee) throws IOException;
   public void updateEmployee(Employee employee) throws IOException;
   public ArrayList<Employee> loadLogIn();
  

   
}
