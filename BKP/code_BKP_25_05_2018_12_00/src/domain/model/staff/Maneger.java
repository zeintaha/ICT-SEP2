package domain.model.staff;

import java.util.Date;

public class Maneger extends Employee
{
 

   public Maneger(String userName, String password, String firstName,
         String lastName, int id, Date dob,Date startDate,
         String telNumber, String eamil, char gender)
   {
      super( userName,  password, firstName,
             lastName,  id,  dob, Type.Maneger,  startDate,
             telNumber,  eamil,  gender);


   }

  

}
