package domain.model.staff;

import java.util.Date;

public class Maneger extends Employee
{
   private Type type;

   public Maneger(String firstName, String lastName, int id, Date dob,
         Date startDate, String telNumber, String eamil, char gender, Type type)
   {
      super(firstName, lastName, id, dob, startDate, telNumber, eamil, gender);
      this.type = Type.Doctor;

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
