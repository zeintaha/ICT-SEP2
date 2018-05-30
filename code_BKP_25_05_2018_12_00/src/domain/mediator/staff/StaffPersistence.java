package domain.mediator.staff;

import java.io.IOException;

import domain.model.staff.*;


public interface StaffPersistence
{
   public EmployeeListTest load();
   public boolean save(Employee employee) throws IOException;
   public void remove(Employee employee);
}
