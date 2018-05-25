package domain.model.staff;

import java.util.Date;

public class Doctor extends Employee
{
   private Type type;

   public Doctor(String userName, String password, String firstName,
         String lastName, int id, Date dob, Type type, Date startDate,
         String telNumber, String eamil, char gender)
   {
      super( userName,  password, firstName,
             lastName,  id,  dob,  type,  startDate,
             telNumber,  eamil,  gender);
      type = Type.Doctor;

   }
   public Type getType()
   {
      return type;
   }

   public void setType(Type type)
   {
      this.type = type;
   }

}
