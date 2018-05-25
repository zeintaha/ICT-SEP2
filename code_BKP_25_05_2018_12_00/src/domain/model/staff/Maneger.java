package domain.model.staff;

import java.util.Date;

public class Maneger extends Employee
{
 

   public Maneger(String userName, String password, String firstName,
         String lastName, int id, Date dob, Type type, Date startDate,
         String telNumber, String eamil, char gender)
   {
      super( userName,  password, firstName,
             lastName,  id,  dob,  type,  startDate,
             telNumber,  eamil,  gender);
      type = Type.Maneger;

   }

  

}
