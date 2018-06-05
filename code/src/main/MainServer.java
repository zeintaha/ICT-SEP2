package main;

import java.io.IOException;

import domain.mediator.patient.ServerPatientModelManager;
import domain.mediator.staff.ServerStaffClinicModelManager;

public class MainServer
{

   public static void main(String args[])
         throws IOException, ClassNotFoundException
   {
      ServerStaffClinicModelManager modelServerStaffClinicModelManager = new ServerStaffClinicModelManager();
      ServerPatientModelManager modelServerPatientModelManager = new ServerPatientModelManager();
      
      
   }

}
