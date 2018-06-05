package main;

import java.io.IOException;

import clients.Client;
import controller.employee.manager.AddEmployeeController;
import view.manager.addemployee.AddEmployeeGUI;

public class MainClientAddEmployee
{

   public static void main(String[] args) throws ClassNotFoundException, IOException
   {
      Client model= new Client();
      AddEmployeeGUI view= new AddEmployeeGUI();
      AddEmployeeController controller=new AddEmployeeController(model, view);
      view.start(controller);
   }

}
