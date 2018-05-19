package domain.model.staff;

import java.util.Date;

public class Secretary extends Employee
{
private Type type;
//   public Secretary(String firstName, String lastName, int id, Date dob,
//         Date startDate, String telNumber, String eamil, char gender, Type type)
//   {
//      super(firstName, lastName, id, dob, startDate, telNumber, eamil, gender);
//      this.type = Type.Doctor;
//   }

   public Secretary(String firstName, String lastName, int id, String dob,
         String telNumber, String email, String gender, String startDate,
         Object type2)
   {
     super(firstName, lastName, id, dob, telNumber, email, gender, startDate);
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
