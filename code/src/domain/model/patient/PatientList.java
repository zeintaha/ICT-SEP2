package domain.model.patient;

import java.util.ArrayList;

public class PatientList
{
   private ArrayList<Patient> patients;

   public PatientList()
   {
      patients = new ArrayList<Patient>();
   }

   public void addPatient(Patient patien)
   {
      patients.add(patien);

   }

   public void removePatient(Patient patient)
   {
      patients.remove(patient);

   }

   public Patient editPatientName(String oldName, String newName)
   {
  
      for (int i = 0; i < patients.size(); i++)
      {
         if(patients.get(i).getFirstName().equals(oldName)) {
            Patient patient = patients.get(i);
            patient.setFirstName(newName);
            return patient;
         }
         
         else {System.out.println("we can not find that patient with the name " + oldName+ " in out system " );
         
         
      
         }
      }
      return null;
      
   }
   
   public Patient editPatientByPhoneNumbe(String oldPhoneNumber, String newPhoneNumber)
   {
  
      for (int i = 0; i < patients.size(); i++)
      {
         if(patients.get(i).getTelNumber()==oldPhoneNumber) {
            Patient patient = patients.get(i);
            patient.setTelNumber(newPhoneNumber);
            return patient;
         }
         
         else {System.out.println("we can not find that number with the name " + oldPhoneNumber+ " in out system " );
         
         
      
         }
      }
      return null;
      
   }
   
   
   
   public Patient searchPatientByName(String name)
   {
      for (int i = 0; i < patients.size(); i++)
      {
         if (patients.get(i).getFirstName().equals(name))
         {
            return patients.get(i);
         }
      }
      System.out.println(
            " we can not find the patient wiht the name : " + name + "!! ");
      return null;
   }

  
   
   public Patient searchPatientByTelNumber(String number)
   {
      for (int i = 0; i < patients.size(); i++)
      {
         if (patients.get(i).getTelNumber().equals(number))
         {
            return patients.get(i);
         }
      }
      System.out.println(
            " we can not find the patient wiht this Number : " + number + "!! ");
      return null;
   }
   

   
   public Patient searchPatientById(int id)
   {
      for (int i = 0; i < patients.size(); i++)
      {
         if (patients.get(i).getId()==id)
         {
            return patients.get(i);
         }
      }
      System.out.println(
            " we can not find the patient wiht this id : " + id + "!! ");
      return null;
   }

}
