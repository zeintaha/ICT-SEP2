package domain.mediator.staff;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import domain.model.staff.*;
import utility.persistence.MyDatabase;

public class StaffDatabase
{
   
   private Date date = new Date();
   
   private  MyDatabase db;
   private  final String DRIVER = "org.postgresql.Driver";
   private  final String URL = "jdbc:postgresql://localhost:5432/postgres";
   private  final String USER = "postgres";
   private  final String PASSWORD = "123456789";

public StaffDatabase() throws ClassNotFoundException {
   this.db = new MyDatabase(DRIVER, URL, USER, PASSWORD);
}

public  EmployeeListTest load() throws IOException
{
   String sql = "SELECT * FROM \"Clinic\".employee;";
   ArrayList<Object[]> results;
   EmployeeListTest employees = new EmployeeListTest();
  
   String firstName = "", lastName = "";
   String telNumber = "", email = "";
   String gender = "", startDate = "";
   String dob = "";
   int id = 0;
   
   
   try
   {
      results = db.query(sql);
     
      
      for (int i = 0; i < results.size(); i++)
      {
         Object[] row = results.get(i);
         

            firstName = row[0].toString();
            lastName =row[1].toString();
      //      id = Integer.parseInt((String) row[2]);
            dob = row[3].toString();
            startDate = row[7].toString();
            telNumber = row[4].toString();
            email = row[5].toString();
            gender = row[6].toString();
            
         
            

         Employee employee = new Secretary(firstName, lastName, id, telNumber, email);
         employees.addEmployee(employee);
//         System.out.println(employees.getNumerOfEmployees());
//         System.out.println(employees.getEmployeeByName("Fadi"));
//         System.out.println(employees.getEmployeeByName("Taha"));
  

      }
     }
   catch (SQLException e)
   {
      e.printStackTrace();
   }

   return employees;
}

public synchronized void save(Employee employee) throws IOException {
   {

       try {
//            String sql = "SELECT * from \"Clinic\".employee;";
//            ArrayList<Object[]> results = db.query(sql, patient.getFirstName(), patient.getLastName(),
//                    patient.getId(), patient.getDob(), patient.getTelNumber(), patient.getEmail());
 //
//            if (results.size() > 0) {
//                return;
//            }

           String sql = "INSERT INTO \"Clinic\".employee (firstname, lastname, id, dob, telnumber, email, gender, startdate)"
                   + "VALUES (? , ? , ? , ? , ? , ?, ? , ?);";
           db.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId(), employee.getDob(),
                 employee.getTelNumber(), employee.getEamil(),employee.getGender(),employee.getStartDate());

       } catch (SQLException e) {
           e.printStackTrace();
       }
   }





//
//  public static void main( String args[] )
//  {
//    Connection c = null;
//    Statement stmt = null;
//    try {
//    Class.forName("org.postgresql.Driver");
//      c = DriverManager
//         .getConnection("jdbc:postgresql://localhost:5432/postgres",
//         "postgres", "0940");
//      c.setAutoCommit(false);
//      System.out.println("Opened database successfully");
//
//      stmt = c.createStatement();
//      ResultSet rs = stmt.executeQuery( "SELECT * FROM \"Clinic\".employee;" );
//      while ( rs.next() ) {
//         
//         String  firstname = rs.getString("firstname");
//         String  lastname = rs.getString("lastname");
//
//
//         
//   
//         System.out.println( "FNAME = " + firstname );
//         System.out.println( "Lname = " + lastname );
//       
//         System.out.println();
//      }
//      rs.close();
//      stmt.close();
//      c.close();
//    } catch ( Exception e ) {
//      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
//      System.exit(0);
//    }
//    System.out.println("Database query ok ");
//  }
}
}