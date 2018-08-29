package domain.mediator.staff;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

import domain.model.staff.Doctor;
import domain.model.staff.Employee;
import domain.model.staff.EmployeeList;
import utility.persistence.MyDatabase;

public class StaffClinicModelManegerTest
{

   MyDatabase db;
   String DRIVER = "org.postgresql.Driver";
   String URL = "jdbc:postgresql://localhost:5432/postgres";
   String USER = "postgres";
   String PASSWORD = "0940";
   Calendar calendar = new GregorianCalendar(1987, 9, 5);
   Date dob = new GregorianCalendar(2017, Calendar.SEPTEMBER, 5).getTime();
   Date startdate = calendar.getTime();
   StaffDatabase persistence;
   Employee employee;
  ArrayList employeeData = new ArrayList<>();
   Employee emp1 = new Doctor(1, "Oskars", "Arajs", dob, startdate, "12344567",
         "os@os.od", "M", "username", "pasw");
   Employee emp2 = new Doctor(1, "John", "Arajs", dob, startdate, "12344567",
         "os@os.od", "M", "username", "pasw");
   Employee emp3 = new Doctor(1, "Dog", "Arajs", dob, startdate, "12344567",
         "os@os.od", "M", "username", "pasw");
   Employee emp4 = new Doctor(1, "Cat", "Arajs", dob, startdate, "12344567",
         "os@os.od", "M", "username", "pasw");

  
   

   EmployeeList list = new EmployeeList();

   @Test
   public void addOneEmployeeTest() throws IOException, SQLException, NullPointerException
   {
     StaffClinicModel cm = new StaffClinicModelManeger();
     
   {
      
      @Override
      public String[] reachType()
      {
         // TODO Auto-generated method stub
         return null;
      }
      
      @Override
      public ArrayList<Employee> getEmployeeByname(String name)
      {
         // TODO Auto-generated method stub
         return null;
      }
      
      @Override
      public ArrayList<Employee> getAllEmployeesFromTheList()
      {
         // TODO Auto-generated method stub
         return null;
      }
      
      @Override
      public void callLoad(String name) throws IOException
      {
         // TODO Auto-generated method stub
         
      }
      
      @Override
      public void addOneEmployee(String[] employeeData)
      {
         // TODO Auto-generated method stub
         
      }
   };
      
      
      
   }
//
//   
//   @Test
//   void testDeletingPatient()
//   {
//      PatientList patientList = new PatientList();
//      DbsPersistance dbsPersistance = new DBS();
//      ArrayList<Object[]> array = dbsPersistance.getPatientList();
//      
//      for(Object[] object: array) 
//      {
//         String cpr = (String) object[0];
//         String fname = (String) object[1];
//         String lname = (String) object[2];
//         int phone = (int) object[3];
//
//         LocalDate dob = server.parseDateFromDbs((Date) object[4]);
//         String email = (String) object[5];
//         String type = (String) object[6];
//         String gender = (String) object[7];
//
//
//         Patient patient = new Patient(cpr, fname, lname, dob, phone, email, type, gender);
//         patientList.addPatient(patient);;
//      }
//      
//      System.out.println(patientList.getNumberOfPatients());
//      assertEquals(patientList.getNumberOfPatients(),4);
//      
//      try {
//         server.deletePatient("120699-4008");
//      } catch (RemoteException e) {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
//      
//      ArrayList<Object[]> array1 = dbsPersistance.getPatientList();
//      PatientList patientList1 = new PatientList();
//      
//      for(Object[] object: array1) 
//      {
//         String cpr = (String) object[0];
//         String fname = (String) object[1];
//         String lname = (String) object[2];
//         int phone = (int) object[3];
//
//         LocalDate dob = server.parseDateFromDbs((Date) object[4]);
//         String email = (String) object[5];
//         String type = (String) object[6];
//         String gender = (String) object[7];
//
//
//         Patient patient = new Patient(cpr, fname, lname, dob, phone, email, type, gender);
//         patientList1.addPatient(patient);
//      }
//      
//      System.out.println(patientList1.getNumberOfPatients());
//      assertEquals(patientList1.getNumberOfPatients(),3);
//      
//      
   }
 

   }

//   @Test
//   public void getAllEmployeesFromTheListTest()
//   {
//
//      list.addEmployee(emp1);
//      list.addEmployee(emp2);
//      list.addEmployee(emp3);
//
//      assertEquals(list.getAll(), list.getAll());
//
//   }

//   @Test
//   public void callLoadTest() throws IOException, NullPointerException
//   {
//
//      // persistence.load("Oskars");
//
//      try
//      {
//         persistence.save(emp1);
//      }
//      catch (NullPointerException e)
//      {
//         // TODO Auto-generated catch block
//         e.printStackTrace();
//      }
//      // persistence.load("Oskars");
//      System.out.println(persistence.load("Oskars"));
//
//   }

//   @Test
//   public void getEmployeeBynameTest()
//   {
//      list.addEmployee(emp1);
//      list.addEmployee(emp2);
//      assertEquals(emp2, list.getEmployeeByName("John"));
//
//   }


