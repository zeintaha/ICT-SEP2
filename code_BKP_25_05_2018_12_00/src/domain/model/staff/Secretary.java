package domain.model.staff;

import java.util.Date;

public class Secretary extends Employee
{
  

   public Secretary(String userName, String password, String firstName,
         String lastName, int id, Date dob,  Date startDate,
         String telNumber, String eamil, char gender)
   {
      super(userName, password, firstName, lastName, id, dob,Type.Secratary , startDate,
            telNumber, eamil, gender);
  

   }

   public Secretary(String firstName, String lastName, int id, String telNumber,
         String email)
   {
      super(firstName, lastName, id, telNumber, email);
   }

  

}
