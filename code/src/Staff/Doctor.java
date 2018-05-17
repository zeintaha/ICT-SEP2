package Staff;

import java.util.Date;

public class Doctor extends Employee
{

   public Doctor(String firstName, String lastName, int id, Date dob,
         Date startDate, String telNumber, String eamil, char gender, Type type)
   {
      super(firstName, lastName, id, dob, startDate, telNumber, eamil, gender, type);
   }

}
