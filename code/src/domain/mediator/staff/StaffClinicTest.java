package domain.mediator.staff;

import static org.junit.Assert.*; 

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import domain.model.staff.Doctor;
import domain.model.staff.Employee;
import domain.model.staff.EmployeeList;
import utility.persistence.MyDatabase;

public class StaffClinicTest
{

   private Calendar calendar;
   private Date dob;
   private Date startdate;
   private StaffPersistence persistence;
   private EmployeeList list;
   private StaffClinicModel model;
   private Employee emp4;

   @Before
   public void setUp() throws Exception
   {
      model = new StaffClinicModelManeger();
      calendar = new GregorianCalendar(1987, 9, 5);
      dob = new GregorianCalendar(2017, Calendar.SEPTEMBER, 5).getTime();
      startdate = calendar.getTime();
      list = new EmployeeList();
   }

   @Test
   public void test() throws IOException
   {
//     list = persistence.load("Catttt");
     emp4 = new Doctor(1, "Catttt", "Arajs", dob, startdate, "12344567",
           "os@os.od", "M", "username", "pasw");
     
     
     int i = list.getNumerOfEmployees();
     
     String firstName = "Oskar";
     String lastName = "Arajs";
     String dob = "05.12.1993";
     String tlf ="234234";
     String email = "sdf@gmail.com";
     String gender ="M";
     String startDate = "04.06.2018";
     String employeeType = "Doctor";
     String[] employeeData = { firstName, lastName, dob, startDate, tlf, email, gender, employeeType };
     
     model.addOneEmployee(employeeData);
     persistence.save(emp4);
     list = persistence.load("Cat");
     int x = list.getNumerOfEmployees();
//     assertTrue(i<x);
     System.out.println("hi");

     
     
     
   }

}
