package StaffMediator;

import java.io.IOException;

import Staff.Employee;



public interface StaffPersistance
{
   public void save(Employee employee) throws IOException;
}
