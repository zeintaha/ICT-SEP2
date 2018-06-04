package domain.model.staff;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

public class EmployeeListTest
{

   private ArrayList<Employee> employees;
   private Employee employee;

   @Before
   public void setUp() throws Exception
   {
      EmployeeList employees1 = new EmployeeList();
      Calendar calendar = new GregorianCalendar(1987, 9, 5);
      Date dob = new GregorianCalendar(2017, Calendar.SEPTEMBER, 5).getTime();
      Date startdate = calendar.getTime();
      employee = new Doctor("AlexV", "12345", "Alexandru", "Vieru", 4567, dob,
            startdate, "23456709", "alex@gmail.com", 'M');

   }

   // @Test
   // public void testadd()
   // {
   // int x = employees.size();
   // employees.add(employee);
   // assertEquals(1, employees.size() - x);
   //
   // }
   //
   // @Test
   // public void testremove()
   // {
   // int x = employees.size();
   // employees.remove(employee);
   // assertEquals(0, employees.size() - x);
   //
   // }

   @Test
   public void testGetEmployeeByName()
   {
      EmployeeList employees1 = new EmployeeList();
      Calendar calendar = new GregorianCalendar(1987, 9, 5);
      Date dob = new GregorianCalendar(2017, Calendar.SEPTEMBER, 5).getTime();
      Date startdate = calendar.getTime();
      employee = new Doctor("AlexV", "12345", "Alexandru", "Vieru", 4567, dob,
            startdate, "23456709", "alex@gmail.com", 'M');
      employees1.addEmployee(employee);
      assertEquals(employee, employees1.getEmployeeByName("Alexandru"));

   }

   @Test
   public void testGetEmployeeById()
   {
      EmployeeList employees1 = new EmployeeList();
      Calendar calendar = new GregorianCalendar(1987, 9, 5);
      Date dob = new GregorianCalendar(2017, Calendar.SEPTEMBER, 5).getTime();
      Date startdate = calendar.getTime();
      employee = new Doctor("AlexV", "12345", "Alexandru", "Vieru", 4567, dob,
            startdate, "23456709", "alex@gmail.com", 'M');
      employees1.addEmployee(employee);

      assertEquals(employee, employees1.getEmployeeById(4567));
   }

   @Test
   public void testEditEmployee()
   {
//      EmployeeList employees = new EmployeeList();
//      Calendar calendar = new GregorianCalendar(1987, 9, 5);
//      Date dob = new GregorianCalendar(2017, Calendar.SEPTEMBER, 5).getTime();
//      Date startdate = calendar.getTime();
//      Employee editEmployee= new Secretary("AnaJ", "12345", "Ana", "Larsen", 4567, dob,
//            startdate, "23456709", "alex@gmail.com", 'F');
//         employees.addEmployee(employee);
//         employee.getFirstName();
//         employee.setFirstName("Jenny");
//         assertEquals(employee, employees.getEmployeeByName("Andrei"));

      
      
      
   }
}
