package domain.mediator.staff;

import java.io.IOException;

import domain.model.staff.Employee;

public interface StaffPersistance
{
   public void save(Employee employee) throws IOException;
}
