package main;

import java.io.IOException;

import clients.Client;
import controller.employee.manager.EditEmployeeController;
import view.manager.editemployee.EditEmployeeGUI;

public class EditEmployeeMain 
{
  public static void main(String[] args)  throws IOException, ClassNotFoundException
  {
     Client model = new Client();    
     EditEmployeeGUI view = new EditEmployeeGUI();
     EditEmployeeController conto = new EditEmployeeController(model,view);
     view.start(conto);  
  }
 
 
}