package domain.model.staff;

import java.util.Date;

public class Secretary extends Employee
{
private Type type;




   public Secretary(String firstName, String lastName, int id, String telNumber,
      String email)
{
   super(firstName,lastName,id, telNumber,email);
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
