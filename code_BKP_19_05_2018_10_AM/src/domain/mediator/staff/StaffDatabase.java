package domain.mediator.staff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StaffDatabase
{


  public static void main( String args[] )
  {
    Connection c = null;
    Statement stmt = null;
    try {
    Class.forName("org.postgresql.Driver");
      c = DriverManager
         .getConnection("jdbc:postgresql://localhost:5432/postgres",
         "postgres", "0940");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully");

      stmt = c.createStatement();
      ResultSet rs = stmt.executeQuery( "SELECT * FROM \"Clinic\".employee;" );
      while ( rs.next() ) {
         
         String  firstname = rs.getString("firstname");
         String  lastname = rs.getString("lastname");


         
   
         System.out.println( "FNAME = " + firstname );
         System.out.println( "Lname = " + lastname );
       
         System.out.println();
      }
      rs.close();
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName()+": "+ e.getMessage() );
      System.exit(0);
    }
    System.out.println("Database query ok ");
  }

}