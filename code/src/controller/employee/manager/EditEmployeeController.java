package controller.employee.manager;

import java.io.IOException;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import clients.Client;

import domain.mediator.staff.StaffDatabase;
import domain.model.staff.Employee;
import view.manager.editemployee.EditEmployeeGUI;

public class EditEmployeeController
{
   private Client client;

   private EditEmployeeGUI editEmployeeGUI;

   private StaffDatabase persistence;

   private Employee employee;

   public EditEmployeeController(Client client,
         EditEmployeeGUI editEmployeeGUI)
         throws ClassNotFoundException, IOException
   {

      this.client = client;
      this.editEmployeeGUI = editEmployeeGUI;
   }

   public void executes(String what) throws RemoteException
   {

      switch (what)
      {

         case "Search":

            String name = " ";
            name = editEmployeeGUI.getSearchTxtValue();

            try
            {
               client.callLoadStaff(name);
            }
            catch (IOException e)
            {

               e.printStackTrace();
            }

            int[] ides = new int[client.getAllEmployeesFromTheList()
                  .size()];
            for (int i = 0; i < ides.length; i++)
            {
               ides[i] = client.getAllEmployeesFromTheList().get(i)
                     .getId();

            }

            editEmployeeGUI.setComboboxValue(ides);

            break;

         case "pickcmbBox":
            int id = editEmployeeGUI.getSelectedValueCmbox();
            Employee emp = client.getEmployeeById(id);

            editEmployeeGUI.setFirstName(emp.getFirstName());
            editEmployeeGUI.setLastName(emp.getLastName());
            editEmployeeGUI.setDOB(emp.getDob());
            editEmployeeGUI.setTel(emp.getTelNumber());
            editEmployeeGUI.setEmail(emp.getEmail());
            editEmployeeGUI.setGender(emp.getGender());
            editEmployeeGUI.setStartDate(emp.getStartDate());

            
            System.out.println("ComboBox");

            break;

         case "Save":
            int id1 = editEmployeeGUI.getSelectedValueCmbox();
            String firstName = editEmployeeGUI.getFirstName();
            String lastName = editEmployeeGUI.getLastName();
            String telNumber = editEmployeeGUI.getTel();
            String email = editEmployeeGUI.getEmail();
            String gender = editEmployeeGUI.getGender();
            String startDate = editEmployeeGUI.getStartDate();


            String dob = editEmployeeGUI.getDate();
                  
            Employee emp2 = client.getEmployeeById(id1); 
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
       
            
            
         
            SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd-yyyy");
            java.util.Date date = null;
            try
            {
               date = sdf1.parse(startDate);
            }
            catch (java.text.ParseException e)
            {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime()); 
            


            SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
            java.util.Date date1 = null;
            try
            {
               date1 = sdf2.parse(dob);
            }
            catch (java.text.ParseException e)
            {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            java.sql.Date sqlDOB = new java.sql.Date(date1.getTime()); 
            
            emp2.setFirstName(firstName);
            emp2.setLastName(lastName);
            emp2.setTelNumber(telNumber);
            emp2.setEmail(email);
            emp2.setGender(gender);
            emp2.setDob(sqlDOB);
            emp2.setStartDate(sqlStartDate);
            
            
            
            
            
            client.updateEmployee(emp2);

            System.out.println("Save");

         default:

            break;
      }

   }

}