package domain.mediator.staff;

import java.io.IOException;

import domain.model.staff.*;


public interface StaffPersistence
{
   public EmployeeList load();
   public boolean save(Employee employee) throws IOException;
   public void remove(Employee employee);
}
