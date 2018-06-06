package controller.employee.manager;

import java.io.IOException;
import java.rmi.RemoteException;

import clients.Client;
import view.manager.searchemployee.SearchEmployeeGUI;
import view.manager.searchemployee.SearchEmployeeView;
import view.secretary.appointment.addappointment.AddAppointmentGUI;

public class SearchEmployeeController
{
   private Client clientStaff;
   private SearchEmployeeView searchEmployee;

   public SearchEmployeeController(Client clientStaff,
         SearchEmployeeView searchEmployee)
         throws ClassNotFoundException, IOException
   {

      this.clientStaff = new Client();

      this.searchEmployee = searchEmployee;

   }

   public void executes() throws RemoteException
   {
      String name = ((SearchEmployeeGUI) searchEmployee).get();
            if ( name.length()>1) {
               
               
               name= name.substring(0, 1)
           .toUpperCase()
           + ((SearchEmployeeGUI) searchEmployee).get().substring(1)
                 .toLowerCase();
           }
      
      try
      {
         clientStaff.callLoadStaff(name);

      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      searchEmployee.showTable(clientStaff.getAllEmployeesFromTheList());
   }

}
