package domain.model.patient;

import java.util.Date;

public class Patient
{
   private String firstName;
   private String lastName;
   private int id;
   private String email;
   private Date dob;
   private String telNumber;

   public Patient(String firstName, String lastName, int id, String email,
         Date dob, String telNumber)
   {

      this.firstName = firstName;
      this.lastName = lastName;
      this.id = id;
      this.email = email;
      this.dob = dob;
      this.telNumber = telNumber;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public int getId()
   {
      return id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public Date getDob()
   {
      return dob;
   }

   public void setDob(Date dob)
   {
      this.dob = dob;
   }

   public String getTelNumber()
   {
      return telNumber;
   }

   public void setTelNumber(String telNumber)
   {
      this.telNumber = telNumber;
   }

   public String toString()
   {
      return "Patient [firstName=" + firstName + ", lastName=" + lastName
            + ", id=" + id + ", email=" + email + ", dob=" + dob
            + ", telNumber=" + telNumber + "]";
   }

}
