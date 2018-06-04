package domain.model.staff;

import java.util.Date;

abstract public class Employee
{
   private String userName;
   private String password;
   private String firstName;
   private String lastName;
   private int id;
   private Date dob;
   private Type type;
   private Date startDate;
   private String telNumber;
   private String eamil;
   private char gender;


   public Employee(String firstName, String lastName, int id, String telNumber,
         String eamil)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.id = id;
      this.dob = dob;
      this.startDate = startDate;
      this.telNumber = telNumber;
      this.eamil = eamil;
      this.gender = gender;

   }

   public Employee(String userName, String password, String firstName,
         String lastName, int id, Date dob, Type type, Date startDate,
         String telNumber, String eamil, char gender)
   {
     
      this.userName = userName;
      this.password = password;
      this.firstName = firstName;
      this.lastName = lastName;
      this.id = id;
      this.dob = dob;
      this.type = type;
      this.startDate = startDate;
      this.telNumber = telNumber;
      this.eamil = eamil;
      this.gender = gender;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public void setDob(Date dob)
   {
      this.dob = dob;
   }

   public void setStartDate(Date startDate)
   {
      this.startDate = startDate;
   }

   public void setTelNumber(String telNumber)
   {
      this.telNumber = telNumber;
   }

   public void setEamil(String eamil)
   {
      this.eamil = eamil;
   }

   public void setGender(char gender)
   {
      this.gender = gender;
   }

   public String getFirstName()
   {
      return firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public int getId()
   {
      return id;
   }

   public Date getDob()
   {
      return dob;
   }

   public Date getStartDate()
   {
      return startDate;
   }

   public String getTelNumber()
   {
      return telNumber;
   }
   public Type getType() {
      return type;
   }

   public String getEamil()
   {
      return eamil;
   }

   public char getGender()
   {
      return gender;
   }

   public String toString()
   {
      return "Employee [firstName=" + firstName + ", lastName=" + lastName
            + ", id=" + id + ", dob=" + dob + ", startDate=" + startDate
            + ", telNumber=" + telNumber + ", eamil=" + eamil + ", gender="
            + gender + ", type=" + "]";
   }

}
