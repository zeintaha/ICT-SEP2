package clients;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import domain.mediator.appointment.RemoteAppointmentModel;
import domain.mediator.patient.RemotePatientModel;
import domain.mediator.staff.RemoteStaffClinicModel;
import domain.model.patient.Appointment;
import domain.model.patient.AppointmentList;
import domain.model.patient.Patient;
import domain.model.staff.Employee;

public class Client implements RemoteStaffClinicModel,RemotePatientModel,RemoteAppointmentModel
{
   private RemoteStaffClinicModel StaffServer;
   private RemotePatientModel PatientServer;
   private RemoteAppointmentModel AppointmentServer;

   public Client()
   {
      try
      {
         this.StaffServer = (RemoteStaffClinicModel)Naming.lookup("rmi://localhost:1099/StaffServer");
         this.PatientServer = (RemotePatientModel)Naming.lookup("rmi://localhost:1098/PatientServer");
         this.AppointmentServer = (RemoteAppointmentModel)Naming.lookup("rmi://localhost:1097/AppointmentServer");
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
   @Override
   public ArrayList<Appointment> getAll() throws RemoteException
   {
      
      return AppointmentServer.getAll();
   }
   @Override
   public AppointmentList getAllFreeAppointment() throws RemoteException
   {
      // TODO Auto-generated method stub
      return AppointmentServer.getAllFreeAppointment();
   }
   @Override
   public void AddAppointment(Date date, String brief, int patientId,
         int dateId) throws RemoteException
   {
      AppointmentServer.AddAppointment(date, brief, patientId, dateId);
      
   }
   @Override
   public void removeAppointmentById(int id) throws RemoteException
   {
     AppointmentServer.removeAppointmentById(id);
      
   }
   @Override
   public ArrayList<Appointment> getAppotmenttByDate(Date date)
         throws RemoteException
   {
      // TODO Auto-generated method stub
      return AppointmentServer.getAppotmenttByDate(date);
   }
   @Override
   public int getDateId(Date date) throws RemoteException
   {
      // TODO Auto-generated method stub
      return AppointmentServer.getDateId(date);
   }
   @Override
   public void remove(int id) throws RemoteException
   {
      // TODO Auto-generated method stub
    //  AppointmentServer.removeAppointmentById(id);
      
   }
   @Override
   public void callLoad(String name) throws IOException, RemoteException
   {
      // TODO Auto-generated method stub
      
      
   }
   

}
