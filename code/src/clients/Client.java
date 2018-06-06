package clients;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import domain.mediator.patient.RemotePatientModel;
import domain.mediator.staff.RemoteStaffClinicModel;
import domain.model.patient.Patient;
import domain.model.staff.Employee;

public class Client
{
   private RemoteStaffClinicModel StaffServer;
   private RemotePatientModel PatientServer;

   public Client()
   {
      try
      {
         this.StaffServer = (RemoteStaffClinicModel)Naming.lookup("rmi://localhost:1099/StaffServer");
         this.PatientServer = (RemotePatientModel)Naming.lookup("rmi://localhost:1098/PatientServer");
      }
      catch (MalformedURLException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (RemoteException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (NotBoundException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   public void addOneEmployee(String[] employeeData) throws RemoteException {
      StaffServer.addOneEmployee(employeeData);
   }

   public ArrayList<Employee> getEmployeeByname(String name)
         throws RemoteException
   {
      
      return StaffServer.getEmployeeByname(name);
   }

   public void removeStaff(int id) throws RemoteException
   {
      
      StaffServer.remove(id);
   }

   public String[] reachType() throws RemoteException
   {
      return StaffServer.reachType();
   }

   public void callLoadStaff(String name) throws IOException, RemoteException
   {
      StaffServer.callLoad(name);
   }
   
   public void callLoadPateint(String name) throws IOException, RemoteException
   {
      PatientServer.callLoad(name);
   }

   public ArrayList<Employee> getAllEmployeesFromTheList()
         throws RemoteException
   {
      return StaffServer.getAllEmployeesFromTheList();
   }
   
   public void addPatient(String[] patientData) throws RemoteException
   {
      PatientServer.addPatient(patientData);
   }

   public void removePatient(int id) throws RemoteException
   {
      PatientServer.remove(id);
   }

   public ArrayList<Patient> getPatientByName(String name)
         throws RemoteException
   {
      return PatientServer.getPatientByName(name);
   }

   public void callLoadPatient(String name) throws IOException, RemoteException
   {
      PatientServer.callLoad(name);
   }

   public ArrayList<Patient> getAllPatientsFromTheList() throws RemoteException
   {
      return PatientServer.getAllPatientsFromTheList();
   }
   

}
